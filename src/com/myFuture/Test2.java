package com.myFuture;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr){
        arr[0] = 0;
    }
//
//    public static  void test(String str){
//        str = "world";
//
//    }
//
//    public  static  void  main(String[] args){
//        String string = "hello";
//        test(string);
//        System.out.println(string);
//    }


}
