package org.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class JsonInput {
    // Reads and stores the input text
    public static ArrayList<String> readAndStore(ArrayList<String> in, Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            in.add(line);

            if (line != null && line.equalsIgnoreCase("END")) {
                in.remove(in.size() - 1);
                System.out.println("Output list : " + in);
                break;
            }
        }

        return in;
    }

    // Checks whether the input is a valid JSON String
    public static boolean isValid(String json) {
        try {
            new JSONObject(json);
        } catch (JSONException e) {
            try {
                new JSONArray(json);
            } catch (JSONException ne) {
                return false;
            }
        }
        return true;
    }
}
