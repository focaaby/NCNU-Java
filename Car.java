/*
*File Name:car
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/03/13
*Toolkit:vim

                                  ^
                                  |
                                  |
                                  |                YuerYuer(23, 45)
                                  |                      x
                                  |
                                  |
                                  |
                                  |
                                  |
    ------------------------------|--------------------------------------->x
                                  |
                                  |
             Toyota(-10, -20)     |
                  x               |
                                  |
                                  |
                                  |
                                  |
                                  |

看到了一台車Toyota 在(-10,-20)
後來Toyota 向西走了23 單位, 向北走了37 單位
又看到了一台車YuerYuer 在(23, 45)
Toyota向東走了10 單位
YuerYuer向南走了32 單位, 向東走了58 單位
求最後看到的這幾台車最後座標位置


Input

//new "car name" "x y"

new     toyota 20 31
west    toyota 3
south   toyota 8
new     masta 40 21
east    toyota 6
end

Output:  
所有車輛的最後位置

*/

import java.util.Scanner;
public class Car {
    //objesct cars
    String id;
    int x, y;
    //constructor (方法名字和class同名)
    //and no return
    public Car(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    public void east(int offset) {
        x += offset;
    }
    public void west(int offset) {
        x -= offset;
    }
    public void north(int offset) {
        y += offset;
    }
    public void south(int offset) {
        y -= offset;
    }
    public void print() {
        System.out.println(id +" "+ x +" "+y); 
    }
    public static void main(String[] argv) {
        Car[] allCars = new Car[1000];
        int numCar = 0;
        Scanner input = new Scanner(System.in); 
        while (true) {
            String command = input.next();
            if (command.equals("new")) {   
                allCars[numCar++] = new Car(input.next(), input.nextInt(), input.nextInt());
            } else if(command.equals("end")) {
                break;
            } else {
                String id = input.next();
                int i;
                for (i = 0; i < numCar; i++) { 
                    if (allCars[i].id.equals(id))
                        break;
                }
                if (command.equals("east")) {
                    allCars[i].east(input.nextInt());
                } else if (command.equals("west")) {
                    allCars[i].west(input.nextInt());
                } else if (command.equals("north")) {
                    allCars[i].north(input.nextInt());
                } else if (command.equals("south")) {
                    allCars[i].south(input.nextInt());
                } 
            }
        }
        //print out result
        for (int i = 0; i < numCar; i++)
            allCars[i].print();
    }
}
