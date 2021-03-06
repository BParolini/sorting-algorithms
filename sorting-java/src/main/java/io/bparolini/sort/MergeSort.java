package io.bparolini.sort;

import io.bparolini.sort.util.NumberListUtils;

public class MergeSort {
    public static void main(String[] args) {
        var numbers = NumberListUtils.generateNumberArray(10, 1000000);

        System.out.println("Before:");
        NumberListUtils.printArray(numbers);

        //sorting
        mergeSort(numbers);

        System.out.println("After:");
        NumberListUtils.printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i++];
            }
            else {
                inputArray[k] = rightHalf[j++];
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k++] = leftHalf[i++];
        }

        while (j < rightSize) {
            inputArray[k++] = rightHalf[j++];
        }
    }
}
