package com.pluralsight.data;

import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    public static void saveReceipt(Order order) {
        // Create descriptive file name for the receipt
        String fileName = "src/main/resources/receipts/SandwichShop_Receipt_" + generateTimestamp() + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("=====================================\n");
            writer.write("        Sandwich Shop Receipt        \n");
            writer.write("=====================================\n\n");

            // Write the full order summary (from your Order class)
            writer.write(order.getOrderSummary());
            writer.write("\n-------------------------------------\n");
            writer.write(String.format("Total: $%.2f%n", order.getTotal()));

            writer.write("\nThank you for your order!\n");
            writer.write("=====================================\n");

            System.out.println(" Receipt saved to: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

    // Generates timestamp like 20251112-164530
    private static String generateTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return LocalDateTime.now().format(formatter);
    }


}

    //use buffered writer in this class
//    public static void saveReceipt(Order order) {
//        // generate filename using current date/time (yyyyMMdd-HH .txt)
//        // create a FileWriter and wrap in BufferedWriter (src/main/resources/receipts)
//
//        // loop through all order items
//        //   - write the items to the to receipt
//
//        //write total cost
//
//        // close BufferedWriter
//        // handle IOException with error message
//    }
//
//    private static String generateTimestamp() {
//        // Create timestamp string using a formatter
//        // return that string
//        return "";
//    }
//
////    public void printReceipt() {
////        System.out.println("Your Sandwich:");
////        System.out.println(breadSize + " inch " + (toasted ? "toasted " : "") + breadType + " sandwich");
////        System.out.println("\nToppings:");
////
////        for (Ingredient topping : toppings) {
////            System.out.println(" - " + topping);
////        }
////
////        System.out.printf("\nTotal Price: $%.2f%n", getValue());
////    }


