package com.umsl.vasylonufriyev;

import com.umsl.vasylonufriyev.DataStructures.Tree;
import static com.umsl.vasylonufriyev.DatasourceParser.ParseClassifier.Classify;

public class Main {
    public static String OUTPUT_BASE_STRING = "";

    public static void main(String[] args) {
        String[] parsedData = Classify(args);

        if (parsedData == null)
            return;

        System.out.println("~~ read " + parsedData.length + " tokens. ~~");

        Tree binTree = new Tree().buildTree(parsedData);

        binTree.printPreorder(OUTPUT_BASE_STRING);
        binTree.printInorder(OUTPUT_BASE_STRING);
        binTree.printPostorder(OUTPUT_BASE_STRING);
    }
}
