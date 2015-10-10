/*
*File Name:car
*ID: focaaby
*Author: Mao-Lin Wang
*Since: 2015/03/13
*Toolkit:vim
*/

import java.util.Scanner;
public class Car2 {
    //objesct cars
    String id;
    int x, y;
    //constructor (方法名字和class同名)
    //and no return
    public Car2(String id, int x, int y) {
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
        Car2[] allCars = new Car2[1000];
        int numCar = 0;
        Scanner input = new Scanner(System.in); 
        while (true) {
            String command = input.next();
            if (command.equals("new")) {   
                allCars[numCar++] = new Car2(input.next(), input.nextInt(), input.nextInt());
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
                } else if (command.equals("destroy")) {
                    allCars[i] = null;
                }
            }
        }
        //print out result
        for (int i = 0; i < numCar; i++) {
            if(allCars[i] != null)
                allCars[i].print();
        }

        for (int i = 0; i < numCar - 1; i++) {
            for (int j = i+1; j < numCar; j++) {
                if(allCars[i] != null && allCars[j] != null) 
                   // System.out.println(allCars[i].id +" to "+ allCars[j].id + " " + Math.sqrt(Math.pow((allCars[i].x - allCars[j].x), 2) + Math.pow((allCars[i].y - allCars[j].y), 2))); 
                    System.out.println(allCars[i].id +" to "+ allCars[j].id+ "  " + Math.sqrt((Math.pow((allCars[i].x - allCars[j].x),2) + Math.pow((allCars[i].y-allCars[j].y),2))));
            }
        }
    }
}
