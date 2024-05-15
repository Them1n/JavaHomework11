package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceTest {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        addElements(arrayList, 1000000);
        long endTime = System.nanoTime();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        addElements(linkedList, 1000000);
        endTime = System.nanoTime();
        System.out.println("LinkedList add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        selectRandomElements(arrayList, 1000000);
        endTime = System.nanoTime();
        System.out.println("ArrayList random selection time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        selectRandomElements(linkedList, 1000000);
        endTime = System.nanoTime();
        System.out.println("LinkedList random selection time: " + (endTime - startTime) + " ns");
    }

    private static void addElements(List<Integer> list, int count) {
        for (long i = 0; i < count; i++) {
            list.add((int) i);
        }
    }

    private static void selectRandomElements(List<Integer> list, int count) {
        Random random = new Random();
        int size = list.size();
        for (long i = 0; i < count; i++) {
            int index = random.nextInt(size);
            list.get(index);
        }
    }
}