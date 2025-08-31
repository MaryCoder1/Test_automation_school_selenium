package com.graham.task5;
import java.util.Scanner;

public class CondAndRelatStatement {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input1.nextInt();
        if(num1 % 3 == 0) {
            System.out.println("Fizz");
        }
        else if(num1 % 5 == 0){
            System.out.println("Buzz");

        }
        else if(num1 % 5 == 0 && num1 % 3 == 0){
            System.out.println("FizzBuzz");
        }
    }
}
