// Write a program that takes a positive integer as input and returns the sum of its digits.

import java.util.Scanner;
class problem1{
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("");

        System.out.println("Welcome, enter a positive number to get sum of digits");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number please: ");
        int number = input.nextInt();
        System.out.println("You have entered: "+number);
        
        int sum = 0;

        while(number>0){
            sum = sum + (number % 10); // or can be written as: sum+=number % 10;
            number = number / 10;
        }

        
        System.out.println("Sum of digits of the number: " + sum);
        input.close();

        System.out.println("");
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("");
        System.out.println("");

    }
}