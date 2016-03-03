/*
*File Name:
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/
*Toolkit:vim
*/
import java.util.Scanner;
public class Queen{
    int n; //n Queen problem
    int[] board; //棋盤上的狀況
    int[] dirs; //下方的三個方向
    int solutions;
    // constructor
    public Queen(int n) {
        this.n = n;
        board = new int[(n+2)*(n+2)];
        dirs = new int[]{n+1, n+2, n+3};
        //這定邊界
        for (int i = 0; i < n + 2; i++) {
            //上邊界
            board[i] = -1;
           // board[0][i] = -1;
            //下邊界
            board[(n+1) * (n+2) + i] = -1;
           // board[n+1][i] = -1;
            //左邊界
            board[(n+2) * i] = -1;
           // board[i][0] = -1;
            //右邊界
            board[(n+2) * i + (n+1)] = -1;
           // board[i][n+1] = -1;
        }
    }
    public void putQueen(int row) {
        //請問終止條件是?
         if (row > n) {
            solutions++;
            return; 
         }
          //請問如何化簡單？
          //在這個row放一個皇后, 然後recursion 往下移個row放
         for (int i = 1; i <= n; i++) {
             //試著在這個row的第i個column放上皇后
             //座標呢?
             int puton = row*(n+2) +i;
             if(board[puton] == 0) {
                 //可以擺, 所以擺上去
                 board[puton] = 'Q' ;
                 //設定勢力範圍, 有三個方向要設定
                 for (int j = 0; j < dirs.length; j++) {
                     for (int pos = puton + dirs[j]; board[pos] >= 0; pos += dirs[j]) 
                         board[pos]++;
                 }
                 //recursion下一個皇后
                 putQueen(row+1);
                 //拿走皇后
                 board[puton] = 0;
                 for (int j = 0; j < dirs.length; j++) {
                     for (int pos = puton + dirs[j]; board[pos] >= 0; pos += dirs[j])
                         board[pos]--;
                 }
             }
        }
    }
    public void sol() {
        solutions = 0;
        putQueen(1);
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        Queen q = new Queen(n);
        q.sol();
        System.out.println(n + "皇后問題共有" + q.solutions+"解");
    }

}
