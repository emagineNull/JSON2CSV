package org.example;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class CSVOutput {

    // Print CSV output
    public static String printCSV(String jsonString) {
        /*String newStr = "";
        newStr = jsonString.replace("{","");
        newStr = newStr.replaceAll("}","");
        newStr = newStr.replaceAll("\\s+"," ");
        newStr = newStr.replace("[", "");
        newStr = newStr.replace("]", "");*/

        JSONArray jsonArray = new JSONArray(jsonString);

        String csv = CDL.toString(jsonArray);
        System.out.println(csv);
        return csv;
    }
}
