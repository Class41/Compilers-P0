package com.umsl.vasylonufriyev;

import com.umsl.vasylonufriyev.DataStructures.BinaryTreeManager;
import com.umsl.vasylonufriyev.DatasourceParser.ParseClassifier;

public class Main {
    public static String OUTPUT_BASE_STRING = "";

    public static void main(String[] args) {
        String[] parsedData = ParseClassifier.Classify(args);

        if (parsedData == null)
            return;

        System.out.println("~~ read " + parsedData.length + " tokens. ~~");

        BinaryTreeManager btm = new BinaryTreeManager(parsedData).buildTree();

        btm.getTree().printPreorder(OUTPUT_BASE_STRING);
        btm.getTree().printInorder(OUTPUT_BASE_STRING);
        btm.getTree().printPostOrder(OUTPUT_BASE_STRING);

    }
}
