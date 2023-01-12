package NIIT.practice;

import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        String alpha = sc.nextLine();
        alpha=alpha.toUpperCase();
        switch(alpha){

            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Above average");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Below Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid response");

        }


    }
}
