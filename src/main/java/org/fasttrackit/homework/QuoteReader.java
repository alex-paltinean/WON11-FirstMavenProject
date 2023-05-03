package org.fasttrackit.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuoteReader {
    public static List<Quote> readQuotes() {
        List<Quote> quotes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/quotes.txt"));
            int id = 1;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] tokens = line.split("~");
                quotes.add(new Quote(id++, tokens[0], tokens[1]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return quotes;
    }
}
