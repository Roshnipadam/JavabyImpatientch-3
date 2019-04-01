package com.random.kafka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class Seventh implements Comparator<String> {
public int compare(String first, String second) {
        return -1 * first.compareTo(second);
        }
        }

class Seventhh{
    private static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        Collections.sort(strings, comp);
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Peter", "Scott", "Anna"));
        luckySort(strings, new Seventh());
        System.out.println(strings);
    }
}
