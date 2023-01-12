package InClassPractice.C4;

import java.util.Scanner;

class ThrowsEx1
{
    String checkAge(int age) throws ArithmeticException
    {
        String msg=null;
        if (age <= 13)
        {
            // msg="Not eligible for voting";
            throw new ArithmeticException("Not eligible for registration");
        }
        else
        {
            msg="Eligible for registration";
        }
        return msg;
    }

    public static void main(String[] args) throws ArithmeticException {
        ThrowsEx1 t=new ThrowsEx1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of the user");
        int age=sc.nextInt();
        String message = null;
        //String message = t.checkAge(age);
        try {
            message = t.checkAge(age);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(message);
    }

}
