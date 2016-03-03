/*
* File Name: 
* ID:100213020
* Author: 王茂林
* Since 2012/03/07
* Toolkit: UltraEdit
*/

/*
p.flyTo(425, 325); 
        //p.flyTo((int)(Math.cos(0)) * 200 + 425,(int)(Math.sin(0)) * 200 + 325 ); //設定起始座標
        for(int i = 2 ; i <= 24 ; i += 2) //12邊形的各頂點
            p.runTo((int)(Math.cos(i * PI / 12) * 200 + 425), (int)(Math.sin(i * PI / 12) * 200) + 325);
*/    

import java.lang.Math;
public class Draw {
    public static double PI = Math.PI;
//    public static int heart_up(int x) {
//    	return (int)(Math.pow(1 - (Math.pow((Math.abs(x) - 1), 2)), 1/2));
//   }
    public static void main(String[] argv) {
        Pen p = new Pen();
        
        

        for (int r = 1; r <= 200; r += 10) {
            p.flyTo((int)(Math.cos(0)) * r + 425,(int)(Math.sin(0)) * r + 325 ); //設定起始座標
            for (double i = 0 ; i <= 2 * Math.PI ; i += 2 * Math.PI / 10000) {
                p.runTo((int)(Math.cos(i) * r + 425), (int)(Math.sin(i) * r) + 325); 

            }
        }    
    }
}
