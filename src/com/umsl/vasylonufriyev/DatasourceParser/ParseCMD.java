package com.umsl.vasylonufriyev.DatasourceParser;

class ParseCMD {
    private ParseCore parser;

    ParseCMD() {
        System.out.println("Attempting to read data from console input...");

        parser = new ParseCore();
    }

    String[] GetParseResult() {
        return parser.getResult();
    }
}
