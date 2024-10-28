package org.jeesonmap;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream jsonFile = new FileInputStream("src/main/resources/jeeson.json");
            InputStreamReader reader = new InputStreamReader(jsonFile, Charset.forName("Cp1252"));

            JeesonLexer lexer = new JeesonLexer(reader);
            lexer.nextToken();

            JeesonParser parser = new JeesonParser(lexer);
            parser.parse();

            Object parsedResult = parser.getParsedResult();

            System.out.println("Parsing completed successfully!!!.\n");

            System.out.println("Parsed result: " + parsedResult + "\n");
            
             if (parsedResult instanceof Map) {
                Map<String, Object> jsonMap = (Map<String, Object>) parsedResult;

                System.out.println("Map size: " + jsonMap.size());
                System.out.println("Map keys: " + jsonMap.keySet());
                System.out.println("Map values: " + jsonMap.values() + "\n");

                System.out.println("GET VALUE WITH KEY1: " + jsonMap.get("key1"));
                System.out.println("GET VALUE WITH KEY2: " + jsonMap.get("key2"));
            } else {
                System.out.println("Parsed result is not a JSON object.");
            }
        } catch (Exception e) {
            System.err.println("Error occurred during parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
