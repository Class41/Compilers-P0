package com.umsl.vasylonufriyev.DatasourceParser;

public class ParseCMD {
    private ParseCore parser;

    public ParseCMD() {
        System.out.println("Attempting to read data from console input...");

        parser = new ParseCore();
    }

    public String[] getParseResult() {
        return parser.getResult();
    }
}
