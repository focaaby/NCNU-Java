/*
*File Name:
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/
*Toolkit:vim
*/
import java.util.Scanner;
public class Queue{
    int[] data = new int[1000];
    int head, tail, size;
    public void add(int x) {
        data[tail++] = x;
        tail %= data.length;
        size++;
    }  
    public int remove() {
        int tmp = data[head++];
        head %= data.length;
        size--;
    }  
    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] argv) {
         
    }

}
