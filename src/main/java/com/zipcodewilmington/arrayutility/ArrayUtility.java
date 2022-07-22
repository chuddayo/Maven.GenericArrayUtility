package com.zipcodewilmington.arrayutility;

import java.util.*;

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
        return getNumberOfOccurrences(valueToEvaluate);
    }
    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        Integer counter = 0;
        for (E e : array) {
            if(e.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }
    public E getMostCommonFromMerge(E[] arrayToMerge) {
        array.addAll(new ArrayList<>(Arrays.asList(arrayToMerge)));
        HashMap<E, Integer> frequencyMap = new HashMap<>();
        for (E e : array) {
            if (frequencyMap.containsKey(e)) {
                frequencyMap.put(e, frequencyMap.get(e) + 1);
            } else {
                frequencyMap.put(e, 1);
            }
        }

        Map.Entry<E, Integer> maxEntry = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue());
        return maxEntry.getKey();
    }
    public E[] removeValue(E valueToRemove) {
        array.removeIf(i -> Objects.equals(i, valueToRemove));
        if (valueToRemove instanceof Integer) {
            return (E[]) array.toArray(new Integer[0]);
        } else if (valueToRemove instanceof String) {
            return (E[]) array.toArray(new String[0]);
        } else {
            return (E[]) array.toArray(new Long[0]);
        }
    }
}
