package com;

public class Test2 {

    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);

    }
}
