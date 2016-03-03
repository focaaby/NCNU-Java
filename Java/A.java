import java.io.*;
public class A {
    public static void unsafe(String[] x) throws Exception {
        for ( int i = 0; i < 10; i++)
            System.out.println(x[i]);
        throw new Exception("我故意亂丟der");
    }
    public static void main(String[] argv) {
        String[] x = new String[] {"Shiuh", "Sheng", "Yu"};
        // try catch 可視為if then else if then eles if 的結構
        try {
            unsafe(x);
        } catch(IOException err2) {
            System.out.println("抓到I/O錯誤" + err2.toString());
        } catch(Exception err) {
            System.out.println("抓到一個錯誤" + err.toString());
        } finally {
            System.out.println("此處不論有無錯誤, 必然會被執行");
        }
    }
}
