package com.umsl.vasylonufriyev.DatasourceParser;

public class ParseClassifier {

        public static String[] Classify(String[] cmdArgs) {
            String[] dataSet = null;

            switch (cmdArgs.length) {
                case 0:
                    ParseCMD cmdInputParser = new ParseCMD();
                    dataSet = cmdInputParser.GetParseResult();
                    break;
                case 1:
                    ParseFile fileInputParser = new ParseFile(cmdArgs[0]);
                    dataSet = fileInputParser.GetParseResult();
                    break;
                default:
                    System.out.println("Input exceeded expected argument count. Expected 0 or 1 got " + cmdArgs.length);
                    break;
            }

            return dataSet;
        }
}
