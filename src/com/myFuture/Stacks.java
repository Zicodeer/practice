package com.myFuture;

import java.util.*;

public class Stacks {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    public static void main(String[] args){
        Stack stacks = new Stack();
        for (int i = 0;i < months.length;i++)
            stacks.push(months[i] + "");
            System.out.println("stacks="+stacks);

//            stacks.addElement("the last line");
//            System.out.println("element 5 =" +stacks.elementAt(1));
//            System.out.println("popping elements:");
            while (!stacks.empty())
                System.out.println(stacks.pop());

    }
}
