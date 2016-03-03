/*

    struct ab( ) {  物件
    }  
    
    int fun(struct abc *c) { function
    }

*/

public class Test {
    int 我的錢包; //object var, 每個物件都有
    static int 全班班費;    //屬於class, 全班只有一個
    //與class同名的method稱為 "constructor"
    //當new物件時, 會用constructor 來init 所有object
    //var得值
    public Test(int 開始的錢) {
        我的錢包 = 開始的錢;
    }
    public void earnMoney(int amount) {
        我的錢包 += amount;
    }
    public void spendMoney(int amount) {
        我的錢包 -= amount;
    }
    public static void 繳班費(int amount) {
        全班班費 += amount;
    }
    public static void 花班費(int amount) {
        全班班費 -= amount;
    }
    public static  int 目前有多少班費() {
        return 全班班費;
    }
    public void 你有多少錢() {
        System.out.print("我的錢包裏有："+我的錢包);
    }
    public void 班費請補助我(int amount) {
        我的錢包 += amount;
        全班班費 += amount;
    }
    public static void main(String[] argv ) {
        Test 右手;
        右手 = new Test(100); //一開始有100元
        右手.你有多少錢();
        右手.earnMoney(300);
        右手.你有多少錢();
        右手.spendMoney(50);
        右手.你有多少錢();
        繳班費(300);
        花班費(100);
        System.out.println("目前班費："+目前有多少班費());
        右手.班費請補助我(40);
        右手.你有多少錢();
        System.out.println("目前班費："+目前有多少班費());
         
    }

}

/* Compare with c lanauage
#include <stdio.h>
int main(int argc, char ** argc) {
    printf("Hello\n") ;
    return 0;
}

*/
