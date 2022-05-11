package io.bparolini.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleSort {

    public static void main(String[] args) {
        var rand = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (var i = 0; i < 12; i++) {
            numberList.add(rand.nextInt(10000));
        }

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
