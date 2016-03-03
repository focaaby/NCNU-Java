/*
* File Name: Sort.java
* ID: focaaby
* Author: Mao-Lin Wang
* Since: 2016/03/03
* Toolkit: Atom
* Description: Quick sort
*/

public class QuickSort {
    public static void qsort(int[] data) {
        qsort(data, 0, data.length -1);
    }

    private static void qsort(int[] data, int left, int right) {
        if (left >= right)
            return;

        int p = data[left];
        int l = left;
        int r = right + 1;
        while (true) {
            while (data[--r] > p)
                ;
            while (l <= right - 1 && data[++l] <= p)
                ;
            if (l < r) {
                int tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
            } else {
                data[left] = data[r];
                data[r] = p;
                qsort(data, left, r - 1);
                qsort(data, r + 1, right);
                return;
            }
        }
    }

    static void print(int[] data) {
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");;
        System.out.println();
    }

    public static void main(String[] argv) {
        int[] data = new int[] {9, 3, 6, 1, 11, 35, 2, 17};
        qsort(data);
        print(data);
    }
}
