package com.umsl.vasylonufriyev.DatasourceParser;

import com.umsl.vasylonufriyev.Main;

public class ParseClassifier {

    public static String[] Classify(String[] cmdArgs) {
        String[] dataSet = null;

        switch (cmdArgs.length) {
            case 0:
                ParseCMD cmdInputParser = new ParseCMD();
                dataSet = cmdInputParser.GetParseResult();
                Main.OUTPUT_BASE_STRING = "tree";
                break;
            case 1:
                ParseFile fileInputParser = new ParseFile(cmdArgs[0]);
                dataSet = fileInputParser.GetParseResult();

                if (cmdArgs[0].endsWith(".fs19"))
                    Main.OUTPUT_BASE_STRING = cmdArgs[0].substring(0, cmdArgs[0].length() - 5);
                else
                    Main.OUTPUT_BASE_STRING = cmdArgs[0];

                break;
            default:
                System.out.println("Input exceeded expected argument count. Expected 0 or 1 got " + cmdArgs.length);
                break;
        }

        return dataSet;
    }
}
