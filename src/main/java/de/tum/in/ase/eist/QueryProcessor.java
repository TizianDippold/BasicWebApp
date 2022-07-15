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
            return String.valueOf(Integer.parseInt(query.split(" ")[2]) + Integer.parseInt(query.split(" ")[4]));
        } else if (query.contains("largest")) {
            String[] split = query.split(" ");
            String[]numbers = new String[split.length - 8];
            for (int i = 8; i<split.length; i++){
                numbers[i] = split[i];
            }
            return Arrays.stream(numbers).map(x->x.replaceAll(",","")).mapToInt(Integer::parseInt).max().toString();
        } else if (query.contains("")) {
            return "";
        } else if (query.contains("")) {
            return "";
        } else {
            return "";
        }
    }
}
