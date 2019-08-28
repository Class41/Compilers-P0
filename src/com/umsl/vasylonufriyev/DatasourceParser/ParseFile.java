package com.umsl.vasylonufriyev.DatasourceParser;

import java.io.File;

public class ParseFile {
    protected static final String EXTENSION = ".fs19";
    private ParseCore parser;

    protected ParseFile(String cmdArg) {
        String qualifiedFileName = cmdArg;
        System.out.println("Filename detected. Attempt to read from file.");

        if (cmdArg.endsWith(".fs19")) {
            System.out.println("Extension detected. Proceeding normally.");
        } else {
            qualifiedFileName += EXTENSION;
        }

        File inFile = new File("./" + qualifiedFileName);

        try {
            if (!inFile.exists()) {
                System.out.println("File " + inFile.getCanonicalPath() + " does not exist. Aborting");
                return;
            }
            if (!inFile.canRead()) {
                System.out.println("File " + inFile.getCanonicalPath() + " cannot be read. Aborting");
                return;
            }
        } catch (Exception e) {
            System.out.println("Error getting canonical path of file...");
            return;
        }

        parser = new ParseCore(qualifiedFileName);
    }

    protected String[] GetParseResult() {
        return parser.getResult();
    }
}
