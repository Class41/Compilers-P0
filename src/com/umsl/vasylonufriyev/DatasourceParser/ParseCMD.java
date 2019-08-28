package com.umsl.vasylonufriyev.DatasourceParser;

public class ParseCMD {
    private ParseCore parser;

    protected  ParseCMD() {
        System.out.println("Attempting to read data from console input...");

        parser = new ParseCore();
    }

    protected String[] GetParseResult() {
        return parser.getResult();
    }
}
