package NIIT.practice;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int a[]=new int [5];//array declaration
        int b[]={1,2,3,4,5};//array initialization
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Values of Array a[]");
        for(int i=0;i<5;i++)
        {
            System.out.println("a"+"["+i+"] : "+a[i]);

            for(int array1:a)
            {
                System.out.println("Element at " + array1);
            }
        }
    }
}
