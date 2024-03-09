package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> transformAndSort(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Boria", "Denchik", "Aloshka", "Fedia", "Cilynochka");
        List<String> result = transformAndSort(names);
        System.out.println(result);
    }
}
