package com.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//循环递归
public class Recursion {

    public static void main(String[] args) {

        String[] str = new String[] {"1", "2","3"};
        ListAll(Arrays.asList(str), "");

    }

    public static void ListAll(List candidate, String prefix) {
        if (candidate.isEmpty()) {
            System.out.println(prefix);
        }
        for (int i = 0; i < candidate.size(); i++) {
            List temp = new LinkedList(candidate);
            ListAll(temp, prefix + temp.remove(i));
        }
    }

}