package com.atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceDemo {
    public static void main(String[] args){

        final Integer initialRef = 0,initialStamp =0;
        final AtomicStampedReference<Integer> asr = new AtomicStampedReference<>(initialRef,initialStamp);
        System.out.println("currentValue="+asr.getReference()+",currentStamp="+asr.getStamp());

        final Integer newReference = 666,newStamp = 999;
        final boolean casResult = asr.compareAndSet(initialRef,newReference,initialStamp,newStamp);
        System.out.println("currentValue="+asr.getReference()+",currentStamp"+asr.getStamp()+",casResult="+casResult);

        int[] arr = new int[1];
        final Integer currentValue = asr.get(arr);
        final int currentStamp = arr[0];
        System.out.println("currentValue="+asr.getReference()+",currentStamp="+asr.getStamp());


        final boolean attemptStampResult = asr.attemptStamp(newReference,88);
        System.out.println("currentValue=" + asr.getReference()
                + ", currentStamp=" + asr.getStamp()
                + ", attemptStampResult=" + attemptStampResult);

        asr.set(initialRef,initialStamp);
        System.out.println("currentValue=" + asr.getReference() + ", currentStamp=" + asr.getStamp());


        final boolean wCasResult = asr.weakCompareAndSet(initialRef, newReference, initialStamp, newStamp);
        System.out.println("currentValue=" + asr.getReference()
                + ", currentStamp=" + asr.getStamp()
                + ", wCasResult=" + wCasResult);

    }



}
