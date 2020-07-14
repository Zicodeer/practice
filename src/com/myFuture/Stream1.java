package com.myFuture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
    //collection方法
    Stream<String> a0 = new ArrayList<String>().stream();
    Stream<String> a1 = new HashSet<String>().stream();
    Stream<String> a2 = Arrays.stream("a,b,c,d,e".split(","),3,5);


    //of 方法直接将数组转化
    Stream<Integer> c1 = Stream.of(new Integer[5]);
    Stream<String> c2 = Stream.of("a,b,c".split(","));
    Stream<String> c3 = Stream.of("a","b","c");
    //generate方法，接收一个Lambda表达式
    Stream<String> e1 = Stream.generate(()->"hello");
    Stream<Double> e2 = Stream.generate(Math::random);


    //三种基本类型流IntStream,LongStream,DoubleStream
    IntStream s1 = IntStream.of(1,2,3,4,5);

}
