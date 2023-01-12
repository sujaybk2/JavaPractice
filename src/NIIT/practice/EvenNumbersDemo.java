package NIIT.practice;

import java.util.Scanner;

public class EvenNumbersDemo {
    public static void main(String[] args) {
        //display all even numbers from 1-50
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int variable = obj.nextInt(); //this is the same as int a = 10

        for(int i =1; i<=variable; i++){
            if(i%2==0){
                if(i==10){
                    System.out.println("Since 10 is already known to be even, it will not print");
                    break;
                }
                System.out.println(i + " is an even number");
            }
        }
    }
}
