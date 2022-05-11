package io.bparolini.sort.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class NumberListUtils {
    public static int[] generateNumberArray(int size, int maxValue) {
        var rand = new Random();

        int[] numbers = new int[size];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(maxValue);
        }

        return numbers;
    }

    public static List<Integer> generateNumberList(int size, int maxValue) {
        return Arrays.stream(generateNumberArray(size, maxValue)).boxed().toList();
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
