package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbsreader = new Scanner(System.in);

        int press = 3;

        while(true){
        if (press == 2 || press == 3){
            System.out.println("Please enter your name here:");
            String name = kbsreader.nextLine();
        }
        String name = kbsreader.nextLine();

        perfectRandom personOne = new perfectRandom((int)(Math.random() * 15));

        System.out.println("Press 0 to end, Press 1 to receive your lucky number, Press 2 to enter another name.");

         press = kbsreader.nextInt();
        if (press == 0){
            break;
        }else if (press == 1){
            System.out.println("Nice to meet you " + name + "! Your lucky number is: " + personOne.value);
            }

         }
    }
}
