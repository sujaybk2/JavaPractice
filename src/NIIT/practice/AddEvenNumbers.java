package NIIT.practice;

import java.util.Scanner;
public class AddEvenNumbers {
    public static void main(String[] args) {
        //add even numbers
        /*BEGIN
        use scanner
        Accept input
        Create a loop
        Iterate until even numbers are added
        Output the sum
        END
        1 2 3 4


       2022 => 2+2+2=>6
       scanner class -> 78962 =>8+6+2=>16
       even/ odd => 7%2==0, 8%2==0
       input%2==0 => input is a even number or odd
       78962%10 => 2
       2%2==0 => even number
       78962/10 => 7896
       7896%10 =>6
       6%2==0 =>even number
        7896/10 => 789
        789%10 => 9
        9%2==0 => odd number
        789/10=> 78
        78%10=> 8
        8%2==0 =>even
        78/10=> 7
        7%2==0 =>odd number
        7/10=> 0
        */
                Scanner sc=new Scanner(System.in);
                System.out.println("Please enter the number");
                int num=sc.nextInt();
                int lastnum;
                int evennum=0;
                while(num!=0)//0
                {
                    lastnum= num%10; //7%10=>0
                    if(lastnum%2==0)//0%2==0
                    {
                        evennum=evennum+lastnum;//0+2=2 //2+6 =8 //8+8 =16
                    }
                    num=num/10;// 78962/10=> 7896  //7896/10 =>789 //789/10=>78 //78/10=>7 //7/10=>0
                }
                System.out.println("Even number sum is "+ evennum);
            }
        }
