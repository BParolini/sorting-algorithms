package io.bparolini.sort;

import io.bparolini.sort.util.NumberListUtils;

import java.util.Collections;
import java.util.List;

public class ShuffleSort {

    public static void main(String[] args) {
        var numberList = NumberListUtils.generateNumberList(12, 10000);

        while (!isListSorted(numberList)) {
            Collections.shuffle(numberList);
        }

        numberList.forEach(System.out::println);
    }

    private static boolean isListSorted(List<Integer> numberList) {
        if (numberList == null) {
            return true;
        }

        var length = numberList.size();
        if (length <= 1) {
            return true;
        }

        for (var i = 0; i < length; i++) {
            if (numberList.get(i) > numberList.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
