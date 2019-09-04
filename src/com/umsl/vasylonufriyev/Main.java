package com.umsl.vasylonufriyev;

import com.umsl.vasylonufriyev.DataStructures.Tree;
import com.umsl.vasylonufriyev.DatasourceParser.ParseCMD;
import com.umsl.vasylonufriyev.DatasourceParser.ParseFile;

public class Main {
    public static String OUTPUT_BASE_STRING = "";

    public static void main(String[] args) {
        String[] parsedData = ClassifyAndParseTokens(args);

        if (parsedData == null) {
            return;
        } else if (parsedData.length == 0) {
            System.out.println("Invalid input length");
            return;
        }

        System.out.println("~~ read " + parsedData.length + " tokens. ~~");

        Tree binTree = new Tree().buildTree(parsedData);

        binTree.printPreorder(OUTPUT_BASE_STRING);
        binTree.printInorder(OUTPUT_BASE_STRING);
        binTree.printPostorder(OUTPUT_BASE_STRING);
    }

    private static String[] ClassifyAndParseTokens(String[] cmdArgs) {
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
