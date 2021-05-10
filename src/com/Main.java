package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc ;
    public static void main(String[] args){
        CeilingFan fan = new CeilingFan();
        sc = new Scanner(System.in);
        String direction = fan.isCordTwo()? "Forward":"Reverse";
        System.out.println("Current Speed of Fan - "+fan.getCordOne());
        System.out.println("Current Direction of Fan - "+direction);
        System.out.println("There are two pull cords. Which cord will you pull");
        do {

            System.out.println();
            try {

                System.out.println("1. Cord 1 - (To increase or decrease the speed of Fan)");
                System.out.println("2. Cord 2 - (To reverse the direction of fan at current setting)");

                int input = sc.nextInt();
                if (input == 1) {
                    fan.pullCordOne(fan.isCordTwo());

                } else if (input == 2) {
                    fan.pullCordTwo();
                } else {
                    System.out.println("This is invalid input please re-enter your choice");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please try again");
            }
            direction = fan.isCordTwo()? "Forward":"Reverse";
            System.out.println("Current Speed of Fan - "+fan.getCordOne());
            System.out.println("Current Direction of Fan - "+direction);

            if(fan.getCordOne()==0 && exitMode()){
                break;
            }
            sc.nextLine();
        }while (true);
    }

    private static boolean exitMode() {
        boolean flag;
        System.out.println("Do you want to Exit? \n1.Yes \n2.No");
        do {
            try {
                int input = sc.nextInt();

                if (input == 1) {
                    flag = true;
                    break;

                } else if (input == 2) {
                    flag = false;
                    break;
                } else {
                    System.out.println("invalid input");
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Invalid input please try again");
            }
            sc.nextLine();
        }while (true);
        return flag;
    }
}