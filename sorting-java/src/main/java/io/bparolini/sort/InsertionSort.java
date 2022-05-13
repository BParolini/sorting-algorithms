package io.bparolini.sort;

import io.bparolini.sort.util.NumberListUtils;

public class InsertionSort {
    public static void main(String[] args) {
        var numbers = NumberListUtils.generateNumberArray(10, 1000000);

        System.out.println("Before:");
        NumberListUtils.printArray(numbers);

        //sorting
        insertionSort(numbers);

        System.out.println("After:");
        NumberListUtils.printArray(numbers);
    }

    private static void insertionSort(int[] numbers) {
        for (var i = 0; i < numbers.length; i++) {
            var currentValue = numbers[i];

            var j = i - 1;
            while (j >= 0 && numbers[j] > currentValue) {
                numbers[j + 1] = numbers[j--];
            }
            numbers[j + 1] = currentValue;
        }
    }
}
