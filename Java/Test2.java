/*
 *  Since:2015/03/06
 *  [Array]
 *  int[] x = new int[12];
 *  x[0] = 5;
 *  x[1] = 1;
*/
import java.lang.*;
import java.util.Scanner;
public class Test2 {
    int x; //x is an "onject varible"
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float f = input.nextFloat();
        System.out.println(n);
        System.out.println(f);
        //offset is "local varible"
        int[] offset = {5, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3};
        String[] x;
        x = new String[]{"abc", "def"};
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
