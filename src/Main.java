public class Main {

    public static void main(String[] args) {
        String json = "[{\"some]thing\":5}]";
        System.out.println(Beautifier.beautifyJson(json));

        json = "[{\"some]thing\":5,\"else\":36.4}]";
        System.out.println(Beautifier.beautifyJson(json));

        json = "[\n" +
                "    \"JSON Test Pattern pass1\",\n" +
                "    {\"object with 1 member\":[\"array with 1 element\"]},\n" +
                "    {},\n" +
                "    [],\n" +
                "    -42,\n" +
                "    true,\n" +
                "    false,\n" +
                "    null,\n" +
                "    {\n" +
                "        \"integer\": 1234567890,\n" +
                "        \"real\": -9876.543210,\n" +
                "        \"e\": 0.123456789e-12,\n" +
                "        \"E\": 1.234567890E+34,\n" +
                "        \"\":  23456789012E66,\n" +
                "        \"zero\": 0,\n" +
                "        \"one\": 1,\n" +
                "        \"space\": \" \",\n" +
                "        \"quote\": \"\\\"\",\n" +
                "        \"backslash\": \"\\\\\",\n" +
                "        \"controls\": \"\\b\\f\\n\\r\\t\",\n" +
                "        \"slash\": \"/ & \\/\",\n" +
                "        \"alpha\": \"abcdefghijklmnopqrstuvwyz\",\n" +
                "        \"ALPHA\": \"ABCDEFGHIJKLMNOPQRSTUVWYZ\",\n" +
                "        \"digit\": \"0123456789\",\n" +
                "        \"0123456789\": \"digit\",\n" +
                "        \"special\": \"`1~!@#$%^&*()_+-={':[,]}|;.</>?\",\n" +
                "        \"hex\": \"\\u0123\\u4567\\u89AB\\uCDEF\\uabcd\\uef4A\",\n" +
                "        \"true\": true,\n" +
                "        \"false\": false,\n" +
                "        \"null\": null,\n" +
                "        \"array\":[  ],\n" +
                "        \"object\":{  },\n" +
                "        \"address\": \"50 St. James Street\",\n" +
                "        \"url\": \"http://www.JSON.org/\",\n" +
                "        \"comment\": \"// /* <!-- --\",\n" +
                "        \"# -- --> */\": \" \",\n" +
                "        \" s p a c e d \" :[1,2 , 3\n" +
                "\n" +
                ",\n" +
                "\n" +
                "4 , 5        ,          6           ,7        ],\"compact\":[1,2,3,4,5,6,7],\n" +
                "        \"jsontext\": \"{\\\"object with 1 member\\\":[\\\"array with 1 element\\\"]}\",\n" +
                "        \"quotes\": \"&#34; \\u0022 %22 0x22 034 &#x22;\",\n" +
                "        \"\\/\\\\\\\"\\uCAFE\\uBABE\\uAB98\\uFCDE\\ubcda\\uef4A\\b\\f\\n\\r\\t`1~!@#$%^&*()_+-=[]{}|;:',./<>?\"\n" +
                ": \"A key can be any string\"\n" +
                "    },\n" +
                "    0.5 ,98.6\n" +
                ",\n" +
                "99.44\n" +
                ",\n" +
                "\n" +
                "1066,\n" +
                "1e1,\n" +
                "0.1e1,\n" +
                "1e-1,\n" +
                "1e00,2e+00,2e-00\n" +
                ",\"rosebud\"]";

        System.out.println(Beautifier.beautifyJson(json));


        // No change needed
        String script = "print(\"Hello\")";
        System.out.println(Beautifier.beautifyGroovy(script));
        System.out.println("_____");

        // Missing indent at line 2
        script = "doSomething() {\n" +
                "print(\"hello!{}\") \n" +
                "}";
        System.out.println(Beautifier.beautifyGroovy(script));

        // Missing indent at line 2 & javadocs are wrongly-indented
        script = "        /**\n" +
                "         * the javadocs\n" +
                "         */ \n" +
                "doSomething() {\n" +
                "print(\"hello!{}\") \n" +
                "}";
        System.out.println(Beautifier.beautifyGroovy(script));

        // If-else
        script = "if (melvin)\n" +
                "print(\"if\")\n" +
                "else\n" +
                "print(\"else\")";
        System.out.println(Beautifier.beautifyGroovy(script));


        // Script from forum, with all indents removed
        script = "/**\n" +
                " * Script to help import Visium spot locations into QuPath for visualization on a whole slide image, and export the\n" +
                " * data supplemented by further information (e.g. regarding spot locations relative to annotated tissue components,\n" +
                " * or numbers of cells detected within each spot).\n" +
                " *\n" +
                " * The script is written for QuPath v0.2.\n" +
                " * It may work with later versions (but may not).\n" +
                " * It doesn't work with earlier versions.\n" +
                " *\n" +
                " * To run the script, drag it on top of QuPath and choose 'Run -> Run' from the script editor menu.\n" +
                " *\n" +
                " * The script has been written using some public documentation describing file formats, but has been tested only\n" +
                " * on the limited data available during development. Bugs, misinterpretations or unsupported differences in files\n" +
                " * generated elsewhere may well exist. In short, I've done my best - but if you choose to rely on this script for any\n" +
                " * purpose, please take care and validate it yourself!\n" +
                " *\n" +
                " * Questions about QuPath can be posted at https://forum.image.sc/tag/qupath\n" +
                " *\n" +
                " * @author Pete Bankhead\n" +
                " *\n" +
                " *\n" +
                " * MIT License\n" +
                " *\n" +
                " * Copyright (c) 2020 Peter Bankhead, The University of Edinburgh\n" +
                " *\n" +
                " * Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                " * of this software and associated documentation files (the \"Software\"), to deal\n" +
                " * in the Software without restriction, including without limitation the rights\n" +
                " * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                " * copies of the Software, and to permit persons to whom the Software is\n" +
                " * furnished to do so, subject to the following conditions:\n" +
                " *\n" +
                " * The above copyright notice and this permission notice shall be included in all\n" +
                " * copies or substantial portions of the Software.\n" +
                " *\n" +
                " * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                " * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                " * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
                " * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                " * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                " * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n" +
                " * SOFTWARE.\n" +
                " */\n" +
                "\n" +
                "\n" +
                "\n" +
                "import javafx.geometry.Insets\n" +
                "import javafx.scene.Node\n" +
                "import javafx.scene.Scene\n" +
                "import javafx.scene.control.*\n" +
                "import javafx.scene.layout.*\n" +
                "import javafx.scene.paint.Color\n" +
                "import javafx.scene.shape.Circle\n" +
                "import javafx.stage.Stage\n" +
                "import javafx.stage.FileChooser;\n" +
                "import org.bytedeco.javacpp.PointerScope\n" +
                "import org.bytedeco.opencv.global.opencv_calib3d\n" +
                "import org.bytedeco.opencv.opencv_core.Mat\n" +
                "import org.locationtech.jts.geom.Coordinate\n" +
                "import qupath.lib.analysis.DistanceTools\n" +
                "import qupath.lib.common.GeneralTools\n" +
                "import qupath.lib.gui.ActionTools\n" +
                "import qupath.lib.gui.commands.ProjectCommands\n" +
                "import qupath.lib.gui.dialogs.Dialogs\n" +
                "import qupath.lib.gui.tools.GuiTools\n" +
                "import qupath.lib.gui.tools.PaneTools\n" +
                "import qupath.lib.gui.viewer.tools.PathTool\n" +
                "import qupath.lib.gui.viewer.tools.PathTools\n" +
                "import qupath.lib.images.ImageData\n" +
                "import qupath.lib.images.servers.PixelCalibration\n" +
                "import qupath.lib.images.servers.RotatedImageServer.Rotation\n" +
                "import qupath.lib.images.servers.TransformedServerBuilder\n" +
                "import qupath.lib.objects.DefaultPathObjectComparator\n" +
                "import qupath.lib.objects.PathDetectionObject\n" +
                "import qupath.lib.objects.PathObject\n" +
                "import qupath.lib.objects.PathObjectFilter\n" +
                "import qupath.lib.objects.PathObjectTools\n" +
                "import qupath.lib.objects.PathObjects\n" +
                "import qupath.lib.objects.classes.PathClass\n" +
                "import qupath.lib.objects.classes.PathClassFactory\n" +
                "import qupath.lib.objects.hierarchy.PathObjectHierarchy\n" +
                "import qupath.lib.projects.Project\n" +
                "import qupath.lib.projects.Projects\n" +
                "import qupath.lib.regions.ImagePlane\n" +
                "import qupath.lib.regions.ImageRegion\n" +
                "import qupath.lib.regions.RegionRequest\n" +
                "import qupath.lib.roi.EllipseROI\n" +
                "import qupath.lib.roi.ROIs\n" +
                "import qupath.lib.roi.interfaces.ROI\n" +
                "\n" +
                "import java.awt.geom.AffineTransform\n" +
                "import java.awt.geom.Point2D\n" +
                "import java.awt.image.BufferedImage\n" +
                "import java.nio.charset.StandardCharsets\n" +
                "import java.nio.file.Files\n" +
                "import java.nio.file.Path\n" +
                "import java.util.function.Function\n" +
                "import java.util.function.Predicate\n" +
                "import java.util.stream.Collectors\n" +
                "\n" +
                "import static qupath.lib.gui.scripting.QPEx.*\n" +
                "\n" +
                "boolean interactive = true\n" +
                "\n" +
                "if (interactive)\n" +
                "new SpotWizard().show()\n" +
                "else {\n" +
                "println 'Non-interactive version not written! But you can call methods in the Tasks class if needed.'\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Class to create the wizard GUI to guide the user through the workflow.\n" +
                " */\n" +
                "class SpotWizard {\n" +
                "\n" +
                "private String title\n" +
                "private Accordion accordion = new Accordion()\n" +
                "private Stage stage\n" +
                "\n" +
                "SpotWizard(String title = Tasks.TITLE) {\n" +
                "this.title = title\n" +
                "}\n" +
                "\n" +
                "private buildStage() {\n" +
                "int count = 1\n" +
                "\n" +
                "accordion.getPanes().setAll(\n" +
                "new TitledPane(\"Step ${count++}: Run Pixel Classifier\", createRunPixelClassifier())\n" +
                ")\n" +
                "\n" +
                "def pane = new BorderPane()\n" +
                "pane.setCenter(accordion)\n" +
                "accordion.setExpandedPane(accordion.getPanes()[0])\n" +
                "def scene = new Scene(pane, 500, 600)\n" +
                "stage = new Stage()\n" +
                "stage.setScene(scene)\n" +
                "stage.setTitle(this.title)\n" +
                "stage.initOwner(getQuPath().getStage())\n" +
                "}\n" +
                "\n" +
                "Stage getStage() {\n" +
                "if (stage == null)\n" +
                "buildStage()\n" +
                "return stage\n" +
                "}\n" +
                "\n" +
                "void show() {\n" +
                "GuiTools.runOnApplicationThread { -> getStage().show()}\n" +
                "}\n" +
                "\n" +
                "//    private void expandNext() {\n" +
                "//        def pane = accordion.getExpandedPane()\n" +
                "//        if (pane == null)\n" +
                "//            return\n" +
                "//        def panes = accordion.getPanes()\n" +
                "//        int ind = panes.indexOf(pane)\n" +
                "//        if (ind >= 0 && ind < panes.size()-1)\n" +
                "//            accordion.setExpandedPane(panes.get(ind+1))\n" +
                "//    }\n" +
                "\n" +
                "private Pane createRunPixelClassifier()\n" +
                "{\n" +
                "def gridPane = new GridPane();\n" +
                "def classLabel = new Label(\"Pixel Classifier:\")\n" +
                "def textField = new TextField()\n" +
                "def fileBtn = new Button(\"Browse\")\n" +
                "def projectPath = currentProjectOrNull().getPath().getParent().toString()\n" +
                "\n" +
                "fileBtn.setOnAction(value ->  {\n" +
                "  \n" +
                "FileChooser fileChooser = new FileChooser();\n" +
                "def recordsDir = new File(projectPath+\"/classifiers/pixel_classifiers\")\n" +
                "if (!recordsDir.exists())\n" +
                "recordsDir = new File(projectPath)\n" +
                "fileChooser.setInitialDirectory(recordsDir)\n" +
                "fileChooser.getExtensionFilters().addAll(\n" +
                "new FileChooser.ExtensionFilter(\"Pixel Classifier\", \"*.json\"),\n" +
                "new FileChooser.ExtensionFilter(\"All files\", \"*.*\")\n" +
                ");\n" +
                "File selectedFile = fileChooser.showOpenDialog(stage);\n" +
                "if (selectedFile != null)\n" +
                "{\n" +
                "textField.setText(selectedFile.getPath());\n" +
                "} \n" +
                "})\n" +
                "\n" +
                "gridPane.add(classLabel, 0, 0, 1, 1)\n" +
                "gridPane.add(textField, 1, 0, 1, 1)\n" +
                "gridPane.add(fileBtn, 2, 0, 1, 1)\n" +
                "\n" +
                "def runBtn = new Button(\"Run\")\n" +
                "\n" +
                "runBtn.setOnAction(value ->  {\n" +
                "\n" +
                "selectAnnotations()\n" +
                "addPixelClassifierMeasurements(\"RTrees_Low_From_WholeImages\", \"RTrees_Low_From_WholeImages\")           \n" +
                "//ERRORR: Unable to find pixel classifier RTrees_Low_From_WholeImages java.lang.IllegalArgumentException: Unable to find pixel classifier RTrees_Low_From_WholeImages\n" +
                "//also: annotations are not selected to begin with\n" +
                "\n" +
                "\n" +
                "//selectAnnotations()\n" +
                "//def classifier = loadPixelClassifier(textField.getText())\n" +
                "//addPixelClassifierMeasurements(textField.getText(), \"RTrees_Low_From_WholeImages\")           \n" +
                "   \n" +
                "//other attempts that failed\n" +
                "//def anonotations = getAnnotations()\n" +
                "\n" +
                "//def imageData = getQuPath().getImageData()  \n" +
                "//def classifier = loadPixelClassifier(textField.getText())\n" +
                "//classifyDetectionsByCentroid(textField.getText())\n" +
                "//PixelClassifierToPixelClassifierTools.classifyDetectionsByCentroidols.addPixelClassifierMeasurements(classifier,\"RTrees_Low_From_WholeImages\")\n" +
                "//def predictionServer = PixelClassifierTools.createPixelClassificationServer(imageData, classifier)\n" +
                "//def mManager = PixelClassifierTools.createPixelClassificationServer(imageData, classifier)        \n" +
                "})\n" +
                "def pane = new BorderPane()\n" +
                "pane.setCenter(gridPane)\n" +
                "pane.setBottom(runBtn)\n" +
                "return pane\n" +
                "\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a basic instruction Pane with a standardized layout.\n" +
                " * @param text instruction text\n" +
                " * @param bottom optional thing to put at the bottom (usually a pane containing buttons)\n" +
                " * @param right optional thing to put on the right (usually an icon, or nothing)\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createStandardPane(String text, Node bottom = null, Node right = null) {\n" +
                "def pane = new BorderPane()\n" +
                "pane.setCenter(createInstructionTextArea(text))\n" +
                "if (right != null)\n" +
                "pane.setRight(right)\n" +
                "if (bottom != null)\n" +
                "pane.setBottom(bottom)\n" +
                "return pane\n" +
                "}\n" +
                "\n" +
                "private Pane createTestPane()\n" +
                "{\n" +
                "def textArea = new TextArea(\"test\")\n" +
                "textArea.setWrapText(true)\n" +
                "textArea.setEditable(true)\n" +
                "def btn = new Button(\"print\")\n" +
                "btn.setOnAction { e -> btn.setText(textArea.text)}\n" +
                "\n" +
                "def pane = new BorderPane()\n" +
                "pane.setCenter(textArea)\n" +
                "pane.setBottom(btn)\n" +
                "return pane\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Wrap buttons in a pane for display, if needed.\n" +
                " * This can be used to standardize things like layout or padding.\n" +
                " * @param buttons\n" +
                " * @return\n" +
                " */\n" +
                "private Node createStandardButtons(Button... buttons) {\n" +
                "for (def button in buttons)\n" +
                "button.setMaxWidth(Double.MAX_VALUE)\n" +
                "if (buttons.size() == 1)\n" +
                "return buttons[0]\n" +
                "return PaneTools.createColumnGrid(buttons as Node[])\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane giving an overview of the workflow.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createOverviewPane() {\n" +
                "def text = \"Workflow to associate QuPath cells and annotations with Visium spatial genomics spot data.\\n\\n\" +\n" +
                "\"This makes it possible to identify spot locations within full-resolution whole slide images, \" +\n" +
                "\"exporting this data for downstream analysis.\\n\\n\" +\n" +
                "\"To run this, you will need:\\n\" +\n" +
                "\"* A whole slide image open within a QuPath project\\n\" +\n" +
                "\"* A .gpr file containing the slide layout information\\n\" +\n" +
                "\"* A visium-v1_coordinates.txt file containing the barcode whitelist (optional)\\n\\n\" +\n" +
                "\"Note that it it is *highly* recommended to follow the steps below in order!\\n\" +\n" +
                "\"This is not strictly enforced in case you sometimes really need to return to an earlier step.\"\n" +
                "return createStandardPane(text)\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to check the image orientation.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createCheckOrientationPane() {\n" +
                "def text = \"Check that the image is oriented so that the 'hourglass' shape is at the top left, and 'unfilled circle' at the bottom right.\\n\\n\" +\n" +
                "\"If it isn't, choose one of the options below to rotate the image & reimport it to the project.\"\n" +
                "def buttons = createStandardButtons(\n" +
                "createRotateButton(Rotation.ROTATE_90),\n" +
                "createRotateButton(Rotation.ROTATE_180),\n" +
                "createRotateButton(Rotation.ROTATE_270)\n" +
                ")\n" +
                "def paneIcons = new FrameIconBuilder().buildCornersIcon()\n" +
                "createStandardPane(text, buttons, paneIcons)\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to annotate the entire tissue.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createAnnotateTissuePane() {\n" +
                "def text = \"Create a single annotation surrounding the entire tissue, then click the button below to confirm it.\\n\\n\" +\n" +
                "\"The annotation will then be classified and locked to prevent further editing.\\n\\n\" +\n" +
                "\"Note: If you need to edit the annotation again later, you will have to right-click on it and set it to be unlocked.\"\n" +
                "def btn = new Button(\"Confirm tissue annotation\")\n" +
                "btn.setOnAction { e -> Tasks.confirmTissue(currentImageOrNull()) }\n" +
                "return createStandardPane(text, createStandardButtons(btn), new VBox(createAnnotationButtons(true)))\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to annotate regions of interest.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createAnnotateRegionsPane() {\n" +
                "def text = \"Optionally add annotations for specific areas of interest (e.g. necrosis, tumor) \" +\n" +
                "\"and manually assign classifications to these (under the 'Annotations' tab).\\n\\n\" +\n" +
                "\"If available, distances between each spot and each annotation class will be calculated \" +\n" +
                "\"and export along with all other spot data in the final step.\\n\\n\" +\n" +
                "\"This can be useful to locate spots within or near to particular tissue components during downstream analysis.\"\n" +
                "def btn = new Button(\"Confirm region annotations\")\n" +
                "btn.setOnAction { e -> Tasks.confirmRegions(currentImageOrNull()) }\n" +
                "return createStandardPane(text, createStandardButtons(btn), new VBox(createAnnotationButtons(true)))\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to detect cells.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createCellDetectionPane() {\n" +
                "def text = \"Optionally run cell detection. \" +\n" +
                "\"This allows cells to be counted within spots later and included in any export.\\n\\n\" +\n" +
                "\"You can run QuPath's cell detection command on the entire tissue annotation, but if you have \" +\n" +
                "\"multiple annotations this can become confusing and error-prone (e.g. detecting the same cells twice \" +\n" +
                "\"in different annotations).\\n\\n\"\n" +
                "\"To avoid this you can instead apply the following steps:\\n\" +\n" +
                "\"1 - Create a duplicate image, containing only the entire tissue annotation\\n\" +\n" +
                "\"2 - Detect & optionally classify cells in the duplicate image\\n\" +\n" +
                "\"3 - Import the cells from the duplicate image.\\n\\n\" +\n" +
                "\"For cell detection you can use any QuPath commands - see \" +\n" +
                "\"https://qupath.readthedocs.io/en/latest/docs/tutorials/cell_detection.html for details\"\n" +
                "\n" +
                "def btnDuplicate = new Button(\"Create duplicate image\")\n" +
                "btnDuplicate.setOnAction {e -> Tasks.addCellDetectionImage(currentProjectOrNull(), currentImageOrNull()) }\n" +
                "\n" +
                "def btnImportCells = new Button(\"Import cells\")\n" +
                "btnImportCells.setOnAction {e -> Tasks.importCells(currentProjectOrNull(), currentImageOrNull()) }\n" +
                "\n" +
                "return createStandardPane(text, createStandardButtons(btnDuplicate, btnImportCells))\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to import spots.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createSpotsPane() {\n" +
                "def text = \"Draw ellipse annotations around the 4 corner markers in the image (illustrated in red).\\n\\n\" +\n" +
                "\"Then click 'Create spots' to import the spots and align them according to the corner markers.\\n\\n\" +\n" +
                "\"Reading the spot data requires\\n\" +\n" +
                "\"* A .gpr file containing the slide layout information\\n\" +\n" +
                "\"* A visium-v1_coordinates.txt file containing the barcode whitelist (optional)\\n\\n\" +\n" +
                "\"If you copy these files to be within the current QuPath project, QuPath will automatically find them.\\n\\n\" +\n" +
                "\"The coordinates.txt file is needed if you want the barcodes to be associated with each spot, \" +\n" +
                "\"because these are normally absent from the .gpr file. \" +\n" +
                "\"Alternatively, if a 'barcode' column is available within the .gpr file this will be used instead.\\n\\n\" +\n" +
                "\"Note: You will be prompted by a block ID. You can check if this is correct by looking at the markers in the \" +\n" +
                "\"top left of the image; the 'empty' circle to the right of the hourglass appears in a different location for each block.\\n\\n\"\n" +
                "def btn = new Button(\"Create spots\")\n" +
                "btn.setOnAction {e -> Tasks.importSpots(currentImageOrNull()) }\n" +
                "def paneIcons = new FrameIconBuilder().buildCornersIcon(new Color(0.8, 0.2, 0.2))\n" +
                "def paneDrawing = new BorderPane(createAnnotationButtons(false, PathTools.MOVE, PathTools.ELLIPSE))\n" +
                "def paneRight = new BorderPane(paneIcons)\n" +
                "paneRight.setTop(paneDrawing)\n" +
                "return createStandardPane(text, createStandardButtons(btn), paneRight)\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane inviting the user to export spot data.\n" +
                " * @return\n" +
                " */\n" +
                "private Pane createExportPane() {\n" +
                "def text = \"Click the button below to export the spot data to a text file for downstream analysis.\\n\\n\" +\n" +
                "\"Optionally use 'View -> Show measurement maps' to visualize measurements associated with spots.\"\n" +
                "def btnExportData = new Button(\"Export spot data\")\n" +
                "btnExportData.setOnAction {e -> Tasks.exportSpotData(currentImageOrNull()) }\n" +
                "return createStandardPane(text, createStandardButtons(btnExportData))\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Get the image that is currently open in the QuPath GUI, or null.\n" +
                " * (Note that QP.getCurrentImageData() cannot be used in GUIs created within a script)\n" +
                " * @return\n" +
                " */\n" +
                "private ImageData<BufferedImage> currentImageOrNull() {\n" +
                "def imageData = getQuPath().getImageData()\n" +
                "if (imageData == null) {\n" +
                "Dialogs.showNoImageError(title)\n" +
                "return null\n" +
                "}\n" +
                "return imageData\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Get the project that is currently open in the QuPath GUI, or null.\n" +
                " * (Note that QP.getProject() cannot be used in GUIs created within a script)\n" +
                " * @return\n" +
                " */\n" +
                "private Project<BufferedImage> currentProjectOrNull() {\n" +
                "def project = getQuPath().getProject()\n" +
                "if (project == null) {\n" +
                "Dialogs.showNoProjectError(title)\n" +
                "return null\n" +
                "}\n" +
                "return project\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a pane containing the most useful area annotation tools.\n" +
                " * @param doVertical if true and there are multiple tools, arrange buttons vertically;\n" +
                " *                   otherwise they will be arranged horizontally\n" +
                " * @param tools requested tools, or null to use defaults (Move, Polygon, Brush, Wand)\n" +
                " * @return\n" +
                " */\n" +
                "private Node createAnnotationButtons(boolean doVertical, PathTool... tools) {\n" +
                "if (!tools) {\n" +
                "def toolsList = [PathTools.MOVE, PathTools.POLYGON, PathTools.BRUSH]\n" +
                "toolsList.addAll(getQuPath().getAvailableTools().findAll {it.getName().toLowerCase().startsWith(\"wand\") })\n" +
                "tools = toolsList as PathTool[]\n" +
                "}\n" +
                "def buttons = tools.collect {\n" +
                "return ActionTools.createToggleButton(getQuPath().getToolAction(it), true)\n" +
                "}\n" +
                "if (buttons.size() == 1)\n" +
                "return buttons[0]\n" +
                "if (doVertical) {\n" +
                "def pane = PaneTools.createRowGrid(buttons as Node[])\n" +
                "pane.setVgap(5)\n" +
                "pane.setPadding(new Insets(5))\n" +
                "return pane\n" +
                "} else {\n" +
                "def pane = PaneTools.createColumnGrid(buttons as Node[])\n" +
                "pane.setHgap(5)\n" +
                "pane.setPadding(new Insets(5))\n" +
                "return pane\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a standard text area to show instructions.\n" +
                " * @param text\n" +
                " * @return\n" +
                " */\n" +
                "private TextArea createInstructionTextArea(String text) {\n" +
                "def textArea = new TextArea(text)\n" +
                "textArea.setWrapText(true)\n" +
                "textArea.setEditable(true)\n" +
                "return textArea\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Create a button to rotate the current image by an increment of 90 degrees,\n" +
                " * adding the new image to the current project.\n" +
                " * @param rotation\n" +
                " * @return\n" +
                " */\n" +
                "private Button createRotateButton(Rotation rotation) {\n" +
                "String text\n" +
                "switch (rotation) {\n" +
                "case Rotation.ROTATE_90: text = \"Rotate 90°\"; break\n" +
                "case Rotation.ROTATE_180: text = \"Rotate 180°\"; break\n" +
                "case Rotation.ROTATE_270: text = \"Rotate 270°\"; break\n" +
                "default: throw new IllegalArgumentException(\"Unsupported rotation $rotation}\")\n" +
                "}\n" +
                "def button = new Button(text)\n" +
                "button.setTooltip(new Tooltip(text + \" clockwise & add to project\"))\n" +
                "button.setOnAction {e -> Tasks.addRotatedImage(currentProjectOrNull(), currentImageOrNull(), rotation)}\n" +
                "button.setMaxWidth(Double.MAX_VALUE)\n" +
                "return button\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Class to help create a visualization of the frame surrounding the spots.\n" +
                " * This is useful as an icon to demonstrate the correct orientation.\n" +
                " */\n" +
                "class FrameIconBuilder {\n" +
                "\n" +
                "private double radius = 5.0\n" +
                "private double strokeWidth = 2.0\n" +
                "private Color defaultColor = new Color(0.5, 0.5, 0.5)\n" +
                "private double fillOpacity = 0.5\n" +
                "private double strokeOpacity = 0.8\n" +
                "private Color  fill = new Color(defaultColor.red, defaultColor.green, defaultColor.blue, fillOpacity)\n" +
                "private Color  outline = new Color(defaultColor.red, defaultColor.green, defaultColor.blue, strokeOpacity)\n" +
                "\n" +
                "/**\n" +
                " * Build an icon to depict frame spots at the corners of the image, which each have a characteristic shape.\n" +
                " * @param cornerColor optionally specify a color to highlight the 4 most distant frame spots.\n" +
                " * @return a node that may be displayed\n" +
                " */\n" +
                "Node buildCornersIcon(Color cornerColor = null) {\n" +
                "def pane = new AnchorPane()\n" +
                "def list = pane.getChildren()\n" +
                "\n" +
                "double r = radius\n" +
                "double space = r * 3.5\n" +
                "double vSpace = space\n" +
                "double x, y, xOrigin, yOrigin\n" +
                "\n" +
                "// Top left (hourglass)\n" +
                "x = xOrigin + r\n" +
                "y = yOrigin + r\n" +
                "list << createCircle(x, y, true)\n" +
                "list << createCircle(x+space, y)\n" +
                "list << createCircle(x+space*2, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "list << createCircle(x+space*2, y)\n" +
                "\n" +
                "// Top right (filled circle)\n" +
                "xOrigin = r * 14\n" +
                "y = yOrigin + r\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y, true)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "list << createCircle(x+space*2, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "\n" +
                "// Bottom right (open circle)\n" +
                "xOrigin = r * 14\n" +
                "yOrigin = r * 14\n" +
                "y = yOrigin + r\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space*2, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y, true)\n" +
                "\n" +
                "// Bottom left (triangle)\n" +
                "xOrigin = 0\n" +
                "yOrigin = r * 14\n" +
                "y = yOrigin + r\n" +
                "x = xOrigin + r + space\n" +
                "list << createCircle(x, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r + space/2.0\n" +
                "list << createCircle(x, y)\n" +
                "list << createCircle(x+space, y)\n" +
                "y += vSpace\n" +
                "x = xOrigin + r\n" +
                "list << createCircle(x, y, true)\n" +
                "list << createCircle(x+space, y)\n" +
                "list << createCircle(x+space*2, y)\n" +
                "\n" +
                "if (cornerColor != null && cornerColor != defaultColor) {\n" +
                "fill = new Color(cornerColor.red, cornerColor.green, cornerColor.blue, fillOpacity)\n" +
                "outline = new Color(cornerColor.red, cornerColor.green, cornerColor.blue, strokeOpacity)\n" +
                "def corners = list.findAll {it.getProperties().getOrDefault(\"corner\", Boolean.FALSE)}\n" +
                "for (c in corners) {\n" +
                "((Circle)c).setFill(fill)\n" +
                "((Circle)c).setStroke(outline)\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "pane = new BorderPane(pane)\n" +
                "pane.setPadding(new Insets(radius*2))\n" +
                "\n" +
                "return pane\n" +
                "}\n" +
                "\n" +
                "\n" +
                "private Circle createCircle(double x = 0, double y = 0, boolean isCorner = false) {\n" +
                "def circle = new Circle(x, y, radius)\n" +
                "circle.setFill(fill)\n" +
                "circle.setStroke(outline)\n" +
                "circle.setStrokeWidth(strokeWidth)\n" +
                "if (isCorner)\n" +
                "circle.getProperties().put(\"corner\", Boolean.TRUE)\n" +
                "return circle\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Useful tasks performed by the workflow.\n" +
                " * These have been separated so that they can potentially be called from a batch script.\n" +
                " */\n" +
                "class Tasks {\n" +
                "\n" +
                "/**\n" +
                " * Title to use in dialogs.\n" +
                " */\n" +
                "static String TITLE = \"Spatial transcriptomics workflow\"\n" +
                "\n" +
                "/**\n" +
                " * Export the spot data.\n" +
                " * We can't use any of QuPath's 'standard' detection or annotation export options because we want something more\n" +
                " * customized to include only relevant spots and contained objects.\n" +
                " *\n" +
                " * @param imageData the image data containing the spots to export\n" +
                " * @param fileOutput optional output file; if not specified, a file chooser will be shown\n" +
                " */\n" +
                "static exportSpotData(ImageData<BufferedImage> imageData, File fileOutput = null) {\n" +
                "if (imageData == null)\n" +
                "return\n" +
                "\n" +
                "Predicate<PathObject> frameFilter = (PathObject p) -> p.getPathClass()?.getBaseClass() == Classes.FRAME_CLASS\n" +
                "Predicate<PathObject> spotFilter = (PathObject p) -> p.getPathClass()?.getBaseClass() == Classes.SPOT_CLASS\n" +
                "Predicate<PathObject> otherDetectionFilter = PathObjectFilter.DETECTIONS_ALL.and(frameFilter.negate().and(spotFilter.negate()))\n" +
                "\n" +
                "def hierarchy = imageData.getHierarchy()\n" +
                "def spots = hierarchy.getFlattenedObjectList(null).stream().filter(spotFilter).collect(Collectors.toList())\n" +
                "if (!spots) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"No spots were found in the current image!\")\n" +
                "return\n" +
                "}\n" +
                "def project = getProject()\n" +
                "if (project == null)\n" +
                "project = getQuPath()?.getProject()\n" +
                "def entry = project?.getEntry(imageData)\n" +
                "def defaultName = entry == null ? null : entry.getImageName()\n" +
                "if (fileOutput == null) {\n" +
                "fileOutput = Dialogs.promptToSaveFile(TITLE, fileOutput, defaultName, \"Tab-delimited file\", \".tsv\")\n" +
                "if (fileOutput == null)\n" +
                "return\n" +
                "}\n" +
                "\n" +
                "// Check if we have other detections and, if so, what classifications are represented\n" +
                "def otherDetections = hierarchy.getDetectionObjects().stream()\n" +
                ".filter(otherDetectionFilter)\n" +
                ".collect(Collectors.toList())\n" +
                "Set<PathClass> pathClasses = new TreeSet<>()\n" +
                "for (d in otherDetections) {\n" +
                "if (d.getPathClass() != null)\n" +
                "pathClasses.add(d.getPathClass())\n" +
                "}\n" +
                "\n" +
                "// Sort for more predictable output\n" +
                "Collections.sort(spots, DefaultPathObjectComparator.getInstance())\n" +
                "\n" +
                "// Check what measurements we have\n" +
                "def measurements = new LinkedHashSet<String>()\n" +
                "for (spot in spots)\n" +
                "measurements.addAll(spot.getMeasurementList().getMeasurementNames())\n" +
                "\n" +
                "// Get a header line\n" +
                "def line = [\"Name\", \"Centroid X\", \"Centroid Y\"]\n" +
                "for (m in measurements)\n" +
                "line << m\n" +
                "boolean hasOtherDetections = !otherDetections.isEmpty()\n" +
                "if (hasOtherDetections)\n" +
                "line << \"Num detections\"\n" +
                "for (pc in pathClasses)\n" +
                "line << \"Num ${pc.toString()}\"\n" +
                "\n" +
                "// Loop through the spots and export the data\n" +
                "def delim = \"\\t\"\n" +
                "int ndp = 5\n" +
                "def lines = [String.join(delim, line)]\n" +
                "for (spot in spots) {\n" +
                "line.clear()\n" +
                "line << spot.getName() == null ? \"\" : spot.getName()\n" +
                "line << GeneralTools.formatNumber(spot.getROI().getCentroidX(), ndp)\n" +
                "line << GeneralTools.formatNumber(spot.getROI().getCentroidY(), ndp)\n" +
                "for (m in measurements) {\n" +
                "def val = spot.getMeasurementList().getMeasurementValue(m)\n" +
                "line << GeneralTools.formatNumber(val, ndp)\n" +
                "}\n" +
                "def detectionClasses = hierarchy.getObjectsForROI(PathDetectionObject.class, spot.getROI())\n" +
                ".stream()\n" +
                ".filter(otherDetectionFilter)\n" +
                ".map(p -> p.getPathClass() == null ? PathClassFactory.getPathClassUnclassified() : p.getPathClass())\n" +
                ".collect(Collectors.toList())\n" +
                "if (hasOtherDetections)\n" +
                "line << Long.toString(detectionClasses.size())\n" +
                "def counts = detectionClasses.countBy {p -> p}\n" +
                "for (pathClass in pathClasses)\n" +
                "line << Long.toString(counts.getOrDefault(pathClass, 0))\n" +
                "lines << String.join(delim, line)\n" +
                "}\n" +
                "\n" +
                "Files.write(fileOutput.toPath(), lines, StandardCharsets.UTF_8)\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Add a rotated image to the specified project.\n" +
                " * @param project the project to which the image should be added\n" +
                " * @param imageData the current image\n" +
                " * @param rotation the rotation to apply\n" +
                " */\n" +
                "static addRotatedImage(Project<BufferedImage> project, ImageData<BufferedImage> imageData, Rotation rotation) {\n" +
                "if (project == null || imageData == null)\n" +
                "return\n" +
                "def entry = project.getEntry(imageData)\n" +
                "if (entry == null) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"No entry found in the specified project for the current image!\")\n" +
                "return\n" +
                "}\n" +
                "def server = new TransformedServerBuilder(imageData.getServer())\n" +
                ".rotate(rotation)\n" +
                ".build()\n" +
                "def entryNew = ProjectCommands.addSingleImageToProject(project, server, imageData.getImageType())\n" +
                "def name = entry.getImageName() + \" (rotated)\"\n" +
                "entryNew.setImageName(name)\n" +
                "getQuPath().refreshProject()\n" +
                "getQuPath().openImageEntry(entryNew)\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Set all existing (area) annotations to represent the tissue.\n" +
                " * These will be merged if necessary.\n" +
                " * @param imageData\n" +
                " */\n" +
                "static confirmTissue(ImageData<BufferedImage> imageData) {\n" +
                "if (imageData == null)\n" +
                "return\n" +
                "def hierarchy = imageData.getHierarchy()\n" +
                "def tissueFilter = {PathObject p -> p.getROI()?.isArea() && !(p.getROI() instanceof EllipseROI)\n" +
                "&& (p.getPathClass() == null || p.getPathClass() == Classes.TISSUE_CLASS) }\n" +
                "def annotations = hierarchy.getAnnotationObjects().findAll(tissueFilter)\n" +
                "if (annotations.isEmpty()) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"Please annotate an area of tissue!\\n\\n\" +\n" +
                "\"This should be a polygonal annotation (not a line or ellipse), without any classification set.\")\n" +
                "return\n" +
                "}\n" +
                "if (annotations.size() > 1) {\n" +
                "if (!Dialogs.showConfirmDialog(TITLE, \"Only one tissue annotation is permitted - can I merge the ${annotations.size()} existing unclassified/tissue annotations?\"))\n" +
                "return\n" +
                "mergeAnnotations(hierarchy, annotations)\n" +
                "annotations = hierarchy.getAnnotationObjects().findAll(tissueFilter)\n" +
                "}\n" +
                "def annotation = annotations[0]\n" +
                "annotation.setPathClass(Classes.TISSUE_CLASS)\n" +
                "annotation.setLocked(true)\n" +
                "hierarchy.fireHierarchyChangedEvent(this)\n" +
                "Dialogs.showInfoNotification(TITLE, \"Tissue annotation set!\")\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Lock all existing classified area annotations.\n" +
                " * @param imageData\n" +
                " */\n" +
                "static confirmRegions(ImageData<BufferedImage> imageData) {\n" +
                "if (imageData == null)\n" +
                "return\n" +
                "def hierarchy = imageData.getHierarchy()\n" +
                "def annotations = hierarchy.getAnnotationObjects().findAll {it.getROI()?.isArea() && it.getPathClass() != Classes.TISSUE_CLASS}\n" +
                "if (annotations.isEmpty()) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"No non-tissue area annotations found!\\n\" +\n" +
                "\"No changes will be made.\")\n" +
                "return\n" +
                "}\n" +
                "def classifiedAnnotations = annotations.findAll {it.getPathClass() != null}\n" +
                "if (classifiedAnnotations.isEmpty()) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"Your annotations can only be used for distance measurements if they have been classified!\\n\" +\n" +
                "\"No changes will be made.\")\n" +
                "return\n" +
                "}\n" +
                "classifiedAnnotations.forEach { it.setLocked(true) }\n" +
                "if (classifiedAnnotations.size() == 1)\n" +
                "Dialogs.showInfoNotification(TITLE, \"Locked one classified annotation\")\n" +
                "else\n" +
                "Dialogs.showInfoNotification(TITLE, \"Locked ${classifiedAnnotations.size()} classified annotations\")\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Add an image to the project for cell detection.\n" +
                " * @param imageData\n" +
                " */\n" +
                "static addCellDetectionImage(Project<BufferedImage> project, ImageData<BufferedImage> imageData) {\n" +
                "if (project == null || imageData == null)\n" +
                "return\n" +
                "def entry = project.getEntry(imageData)\n" +
                "if (entry == null) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"No entry found in the specified project for the current image!\")\n" +
                "return\n" +
                "}\n" +
                "// Request & duplicate the tissue annotation\n" +
                "def tissueAnnotations = imageData.getHierarchy().getAnnotationObjects().stream()\n" +
                ".filter(p -> p.getROI().isArea() && p.getPathClass() == Classes.TISSUE_CLASS)\n" +
                ".map(p -> PathObjectTools.transformObject(p, null, true))\n" +
                ".collect(Collectors.toList())\n" +
                "String nameNew = Dialogs.showInputDialog(TITLE, \"Cell detection image name\", \"Cells-\" + entry.getImageName())\n" +
                "if (nameNew == null)\n" +
                "return\n" +
                "def entryNew = project.addDuplicate(entry, true)\n" +
                "def imageDataNew = entryNew.readImageData()\n" +
                "imageDataNew.getHierarchy().clearAll()\n" +
                "if (tissueAnnotations)\n" +
                "imageDataNew.getHierarchy().addPathObjects(tissueAnnotations)\n" +
                "entryNew.setImageName(nameNew)\n" +
                "entryNew.saveImageData(imageDataNew)\n" +
                "getQuPath()?.refreshProject()\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Import cells from another image.\n" +
                " * @param project\n" +
                " * @param imageData\n" +
                " * @param otherHierarchy the object hierarchy containing the cells to import; if not provided, the user will be prompted to select a compatible image from the current project\n" +
                " * @return\n" +
                " */\n" +
                "static importCells(Project<BufferedImage> project, ImageData<BufferedImage> imageData, PathObjectHierarchy otherHierarchy = null) {\n" +
                "if (imageData == null)\n" +
                "return\n" +
                "if (otherHierarchy == null) {\n" +
                "if (project == null)\n" +
                "return\n" +
                "def entry = project.getEntry(imageData)\n" +
                "if (entry == null) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"No entry found in the specified project for the current image!\")\n" +
                "return\n" +
                "}\n" +
                "// Get all the entries that aren't identical to this image but share the same server\n" +
                "def server = imageData.getServer()\n" +
                "def possibleEntries = project.getImageList().findAll {\n" +
                "if (it == entry)\n" +
                "return false\n" +
                "def builder = it.getServerBuilder()\n" +
                "if (!Objects.equals(server.getURIs(), builder.getURIs()))\n" +
                "return false\n" +
                "try (def serverTemp = builder.build()) {\n" +
                "return serverTemp.getPath().equals(server.getPath())\n" +
                "}\n" +
                "}\n" +
                "if (possibleEntries.isEmpty()) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"I could not find any matching images that might contain cells!\")\n" +
                "return\n" +
                "}\n" +
                "def choice = Dialogs.showChoiceDialog(TITLE, \"Choose image containing cells\", possibleEntries, possibleEntries[0])\n" +
                "if (choice == null)\n" +
                "return\n" +
                "otherHierarchy = choice.readHierarchy()\n" +
                "}\n" +
                "def cells = otherHierarchy.getCellObjects()\n" +
                "if (cells.isEmpty()) {\n" +
                "cells = otherHierarchy.getDetectionObjects()\n" +
                "}\n" +
                "if (cells.isEmpty()) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"Unable to find any cells or detections in the specified image!\")\n" +
                "return\n" +
                "}\n" +
                "// Consider inserting within the tissue annotation only\n" +
                "imageData.getHierarchy().insertPathObjects(cells)\n" +
                "if (cells.size() == 1)\n" +
                "Dialogs.showInfoNotification(TITLE, \"One cell inserted into the hierarchy\")\n" +
                "else\n" +
                "Dialogs.showInfoNotification(TITLE, \"${cells.size()} cells inserted into the hierarchy\")\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Find files (recursively) within the current project that match a specified filter.\n" +
                " * @param filter\n" +
                " * @return\n" +
                " */\n" +
                "private static List<File> filesWithinProject(Predicate<Path> filter) {\n" +
                "def project = getProject()\n" +
                "if (project == null)\n" +
                "project = getQuPath()?.getProject()\n" +
                "if (project == null)\n" +
                "return Collections.emptyList()\n" +
                "def dirBase = project == null ? null : Projects.getBaseDirectory(project)\n" +
                "   if (dirBase != null) {\n" +
                "return Files.walk(dirBase.toPath()).filter(filter).map(p -> p.toFile()).collect(Collectors.toList())\n" +
                "}\n" +
                "return Collections.emptyList()\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Import spots and add them to an image.\n" +
                " *\n" +
                " * @param imageData the current image; fiducial markers as the 4 corners should be indicated with ellipse annotations\n" +
                " * @param fileGPR the .gpr file containing spot locations; if missing, a file chooser will be shown\n" +
                " * @param block the block, if known; if missing, the user will be asked to select the block\n" +
                " * @param fileBarcodes a 'visium-v1_coordinates.txt' file, if available\n" +
                " */\n" +
                "static importSpots(ImageData<BufferedImage> imageData, File fileGPR = null, String block = null, File fileBarcodes = null) {\n" +
                "if (imageData == null)\n" +
                "return\n" +
                "\n" +
                "// Check we have the fiducial markers that we need\n" +
                "def rois = imageData.getHierarchy().getAnnotationObjects().findAll({it.getROI() instanceof EllipseROI && it.getPathClass() == null}).collect {it.getROI()}\n" +
                "print 'ROIS: ' + rois\n" +
                "if (rois.size() <= 1 || rois.size() > 4) {\n" +
                "Dialogs.showErrorMessage(TITLE, \"Between 2 and 4 anchor points must be marked by ellipse ROIs!\")\n" +
                "return\n" +
                "}\n" +
                "\n" +
                "// Check for files & prompt if required\n" +
                "if (fileGPR == null) {\n" +
                "def gprFiles = filesWithinProject({ p -> p.toString().toLowerCase().endsWith('.gpr')})\n" +
                "if (gprFiles) {\n" +
                "fileGPR = gprFiles[0]\n" +
                "getQuPath().logger.info(\"Using GPR file {}\", fileGPR.getAbsolutePath())\n" +
                "} else {\n" +
                "fileGPR = Dialogs.promptForFile(TITLE, null, \"GPR file\", \".gpr\")\n" +
                "}\n" +
                "}\n" +
                "if (fileBarcodes == null) {\n" +
                "def barcodeFiles = filesWithinProject({ p -> p.toString().toLowerCase().endsWith('visium-v1_coordinates.txt')})\n" +
                "if (barcodeFiles) {\n" +
                "fileBarcodes = barcodeFiles[0]\n" +
                "getQuPath().logger.info(\"Using barcode file {}\", fileBarcodes.getAbsolutePath())\n" +
                "}\n" +
                "}\n" +
                "if (fileGPR == null) {\n" +
                "return\n" +
                "}\n" +
                "def lines = fileGPR.readLines()\n" +
                "int i = 0\n" +
                "def finder = new SpotFinder()\n" +
                "def mapFiducials = finder.parseBlockMap(lines.find {it.contains('BlockMapFiducials=')})\n" +
                "def mapOligos = finder.parseBlockMap(lines.find {it.contains('BlockMapOligos=')})\n" +
                "while (!lines[i].startsWith(\"Block\"))\n" +
                "i++\n" +
                "def header = lines[i]\n" +
                "List<SpotFinder.Spot> spots = []\n" +
                "for (i = i+1; i < lines.size(); i++) {\n" +
                "if (lines[i])\n" +
                "spots << finder.parseSpot(lines[i])\n" +
                "}\n" +
                "\n" +
                "// Prompt for the block, if needed\n" +
                "if (block == null) {\n" +
                "def allBlocks = mapFiducials.keySet() as List\n" +
                "allBlocks = allBlocks.sort()\n" +
                "block = Dialogs.showChoiceDialog(TITLE, \"Choose block (required to identify the correct grid)\", allBlocks, allBlocks[0])\n" +
                "if (block == null)\n" +
                "return\n" +
                "}\n" +
                "\n" +
                "// Extract the spots\n" +
                "def frameSpots = spots.findAll({it.block == mapFiducials[block]})\n" +
                "def mainSpots = spots.findAll({it.block == mapOligos[block]})\n" +
                "\n" +
                "// If we have a barcode file, use it\n" +
                "if (fileBarcodes)\n" +
                "matchBarcodesToSpots(mainSpots, fileBarcodes)\n" +
                "\n" +
                "// Check for unclassified ellipse rois we can use for alignment\n" +
                "def region = rois.size() == 2 ? RegionRequest.createInstance(imageData.getServer()) : null\n" +
                "AffineTransform transform = finder.centroidsToTransform(rois, frameSpots, region)\n" +
                "\n" +
                "def cal = imageData.getServer().getPixelCalibration()\n" +
                "Function<ROI, PathObject> creator = r -> PathObjects.createDetectionObject(r)\n" +
                "def frameObjects = frameSpots.collect {it.createObject(transform, cal, creator)}\n" +
                "\n" +
                "def hierarchy = imageData.getHierarchy()\n" +
                "def existingSpots = hierarchy.getFlattenedObjectList(null)\n" +
                ".findAll { it.getPathClass()?.getBaseClass() == getPathClass('Spot') ||\n" +
                "it.getPathClass() == getPathClass('Frame')}\n" +
                "\n" +
                "hierarchy.removeObjects(existingSpots, true)\n" +
                "hierarchy.addPathObjects(frameObjects)\n" +
                "\n" +
                "def spotObjects = mainSpots.collect {it.createObject(transform, cal, creator)}\n" +
                "\n" +
                "def annotatedRegions = hierarchy.getAnnotationObjects().findAll {it.getPathClass() != null}\n" +
                "def pathClasses = annotatedRegions.collect {it.getPathClass()} as Set\n" +
                "for (pathClass in pathClasses) {\n" +
                "def tempAnnotations = annotatedRegions.findAll {it.getPathClass() == pathClass}\n" +
                "DistanceTools.centroidToBoundsDistance2D(\n" +
                "spotObjects,\n" +
                "tempAnnotations,\n" +
                "cal.getPixelWidth(), cal.getPixelHeight(),\n" +
                "\"Distance centroid to \" + pathClass.toString() + \" \" + cal.pixelWidthUnit)\n" +
                "}\n" +
                "hierarchy.insertPathObjects(spotObjects)\n" +
                "}\n" +
                "\n" +
                "\n" +
                "private static matchBarcodesToSpots(List<SpotFinder.Spot> spots, File fileBarcodes) {\n" +
                "def barcodes = fileBarcodes.readLines().collect {line ->\n" +
                "def parts = line.split(\"\\t\")\n" +
                "int x = parts[1] as int\n" +
                "int y = parts[2] as int\n" +
                "return new Barcode(barcode: parts[0], row: Math.floor((y-1)/2) + 1, column: x)\n" +
                "}\n" +
                "def map = barcodes.stream().collect(Collectors.toMap(b -> b.getColumn() + \"-\" + b.getRow(), b -> b))\n" +
                "for (spot in spots) {\n" +
                "String key = spot.column + \"-\" + spot.row\n" +
                "def barcode = map.get(key)\n" +
                "spot.barCode = barcode.barcode\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "static class Barcode {\n" +
                "String barcode\n" +
                "int row, column\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Some useful PathClasses\n" +
                " */\n" +
                "class Classes {\n" +
                "public final static TISSUE_CLASS = getPathClass(\"Tissue\", getColorRGB(20, 20, 200))\n" +
                "public final static SPOT_CLASS = getPathClass(\"Spot\", getColorRGB(255, 80, 120))\n" +
                "public final static FRAME_CLASS = getPathClass(\"Frame\", getColorRGB(180, 180, 180))\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Helper methods for aligning spots from a .gpr file within an image.\n" +
                " */\n" +
                "class SpotFinder {\n" +
                "\n" +
                "AffineTransform centroidsToTransform(List<ROI> rois, List<Spot> frameSpots, ImageRegion region = null) {\n" +
                "if (rois.size() < 2 || rois.size() > 4) {\n" +
                "throw new IllegalArgumentException(\"Between 2 and 4 ROIs should be drawn (at the frame corners)!\")\n" +
                "}\n" +
                "\n" +
                "// Arrange points clockwise about the centroid\n" +
                "def coords = rois.collect {new Coordinate(it.getCentroidX(), it.getCentroidY())}\n" +
                "double cx, cy\n" +
                "if (coords.size() == 2 && region != null) {\n" +
                "cx = region.getX() + region.getWidth()/2.0\n" +
                "cy = region.getY() + region.getHeight()/2.0\n" +
                "} else {\n" +
                "cx = coords.stream().mapToDouble(c -> c.x).average().getAsDouble()\n" +
                "cy = coords.stream().mapToDouble(c -> c.y).average().getAsDouble()\n" +
                "}\n" +
                "def topLeft = coords.find {it.x < cx && it.y < cy}\n" +
                "def topRight = coords.find {it.x > cx && it.y < cy}\n" +
                "def bottomLeft = coords.find {it.x < cx && it.y > cy}\n" +
                "def bottomRight = coords.find {it.x > cx && it.y > cy}\n" +
                "def frameTopRow = frameSpots.findAll {it.y == frameSpots[0].y}\n" +
                "def frameBottomRow = frameSpots.findAll {it.y == frameSpots[-1].y}\n" +
                "List<Double> sourcePoints = []\n" +
                "List<Double> targetPoints = []\n" +
                "\n" +
                "if (topLeft != null) {\n" +
                "sourcePoints.addAll([topLeft.x, topLeft.y])\n" +
                "targetPoints.addAll([frameTopRow[0].x, frameTopRow[0].y])\n" +
                "}\n" +
                "if (topRight != null) {\n" +
                "sourcePoints.addAll([topRight.x, topRight.y])\n" +
                "targetPoints.addAll([frameTopRow[-1].x, frameTopRow[-1].y])\n" +
                "}\n" +
                "if (bottomLeft != null) {\n" +
                "sourcePoints.addAll([bottomLeft.x, bottomLeft.y])\n" +
                "targetPoints.addAll([frameBottomRow[0].x, frameBottomRow[0].y])\n" +
                "}\n" +
                "if (bottomRight != null) {\n" +
                "sourcePoints.addAll([bottomRight.x, bottomRight.y])\n" +
                "targetPoints.addAll([frameBottomRow[-1].x, frameBottomRow[-1].y])\n" +
                "}\n" +
                "try (def scope = new PointerScope()) {\n" +
                "def matSource = new Mat(sourcePoints as double[])\n" +
                "matSource = matSource.reshape(1, sourcePoints.size()/2 as int)\n" +
                "def matTarget = new Mat(targetPoints as double[])\n" +
                "matTarget = matTarget.reshape(1, targetPoints.size()/2 as int)\n" +
                "Mat matTransform\n" +
                "if (sourcePoints.size() == 4)\n" +
                "matTransform = opencv_calib3d.estimateAffinePartial2D(matSource, matTarget, null,\n" +
                "opencv_calib3d.LMEDS, 3, 2000, 0.99, 10)\n" +
                "else\n" +
                "matTransform = opencv_calib3d.estimateAffine2D(matSource, matTarget, null,\n" +
                "opencv_calib3d.LMEDS, 3, 2000, 0.99, 10)\n" +
                "\n" +
                "def idx = matTransform.createIndexer()\n" +
                "def transform = new AffineTransform([\n" +
                "idx.getDouble(0, 0),\n" +
                "idx.getDouble(1, 0),\n" +
                "idx.getDouble(0, 1),\n" +
                "idx.getDouble(1, 1),\n" +
                "idx.getDouble(0, 2),\n" +
                "idx.getDouble(1, 2)\n" +
                "] as double[])\n" +
                "transform.invert()\n" +
                "return transform\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "Spot parseSpot(String line) {\n" +
                "def parts = line.split(\"\\t\")\n" +
                "String barcode = parts.size() > 9 ? parts[9] : null\n" +
                "return new Spot(\n" +
                "block: parts[0] as int,\n" +
                "column: parts[1] as int,\n" +
                "row: parts[2] as int,\n" +
                "id: parts[3] as String,\n" +
                "name: parts[4] as String,\n" +
                "x: parts[5] as int,\n" +
                "y: parts[6] as int,\n" +
                "diameter: parts[7] as int,\n" +
                "flags: parts[8] as int,\n" +
                "barCode: barcode\n" +
                ")\n" +
                "}\n" +
                "\n" +
                "\n" +
                "Map<String, Integer> parseBlockMap(String line) {\n" +
                "if (line.contains('='))\n" +
                "line = line.substring(line.lastIndexOf('=')+1)\n" +
                "line = line.replaceAll('\"', '')\n" +
                "def map = [:]\n" +
                "for (block in line.split(',')) {\n" +
                "def s = block.split(':')\n" +
                "map.putAt(s[0].trim(), s[1].trim() as int)\n" +
                "}\n" +
                "return map\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "class Spot {\n" +
                "int block\n" +
                "int column\n" +
                "int row\n" +
                "String id\n" +
                "String name\n" +
                "int x\n" +
                "int y\n" +
                "int diameter\n" +
                "int flags\n" +
                "String barCode\n" +
                "\n" +
                "ROI createROI(AffineTransform transform, PixelCalibration cal) {\n" +
                "double radiusH = diameter / cal.getPixelWidth().doubleValue() / 2.0\n" +
                "double radiusV = diameter / cal.getPixelHeight().doubleValue() / 2.0\n" +
                "def pt = new Point2D.Double(x, y)\n" +
                "transform.transform(pt, pt)\n" +
                "return ROIs.createEllipseROI(pt.getX()-radiusH, pt.getY()-radiusV,\n" +
                "radiusH*2, radiusV*2, ImagePlane.getDefaultPlane())\n" +
                "}\n" +
                "\n" +
                "PathObject createObject(AffineTransform transform, PixelCalibration cal,\n" +
                "Function<ROI, PathObject> creator,\n" +
                "boolean addMeasurements = true,\n" +
                "Random rand = null) {\n" +
                "//            def pathObject = PathObjects.createDetectionObject(createROI(transform, cal))\n" +
                "def pathObject = creator.apply(createROI(transform, cal))\n" +
                "if (barCode)\n" +
                "pathObject.setName(barCode)\n" +
                "else\n" +
                "pathObject.setName(name)\n" +
                "if (name.toLowerCase().trim() == 'frame')\n" +
                "pathObject.setPathClass(Classes.FRAME_CLASS)\n" +
                "else {\n" +
                "pathObject.setPathClass(Classes.SPOT_CLASS)\n" +
                "//                pathObject.setPathClass(getDerivedPathClass(Classes.SPOT_CLASS, name))\n" +
                "if (rand != null)\n" +
                "pathObject.setColorRGB(getColorRGB(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)))\n" +
                "}\n" +
                "if (addMeasurements) {\n" +
                "try (def ml = pathObject.getMeasurementList()) {\n" +
                "if (id != \"F\") {\n" +
                "try {\n" +
                "ml.putMeasurement(\"ID\", Integer.parseInt(id))\n" +
                "} catch (Exception e) {}\n" +
                "}\n" +
                "ml.putMeasurement(\"Block\", block)\n" +
                "ml.putMeasurement(\"Column\", column)\n" +
                "ml.putMeasurement(\"Row\", row)\n" +
                "ml.putMeasurement(\"x\", x)\n" +
                "ml.putMeasurement(\"y\", y)\n" +
                "ml.putMeasurement(\"Diameter\", diameter)\n" +
                "ml.putMeasurement(\"Flags\", flags)\n" +
                "}\n" +
                "}\n" +
                "pathObject.setLocked(true)\n" +
                "return pathObject\n" +
                "}\n" +
                "\n" +
                "String toString() {\n" +
                "return String.format('Spot: %d, %d, %s', x, y, id)\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "}\n";
        System.out.println(Beautifier.beautifyGroovy(script));



    }
}
