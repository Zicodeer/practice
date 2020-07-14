package com.algorithm;

public class Quick_sort {
    void quickSort(int data[], int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int temp = data[left];

            while (i < j) {
                while (i < j && data[j] >= temp)
                    j--;
                if (i < j)
                    data[i++] = data[j];

                while (i < j && data[i] < temp)
                    i++;
                if (i < j)
                    data[j--] = data[i];
            }
            data[i] = temp;
        }
    }
}


