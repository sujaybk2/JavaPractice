package C1Challenges.Sprint2;
import java.util.Scanner;

public class PizzaOrderWithTheMainMethod {
    public static void main(String[] args) {

        //Task 1
        String customerName = "Gary";
        String customerEmail = "gary@123.com";
        int phoneNo = 412312345;
        String address = "20, Marble Drive,Eville";
        int noOfPizzaOrdered = 5;
        float pizzaPrice = 12.5F;
        char pizzaSize = 'M';
        int noOfGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99F;
        int noOfBeveragesOrdered = 3;
        float beveragePrice = 1.99F;

        //Task 2
        float totalPriceOfPizza = noOfPizzaOrdered*pizzaPrice;
        System.out.println(totalPriceOfPizza);
        float totalPriceOfGarlicBread = noOfGarlicBreadOrdered*garlicBreadPrice;
        System.out.println(totalPriceOfGarlicBread);
        float totalPriceOfBeverages = noOfBeveragesOrdered*beveragePrice;
        System.out.println(totalPriceOfBeverages);

        //Task 3
        float totalBill = totalPriceOfPizza+totalPriceOfGarlicBread+totalPriceOfBeverages;
        System.out.println("Total Bill: $" + totalBill);
        if (totalBill>=100)
            System.out.println(true);
        else
            System.out.println(false);

        //Task 4
        System.out.println("-------------------------------");
        System.out.println("     Customer Details");
        System.out.println("-------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Phone Number: " + phoneNo);
        System.out.println("Customer email: " + customerEmail);
        System.out.println("Customer Address: " + address);



        System.out.println("-------------------------------");
        System.out.println("     Order Summary");
        System.out.println("-------------------------------");

        System.out.println("Sr no.  ItemName    ItemQuantity    $Price/Unit    $TotalPrice");
        System.out.println("--------------------------------------------------------------");
        System.out.println("1     " + "  Pizza           " + noOfPizzaOrdered + "             " + pizzaPrice + "             " + totalPriceOfPizza);
        System.out.println("2     " + "  Garlic Bread    " + noOfGarlicBreadOrdered + "             " + garlicBreadPrice + "             " + totalPriceOfGarlicBread);
        System.out.println("3     " + "  Beverages       " + noOfBeveragesOrdered + "             " + beveragePrice + "             " + totalPriceOfBeverages);
        System.out.println("--------------------------------------------------------------");

        System.out.println("Total Bill Amount: $" + totalBill);
        System.out.println("Discount offered : 10%");
        System.out.println("Amount to be paid: $" + totalBill*0.9);
        System.out.println("---------------Thank you-----------------------------");

        Scanner customer = new Scanner(System.in);
        System.out.println("Enter your selection from 1, 2 or 3.");
        String value = customer.nextLine();

    }
}

