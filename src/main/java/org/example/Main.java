package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertTrue;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();

        in = JsonInput.readAndStore(in, scanner);

        String listString = String.join(", ", in);
        assertTrue(JsonInput.isValid(listString));
        String newStr = "";
        newStr = listString.replace("{","");
        newStr = newStr.replaceAll("}","");

        // TODO: stuff
        System.out.println(newStr);

    }
}