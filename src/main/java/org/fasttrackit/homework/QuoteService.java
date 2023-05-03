package org.fasttrackit.homework;

import lombok.RequiredArgsConstructor;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class QuoteService {
    private final List<Quote> quotes;

    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (Quote quote : quotes) {
            if (!authors.contains(quote.getAuthor())) {
                authors.add(quote.getAuthor());
            }
        }
        return authors;
    }

    public void setFavorite(int id) {
        boolean found = false;
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                found = true;
                quote.setFavourite(true);
            }
        }
        if (!found) {
            throw new InvalidParameterException();
        }
    }

    public Quote getRandom() {
        Random random = new Random();
        int id = random.nextInt(quotes.size());
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                return quote;
            }
        }
        return getRandom();
    }

    public static void main(String[] args) {
        QuoteService quoteService = new QuoteService(QuoteReader.readQuotes());
        List<String> authors = quoteService.getAuthors();
        System.out.println(authors.size());

        System.out.println(quoteService.getRandom());
    }

}
