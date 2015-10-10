/*
*    File Name:fun.java
*    ID: focaaby
*    Author: Mao-Lin Wang
*    Since: 2015/03/20
*    Toolkit:vim

**    scoop ----- time ---------------- function
             |                   |
             |                    ----- programe
              --- space ------- function
                         |
                          ----- program
                         |
                          ----- file

*/

/* 

    1. 參數個數和意義
    2. 終止條件
    3. 簡化(99% loop)


*/
import java.util.Scanner;
public class fun {
    int y;
    static int z;
    // 計算1~n的總和
    public static void fun(int x) {
        x = 100;
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        fun(x);
        System.out.println(x); 
    }

}



/*      
    
    ********************
    **   C  PROGRAM   **
    ********************
    
    int y;                 //time ->program, scope->program
    static int z;          //time->program, scope->file
    int main() {           
        int x;             //time -> function, scope->main()裡面
        static int z;      //time->program, scope->main()裡面
    }
    
    ********************
    **  JAVA PROGRAM  **
    ********************

    scope 括弧內 () {}  
    time: function, object, class

    call by value: C & java
    => 運算的結果"複製"到stack(產生新的car)




*/ 
