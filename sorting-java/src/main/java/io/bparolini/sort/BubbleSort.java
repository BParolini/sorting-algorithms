package io.bparolini.sort;

import io.bparolini.sort.util.NumberListUtils;

public class BubbleSort {
    public static void main(String[] args) {
        var numbers = NumberListUtils.generateNumberArray(10, 1000000);

        System.out.println("Before:");
        NumberListUtils.printArray(numbers);

        //sorting
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (var i = 0; i < numbers.length; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;

                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("After:");
        NumberListUtils.printArray(numbers);
    }
}
