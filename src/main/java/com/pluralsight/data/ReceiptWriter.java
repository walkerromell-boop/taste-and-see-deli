package com.pluralsight.data;

import com.pluralsight.models.Order;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    public static void saveReceipt(Order order) {
        // Create descriptive file name for the receipt
        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdir();  // creates the folder
        }
        String fileName =  generateTimestamp() + ".txt";
        File receiptFile= new File(folder,fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
            writer.write(generateTimestamp()+"\n");
            writer.write("=====================================\n");
            writer.write("              Taste & See        \n");
            writer.write("=====================================\n\n");

            // Write the full order summary (from your Order class)
            writer.write(order.getOrderSummary());
            writer.write("\n-------------------------------------\n");
            writer.write(String.format("Total: $%.2f%n", order.getTotal()));

            writer.write("\nThank you for your order!\n");
            writer.write("\nCome back and see us  soon!\n");
            writer.write("=====================================\n");

            System.out.println(" Receipt saved to: " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

    // Generates timestamp like 20251112-164530
    private static String generateTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd HH:mm:ss");
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


