package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String sortAndMerge(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortAndMerge(array);
        System.out.println(result);
    }
}
