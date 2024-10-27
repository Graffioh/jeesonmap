package org.example;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream jsonFile = new FileInputStream("src/main/resources/jeeson.json");
            InputStreamReader reader = new InputStreamReader(jsonFile, Charset.forName("Cp1252"));

            JsonParser parser = new JsonParser(reader);

            parser.lexer.nextToken();
            parser.parse();

            String parsedResult = parser.getParsedResult();

            System.out.println("Parsing completed successfully!!!.\n");
            System.out.println("parsed result: " + parsedResult);

        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error occurred during parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
