package com.umsl.vasylonufriyev.DatasourceParser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.umsl.vasylonufriyev.DatasourceParser.ParseSourceType;

class ParseCore {
    private String[] parseResult = null;

    ParseSourceType inType;
    String fileString;

    ParseCore() {
        inType = ParseSourceType.CMDINPUT;
        DoParse();
    }

    ParseCore(String qualifiedFileName) {
        inType = ParseSourceType.FILEINPUT;
        fileString = qualifiedFileName;
        DoParse();
    }

    private void DoParse() {
        File finRef = null;
        FileInputStream finStream = null;
        Scanner dataScanner = null;

        switch (inType) {
            case CMDINPUT:
                dataScanner = new Scanner(System.in);
                break;
            case FILEINPUT:
                finRef = new File("./" + fileString);
                try {
                    finStream = new FileInputStream(finRef);
                } catch (Exception e) {
                    System.out.println("Failed to open input stream.");
                }

                dataScanner = new Scanner(finStream);
                break;
        }

        ReadInData(dataScanner);
        try {
            if (finStream != null)
                finStream.close();
        } catch (Exception e) {
            System.out.println("Failed to close input file stream...");
        }
    }

    private void ReadInData(Scanner dataScanner) {
        List<String> data = new ArrayList<String>();

        while (dataScanner.useDelimiter(" ").hasNext()) {
            data.add(dataScanner.next());
        }

        parseResult = new String[data.size()];

        System.arraycopy(data.toArray(), 0, parseResult, 0, data.size());

    }

    String[] getResult() {
        return parseResult;
    }
}
