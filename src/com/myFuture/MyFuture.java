package com.myFuture;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MyFuture {
    /*
    将数组转换为list

     */


    public static void main(String[] args) {
        String[] myArray = {"nike", "lisa", "peter"};
        List<String> list = Arrays.asList(myArray);
        //
        List<String> mylist = Arrays.asList("apple", "orrange", "pule");

        int myarray[] = {1, 2, 3};
        List mylist1 = Arrays.asList(myarray);


        System.out.println(mylist1.get(0));
        int[] array2 = (int[]) mylist1.get(0);
        System.out.println(array2[0]);
        //使用包装类型解决上面的问题

        Integer[] Array3 = {1, 2, 3};


        //使用集合修改方法 add(),remove(),clear();

        List list2 = Arrays.asList(4, 5, 6);
        list2.add(4); //运行会报错
        list2.remove(1);//error

        //将数组转换为ArrayList
        List list3 = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Integer[] array3 = {1, 2, 3};
        List list4 = Arrays.stream(array3).collect(Collectors.toList());
        //基本类型也可以转换
        int[] array4 = {1, 2, 3};
        List list5 = Arrays.stream(array4).boxed().collect(Collectors.toList());


        //List<String> t1 = Lists.newArrayList("a","b","c");


//        String [] str = new String[]{"ass","bs","cs"};
//        List li = Arrays.asList(str);
//        Collections.reverse(li);
//        str = list.toArray(new String[0]);






    }


}
