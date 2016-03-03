/*
*File Name:
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/
*Toolkit:vim
*/
import java.lang.*;
import java.util.Scanner;
public class reverse {
    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            y = y *10 + x % 10;
            x = x / 10;
        }
        return y;
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int addtimes = 0;
        while ( x!= reverse(x)) {
            x = x + reverse(x);
            addtimes++;
        }
        System.out.println("Time:"+addtimes);
        System.out.println("Reverse:"+reverse(x));
    }

}
