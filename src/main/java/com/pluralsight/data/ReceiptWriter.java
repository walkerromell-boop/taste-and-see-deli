package com.pluralsight.data;

import com.pluralsight.models.Order;

public class ReceiptWriter { //use buffered writer in this class
    public static void saveReceipt(Order order) {
        // generate filename using current date/time (yyyyMMdd-HH .txt)
        // create a FileWriter and wrap in BufferedWriter (src/main/resources/receipts)

        // loop through all order items
        //   - write the items to the to receipt

        //write total cost

        // close BufferedWriter
        // handle IOException with error message
    }

    private static String generateTimestamp() {
        // Create timestamp string using a formatter
        // return that string
        return "";
    }

//    public void printReceipt() {
//        System.out.println("Your Sandwich:");
//        System.out.println(breadSize + " inch " + (toasted ? "toasted " : "") + breadType + " sandwich");
//        System.out.println("\nToppings:");
//
//        for (Ingredient topping : toppings) {
//            System.out.println(" - " + topping);
//        }
//
//        System.out.printf("\nTotal Price: $%.2f%n", getValue());
//    }

}
