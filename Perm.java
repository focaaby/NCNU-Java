/*
*File Name:
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/
*Toolkit:vim
*/
import java.util.Scanner;
public class Perm {
    public static void comb(char[] data, int m) {
        comb(data, m, 0, 0);
    }
    // 由pos之後選出m-got個
    public static void comb(char[] data, int m, int pos, int got) {
        if (m == got) {
            for (int i = 0; i < m; i++) 
                System.out.print(data[i]);
	    System.out.println();
            return;
        }
        //由pos到data.lenght-1之間選定ㄧ個元素
        for (int i = pos; i < data.length; i++) {
            //採用swap的方法
            //將元素i放到前面去(got這個位置)
            char tmp = data[i];
            data[i] = data[got];
            data[got] = tmp;
            comb(data, m, i +1, got+1);
            // 在交換回來, 已回復原始的順序
            tmp = data[i];
            data[i] = data[got];
            data[got] = tmp;
        } 
            
    }
    // 由pos之後選出m-got個
    public static void perm(char[] data) {
        perm(data, 0); 
    }
    // data 要排列的陣列
    // pos 由pos這個位置以後的元素做排列
    public static void perm(char[] data, int pos) {
        // 終止條件
        if (pos == data.length -1) {
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i]);
            System.out.println();
            return;
        }
        //化簡
        //由pos~data.length -1 之間的元素任挑一個放到pos位置上
        for (int i = pos; i < data.length; i++) {
            //我們先用插入法
            char tmp = data[i];
            for (int j = i; j > pos; j--) 
                data[j] = data[j-1];
            data[pos] = tmp;
            perm(data, pos+1);
            tmp = data[pos];
            for (int j = pos; j < i; j++) 
                data[j] = data[j+1];
            data[i] = tmp;
        }
    }
    public static void main(String[] argv) {
        char d[] = {'A', 'B', 'C', 'D', 'E'};
        comb(d, 2);   
    }
}
