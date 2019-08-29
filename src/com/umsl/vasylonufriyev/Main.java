package com.umsl.vasylonufriyev;

import com.umsl.vasylonufriyev.DatasourceParser.ParseClassifier;

public class Main {

    public static void main(String[] args) {
        String[] parsedData = ParseClassifier.Classify(args);

        if (parsedData == null)
            return;

        System.out.println(parsedData.length);
    }
}
