package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbsreader = new Scanner(System.in);
        System.out.println("Please enter your name here:");
        String name = kbsreader.nextLine();

        perfectRandom personOne = new perfectRandom();
        System.out.println("Nice to meet you " + name + "! Your lucky number is: " + personOne);
        System.out.println("Press 0 to exit, 1 to see the name and object again, and 2 to enter another name");
        int press = kbsreader.nextInt();
        if (press == 0){
            break;
        }else if (press == 1){
            System.out.println("Nice to meet you " + name + "! Your lucky number is: " + personOne);
        }else (press == 2){
            System.out.println("Please enter your name here:");
            String name = kbsreader.nextLine();
        }
}
}
