package com.umsl.vasylonufriyev;

import com.umsl.vasylonufriyev.DatasourceParser.BinaryTreeManager;
import com.umsl.vasylonufriyev.DatasourceParser.ParseClassifier;

public class Main {

    public static void main(String[] args) {
        String[] parsedData = ParseClassifier.Classify(args);

        if (parsedData == null)
            return;

        BinaryTreeManager btm = new BinaryTreeManager(parsedData).buildTree();
        btm.getTree().printPreorder();

        System.out.println("read " + parsedData.length + " tokens.");


    }
}
