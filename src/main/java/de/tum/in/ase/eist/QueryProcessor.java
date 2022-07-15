package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("what is your name")) {
            return "Tizian";
        } else if (query.contains("what is your age")) {
            return "20";
        } else if (query.contains("plus")) {
            return String.valueOf(Integer.parseInt(query.split(" ")[3]) + Integer.parseInt(query.split(" ")[5]));
        } else if (query.contains("largest")) {
            String[] split = query.split(" ");
            String[] numbers = new String[split.length - 9];
            int j = 0;
            for (int i = 9; i < split.length; i++, j++) {
                numbers[j] = split[i];
            }
            return String.valueOf(Arrays.stream(numbers).map(x -> x.replaceAll(",", "")).mapToInt(Integer::parseInt).max().getAsInt());
        } else if (query.contains("")) {
            return "";
        } else if (query.contains("")) {
            return "";
        } else {
            return "";
        }
    }
}
