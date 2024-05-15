package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLengthGrouper {

    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        Map<Integer, List<String>> result = new HashMap<>();

        for (String str : strings) {
            int letterCount = countLetters(str);

            result.putIfAbsent(letterCount, new ArrayList<>());

            result.get(letterCount).add(str);
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
        Map<Integer, List<String>> groupedMap = groupStringsByLength(strings);

        for (Map.Entry<Integer, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}