/*
*File Name:
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/
*Toolkit:vim
    

****     Queue -> Thread Queue    ****
     1. add synchronized 
*/
import java.util.Scanner;
public class Thread_Queue{
    int[] data = new int[1000];
    int head, tail, size;
    public Stack() {
    } 

    public synchronized void add(int x) {
        while (size >= data.length) {
            try {
                wait();
            } catch(Exception err) {
            }
        } 
        data[tail++] = x;
        tail %= data.length;
        size++;
        if ( size == 1) { // 在我放之前，此queue是空的，要叫醒可能的等待者
            // 此處用notify()是錯的
            notifyAll();
        }
    }  
    public synchronized int remove() {
        int tmp = data[head++];
        head %= data.length;
        size--;
    }  
    public synchronized boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] argv) {
         
    }

}
