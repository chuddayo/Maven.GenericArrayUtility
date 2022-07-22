package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    private List<E> array = new ArrayList<>();

    public ArrayUtility (E[] inputArray) {
        array = new ArrayList<>(Arrays.asList(inputArray));
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        array.addAll(new ArrayList<>(Arrays.asList(arrayToMerge)));
        Integer counter = 0;
        for (E e : array) {
            if(e.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }
    public E getNumberOfOccurrences(E valueToEvaluate) {
        return null;
    }
    public E getMostCommonFromMerge(E[] arrayToMerge) {
        return null;
    }
    public E[] removeValue(E valueToRemove) {
        return null;
    }
}
