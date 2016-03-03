/*
* ID: focaaby
* Author: Mao-Lin Wang
* Since: 2016/03/03
* Toolkit: Atom
* Description: Quick sort

* Worst Case: 選到 最大/最小 的
* 如何避免：medium of 3, 選三個比大小, 選的中間那個
    => 如何選這三個數：最左邊(left), 最右邊(rigth), 中間
    => 使用 bubble sort 讓這三個排序。 時間複雜度 constant
    => 這三個數排序完之後，讓 midium 跟倒數第二位置交換


* 通用最快的 Sort  *
    => 可以先用 Quick Sort 來大致排序
    => 每堆數量大約 28~32個(可以去查看資料，有研究數據)
    => 再用 Insertion Sort進行每一堆的排序

*/

public class QuickSortAdv {
    public static void qsort(int[] data) {
        qsort(data, 0, data.length - 1);
    }

    private static void qsort(int[] data, int left, int right) {
        int tmp;
        if (left >= right) // <= 1 element
            return;
        if(left + 1 == right) { // 2 elements only
            if (data[left] > data[right]) {
                tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
            }
            return;
        }
        int mid = (left + right)/ 2;
        // bubble sort: left, mid, and right
        if (data[left] > data[mid]) {
            tmp = data[left];
            data[left] = data[mid];
            data[mid] = tmp;
        }
        if(data[mid] > data[right]) {
            tmp = data[mid];
            data[mid] = data[right];
            data[right] = tmp;
        }
        if (data[left] > data[right]) {
            tmp = data[left];
            data[left] = data[right];
            data[right] = tmp;
        }
        if(left + 2 == right)
            return;

        //swap mid and right -1;
        tmp = data[mid];
        data[mid] = data[right - 1];
        data[right - 1] = tmp;

        // so sentinel now at right -1
        int p = tmp;
        int l = left;
        int r = right - 1;

        while (true) {
            while (data[--r] > p)
                ;
            while (data[++l] < p)
                ;
            /*
                if data contains many identical value recommend the following code:

                while (l < right - 1 && data[++l] <= p)
                    ;
            */

            if (l < r) {
                tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
            } else {
                data[right - 1] = data[l];
                data[l] = p;
                qsort(data, left, l - 1);
                qsort(data, l + 1, right);
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
