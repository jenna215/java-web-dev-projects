package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all " +
                "the terms over to one side, you can put the " +
                "quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward " +
                "from there.";

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < quote.length(); i++) {
            System.out.println(quote.charAt(i));
            if(letters.containsKey(quote.charAt(i))) {
                letters.put(quote.charAt(i), letters.get(quote.charAt(i)) + 1);
            } else {
                letters.put(quote.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> character : letters.entrySet()) {
            System.out.println(character.getKey() + " :" + character.getValue());
        }
    }
    }