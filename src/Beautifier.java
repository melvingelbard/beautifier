import java.util.regex.Pattern;
import java.util.stream.Collectors;


// TODO: handle quote escaping (e.g. "key": "\"")
// TODO: catch AssertionExceptions
public class Beautifier {

    private static String tabString = "    ";
    private static String doubleQuotePattern = "\"([^\"\\\\]|\\\\.)*\"";
    private static String inLineCommentPattern = "\\/\\/.*$";
    private static String oneLineIfPattern = "(else\\s?)?if\\s?\\(.*\\)$";
    private static String oneLineElsePattern = "\\}?else$";

    public static String beautifyJson(String text) {
        int pointer = 0;
        String out = "";
        int braces = 0;
        int brackets = 0;
        int currentIndent = 0;
        boolean insideString = false;

        // Trim each line and remove new lines
        text = text.lines().map(line -> line.trim()).collect(Collectors.joining());

        while (pointer < text.length()) {
            char c = text.charAt(pointer);
            if (c == '"') { // TODO: Check for single quote as well?
                insideString = !insideString;
                out += c;
            } else if (!insideString) {
                if (c == '{') {
                    braces++;
                    out += c + System.lineSeparator() + repeat(++currentIndent, tabString);
                } else if (c == '}') {
                    braces--;
                    out += System.lineSeparator() + repeat(--currentIndent, tabString) + c;
                } else if (c == '[') {
                    brackets++;
                    out += c + System.lineSeparator() + repeat(++currentIndent, tabString);
                } else if (c == ']') {
                    brackets--;
                    out += System.lineSeparator() + repeat(--currentIndent, tabString) + c;
                } else if (c == ',') {
                    // Ignore space if there is one
                    if (pointer+1 < text.length() && text.charAt(pointer+1) == ' ')
                        pointer++;
                    out += c + System.lineSeparator() + repeat(currentIndent, tabString);
                } else if (c == ':') {
                    out += c;
                    // Add space if there isn't one
                    if (pointer+1 < text.length() && text.charAt(pointer+1) != ' ')
                        out += ' ';
                } else
                    out += c;
            } else
                out += c;

            pointer++;
        }

        assert braces == 0;
        assert brackets == 0;
        return out;
    }

    // TODO: Handle no-parenthesis if statement with multi-line conditions
    public static String beautifyGroovy(String text) {
        String out = "";
        int currentIndent = 0;
        boolean isComment = false;
        boolean oneLineStatement = false;

        // Trim each line
        var lines = text.lines().map(line -> line.trim()).collect(Collectors.toList());
        for (String line: lines) {
            if (line.contains("/*")) {
                isComment = true;
                if (line.substring(line.indexOf("/*")).contains("\\*"))
                    isComment = false;
                out += repeat(currentIndent, tabString) + line + System.lineSeparator();
            } else if (line.contains("*/")) {
                isComment = false;
                out += repeat(currentIndent, tabString) + line + System.lineSeparator();
            } else {
                if (!isComment) {
                    var cleanString = line.replaceAll(doubleQuotePattern, "").replaceAll(inLineCommentPattern, "").trim();
                    var indentCount = cleanString.replaceAll("[^{]", "").length() - cleanString.replaceAll("[^}]", "").length();
                    if (cleanString.contains("{") || cleanString.contains("}")) {
                        if (indentCount > 0) {
                            out += repeat(currentIndent, tabString) + line + System.lineSeparator();
                            currentIndent++;
                            continue;
                        } else if (indentCount < 0) {
                            currentIndent--;
                        }
                    } else if (Pattern.matches(oneLineIfPattern, cleanString) || Pattern.matches(oneLineElsePattern, cleanString)) {
                        out += repeat(currentIndent++, tabString) + line + System.lineSeparator();
                        oneLineStatement = true;
                        continue;
                    }
                    if (oneLineStatement) {
                        // If we were in a one-line statement, we're not anymore
                        oneLineStatement = false;
                        out += repeat(currentIndent--, tabString) + line + System.lineSeparator();
                        continue;
                    }
                }
                out += repeat(currentIndent, tabString) + line + System.lineSeparator();
            }
        }
        return out;
    }

    /**
     * Repeat the {@code word} {@code count} times.
     * <p>
     * Based on https://stackoverflow.com/questions/2255500/can-i-multiply-strings-in-java-to-repeat-sequences
     * @param count How many time to repeat the word
     * @param word  The word to repeat
     * @return      the repeated word as a String
     */
    public static String repeat(int count, String word) {
        if (count <= 0)
            return "";
        return new String(new char[count]).replace("\0", word);
    }
}