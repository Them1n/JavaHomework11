package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLengthMapper {

    public static Map<String, Integer> mapStringLengths(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            int letterCount = countLetters(str);
            result.put(str, letterCount);
        }

        return result;
    }

    private static int countLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("here", "there", "table");
        Map<String, Integer> lengthsMap = mapStringLengths(strings);

        for (Map.Entry<String, Integer> entry : lengthsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}