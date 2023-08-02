package org.example;

import java.util.ArrayList;

public class CSVOutput {

    // Print CSV output
    public static void printCSV(String jsonString) {
        String newStr = "";
        newStr = jsonString.replace("{","");
        newStr = newStr.replaceAll("}","");

        System.out.println(newStr);
    }
}
