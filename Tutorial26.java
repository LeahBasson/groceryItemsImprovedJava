package tutorial2.pkg6;

import java.util.Scanner;

public class Tutorial26 {

    public static void main(String[] args) {
        // Improve grocery calculator so that any amount of items can be entered.
        Scanner scn = new Scanner(System.in);
        String item;
        double price, total_price = 0;

        int counter = 1;
        System.out.print("Enter item " + counter + " name (or x to stop):");
        item = scn.next();
        int numberOfItems = 0;

        while (!item.equalsIgnoreCase("x")) {
            //read the price, 2 lines of code
            //prompt 
            //actual read

            System.out.print("Discount(yes/no): ");
            String discount = scn.next();

            System.out.print("Price: R");
            price = scn.nextDouble();

            while (price <= 0) {
                System.out.print("Invalid price. please re-enter: R");
                price = scn.nextDouble();
            }

            if ("yes".equals(discount)) {
                double discount_cal = price * 10 / 100;
                double discounted_price = price - discount_cal;
                System.out.println("Discount applied: New price = " + discounted_price);
                total_price += discounted_price;
            } else {
                total_price += price;
            }

            counter++;
            numberOfItems++;
            System.out.print("Enter item " + counter + " name (or x to stop):");
            item = scn.next();

        }
        if (numberOfItems == 0) {
            System.out.println("Nothing purchased.");
        } else {
            System.out.println("\nNumber of items = " + numberOfItems);
            System.out.println("Total price = " + total_price);
        }
//        System.out.println("\nNumber of items: " + numberOfItems);
//        System.out.println("Total amount to pay: R" + total_price);

    }

}
