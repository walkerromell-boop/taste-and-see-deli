package com.pluralsight.ui;

import com.pluralsight.data.ReceiptWriter;
import com.pluralsight.models.*;

import java.util.Scanner;

public class UserInterface {


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("=====================================");
            System.out.println("      Welcome to Taste & See Deli    ");
            System.out.println("=====================================");
            System.out.println("1) Start New Order");
            System.out.println("2) Exit Program");
            System.out.print("Choose an option: ");

            String homeChoice = scanner.nextLine();

            switch (homeChoice) {
                case "1":
                    runOrderProcess(scanner);   // <-- NEW method for handling ONE order
                    break;

                case "2":
                    running = false;
                    System.out.println("Thank you for visiting Taste & See Deli!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }

        scanner.close();
    }

    private static void runOrderProcess(Scanner scanner){
        Order order = new Order();

        System.out.println("Welcome to the Taste & See Deli");
        System.out.println("Please take a look at the menu below and choose from the following options!");
        System.out.println();
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) View Order Summary");
            System.out.println("5) Complete Order");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> createSandwichMenu(scanner, order);
                case "2" -> addDrinkMenu(scanner, order);
                case "3" -> addChipsMenu(scanner, order);
                case "4" -> System.out.println("\n" + order.getOrderSummary());
                case "5" -> {
                    ordering = false;
                    completeOrder(order);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for your order!");

//        // ----------- Sandwich -----------
//        createSandwichMenu(scanner, order);
//
//        // ----------- Drink -----------
//        addDrinkMenu(scanner, order);
//
//        // ----------- Chips -----------
//        addChipsMenu(scanner, order);
//
//        // ----------- Show summary -----------
//        showOrderSummary(order, scanner);
    }

    private static void completeOrder(Order order) {
        System.out.println("\nFinal Order Summary:");
        System.out.println(order.getOrderSummary());
        ReceiptWriter.saveReceipt(order);
        System.out.println(" Receipt saved successfully!");
    }

    private static void showOrderSummary(Order order, Scanner scanner) {
        System.out.println("\n" + order.getOrderSummary());

        scanner.close();
    }

    private static void addChipsMenu(Scanner scanner, Order order) {
        System.out.println("\nChoose chips!");
        System.out.print("Chips name (Doritos/Lays/etc.): ");
        String chipName = scanner.nextLine();
        Chips chip = new Chips(chipName);
        order.addChips(chip);
    }

    private static void addDrinkMenu(Scanner scanner, Order order) {
        System.out.println("\nChoose a drink!");
        System.out.print("Drink name (Coke/Pepsi/etc.): ");
        String drinkName = scanner.nextLine();
        System.out.print("Drink size (Small/Medium/Large): ");
        String drinkSize = scanner.nextLine();
        Drink drink = new Drink(drinkName, drinkSize);
        order.addDrink(drink);
    }

    private static void createSandwichMenu(Scanner scanner, Order order) {
        System.out.println("Let's create a sandwich!");

        // --- Bread ---
        System.out.print("Bread type (White, Wheat, Italian, Grain): ");
        String breadType = scanner.nextLine().trim();

        System.out.print("Bread size (4, 8, 12 inches): ");
        int breadSize = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(breadSize, breadType, toasted);

        // --- Meats ---
        boolean addMoreMeats = true;

        while (addMoreMeats) {
            System.out.println("Available meats: chicken, turkey, ham, roastbeef, meatball");
            System.out.print("Add a meat (or press Enter to skip): ");
            String meatName = scanner.nextLine().trim();

            // If user presses Enter or says "no", stop asking for meats
            if (meatName.isEmpty() || meatName.equalsIgnoreCase("no")) {
                break;
            }

            // Ask if they want extra of THIS meat
            System.out.print("Do you want extra meat of current selection? (yes/no): ");
            boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");

            // Add the meat (with or without extra)
            sandwich.addMeat(meatName, extraMeat);

            // Ask if they want to add a *different* meat type
            System.out.print("Add another meat type? (yes/no): ");
            String addAnother = scanner.nextLine().trim();

            // If they say no, exit meat loop and move to cheese
            if (addAnother.equalsIgnoreCase("no") || addAnother.isEmpty()) {
                addMoreMeats = false;
            }
        }

        // --- Cheeses ---
        boolean addMoreCheese = true;

        while (addMoreCheese) {
            System.out.println("Available cheeses: provolone, pepper jack, american, white");
            System.out.print("Add a cheese (or press Enter to skip): ");
            String cheeseName = scanner.nextLine().trim();

            // If user presses Enter or says "no", stop asking for cheese
            if (cheeseName.isEmpty() || cheeseName.equalsIgnoreCase("no")) {
                break;
            }

            // Ask if they want extra of this cheese
            System.out.print("Extra cheese of current selection? (yes/no): ");
            boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

            // Add the cheese to the sandwich
            sandwich.addCheese(cheeseName, extraCheese);

            // Ask if they want to add another type of cheese
            System.out.print("Add another cheese type? (yes/no): ");
            String addAnotherCheese = scanner.nextLine().trim();

            if (addAnotherCheese.equalsIgnoreCase("no") || addAnotherCheese.isEmpty()) {
                addMoreCheese = false;
            }
        }


        // --- Toppings ---
        while (true) {
            System.out.print("Add a topping (Lettuce, Peppers, Onions, Tomatoes, " +
                    "Jalapeños, Cucumbers, Pickles, Guacamole, Mushrooms) " +
                    "(or press Enter to skip): ");
            String toppingName = scanner.nextLine().trim();
            if (toppingName.isEmpty()) break;

            sandwich.addTopping(new Ingredient(toppingName, "Topping", 0, false));
        }

        // --- Sauces ---
        while (true) {
            System.out.print("Add a sauce (Mayo, Mustard, Ketchup, Ranch, " +
                    "Thousand Island, Vinaigrette) (or press Enter to skip): ");
            String sauceName = scanner.nextLine().trim();
            if (sauceName.isEmpty()) break;

            sandwich.addSauce(new Sauce(sauceName));
        }

        // --- Add sandwich to order ---
        order.addSandwich(sandwich);
        System.out.println("Sandwich added to order!");
    }
}


//    private static void createSandwichMenu(Scanner scanner, Order order) {
//        System.out.println("Let's create a sandwich!");
//        System.out.print("Bread type (White, Wheat, Italian, Grain): ");
//        String breadType = scanner.nextLine();
//
//        System.out.print("Bread size (4, 8, 12 inches): ");
//        int breadSize = scanner.nextInt();
//        scanner.nextLine(); // consume newline
//
//        System.out.print("Toasted? (yes/no): ");
//        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");
//
//        Sandwich sandwich = new Sandwich(breadSize, breadType, toasted);
//
//        // --- Meats ---
//        while (true) {
//                System.out.print("Add a meat (chicken, turkey, ham, roastbeef, meatball) " +
//                        "(or press Enter to skip): ");
//                String meatName = scanner.nextLine().trim();
//
//                if (meatName.isEmpty() || meatName.equalsIgnoreCase("no")) {
//                    break; // stop asking for more meats
//                }
//
//                System.out.print("Extra meat? (yes/no): ");
//                boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");
//
//                sandwich.addMeat(meatName, extraMeat);
//            }
//
//            // --- Cheeses ---
//            while (true) {
//                System.out.print("What type of cheese(provalone, pepper jack, american, white)" +
//                        " (or press Enter to skip): ");
//                String cheeseName = scanner.nextLine().trim();
//                if (cheeseName.isEmpty() || cheeseName.equalsIgnoreCase("no")) break;
//
//
//                System.out.print("Extra cheese? (yes/no): ");
//                boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");
//                sandwich.addCheese(cheeseName, extraCheese);
//            }
//
//            // --- Toppings ---
//            while (true) {
//                System.out.print("Add a topping ( Lettuce\n" +
//                        "Peppers\n" +
//                        "Onions\n" +
//                        "Tomatoes\n" +
//                        "Jalapeños\n" +
//                        "Cucumbers\n" +
//                        "Pickles\n" +
//                        "Guacamole\n" +
//                        "Mushrooms) (or press Enter to skip): ");
//                String toppingName = scanner.nextLine().trim();
//                if (toppingName.isEmpty() || toppingName.equalsIgnoreCase("no")) break;
//
//                sandwich.addTopping(new Ingredient(toppingName, "Topping", 0, false));
//            }
//
//            // --- Sauces ---
//            while (true) {
//                System.out.print("Add a sauce (Mayo\n" +
//                        "Mustard\n" +
//                        "Ketchup\n" +
//                        "Ranch\n" +
//                        "Thousand Island\n" +
//                        "Vinaigrette) (or press Enter to skip): ");
//                String sauceName = scanner.nextLine().trim();
//                if (sauceName.isEmpty() || sauceName.equalsIgnoreCase("no")) break;
//
//
//                order.addSandwich(sandwich);
//
//                System.out.println(" Sandwich added to order!");
//            }
//
//
//        }
//    }

