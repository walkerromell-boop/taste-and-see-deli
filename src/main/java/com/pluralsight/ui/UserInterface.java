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
                    runOrderProcess(scanner);   //  handling ONE order
                    break;

                case "2":
                    running = false;
                    System.out.println("Thank you for visiting Taste & See Deli!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }

    }

    private static void runOrderProcess(Scanner scanner) {
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
            System.out.println("5) Cancel Order");
            System.out.println("6) Complete Order");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    sandwichTypeMenu(scanner, order);
                    System.out.println("\n--- Updated Order Summary ---");
                    System.out.println(order.getOrderSummary());
                }

                case "2" -> {
                    addDrinkMenu(scanner, order);
                    System.out.println("Drink added !");
                    showOrderSummary(order);
                }
                case "3" -> {
                    addChipsMenu(scanner, order);
                    showOrderSummary(order);
                }
                case "4" -> System.out.println("\n" + order.getOrderSummary());
                case "5" -> {
                    if (cancelOrder(scanner, order)) {
                        // order was canceled → return to Start New Order screen
                        return;
                    }
                }
                case "6" -> {
                    ordering = false;
                    completeOrder(order);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }


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

    private static void sandwichTypeMenu(Scanner scanner, Order order) {

        System.out.println("\n--- Sandwich Menu ---");
        System.out.println("1) Build Your Own Sandwich");
        System.out.println("2) Signature Sandwich");
        System.out.print("Choose an option: ");

        String typeChoice = scanner.nextLine();

        switch (typeChoice) {
            case "1" -> createSandwichMenu(scanner, order);
            case "2" -> createSignatureSandwichMenu(scanner, order);
            default -> System.out.println("Invalid option.");
        }
    }

    private static void createSignatureSandwichMenu(Scanner scanner, Order order) {

        boolean running = true;

        while (running) {
            System.out.println("\n=== Signature Sandwich Menu ===");
            System.out.println("1) The OG (customizable)");
            System.out.println("2) Cookie Sandwich");
            System.out.println("3) Go Back to Main Menu");
//            System.out.println("3) Cancel");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1" -> {
                    CustomSandwich og = new CustomSandwich("The OG", 12, "Italian", true);
                    editOGSandwich(scanner, order, og);
                }

                case "2" -> {
                    CookieSandwich cookie = new CookieSandwich();
                    order.addSandwich(cookie);
                    System.out.println("Cookie Sandwich added!");
                    return;
                }

                case "3" -> {
                    System.out.println("Returning to main menu...");
                    running = false;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void editOGSandwich(Scanner scanner, Order order, CustomSandwich og) {

        boolean editing = true;

        while (editing) {
            System.out.println("\n--- Editing “The OG” ---");
            System.out.println(og.getSummary());

            System.out.println("1) Add Ingredient");
            System.out.println("2) Remove Ingredient");
            System.out.println("3) Add Sandwich to Order");
            System.out.println("4) Cancel");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addIngredientToSignature(scanner, og);
                case "2" -> removeIngredientFromSignature(scanner, og);
                case "3" -> {
                    order.addSandwich(og);
                    System.out.println("The OG added to order!");
                    return;
                }
                case "4" -> {
                    System.out.println("Cancelled.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }


    private static void addIngredientToSignature(Scanner scanner, CustomSandwich sandwich) {
        System.out.println("\nAdd ingredient type:");
        System.out.println("1) Meat");
        System.out.println("2) Cheese");
        System.out.println("3) Topping");
        System.out.println("4) Sauce");
        System.out.print("Choose: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.print("Meat name: ");
                String meat = scanner.nextLine();
                System.out.print("Extra? (yes/no): ");
                boolean extra = scanner.nextLine().equalsIgnoreCase("yes");
                sandwich.addMeat(meat, extra);
            }
            case "2" -> {
                System.out.print("Cheese name: ");
                String cheese = scanner.nextLine();
                System.out.print("Extra? (yes/no): ");
                boolean extra = scanner.nextLine().equalsIgnoreCase("yes");
                sandwich.addCheese(cheese, extra);
            }
            case "3" -> {
                System.out.print("Topping name: ");
                String topping = scanner.nextLine();
                sandwich.addTopping(new Ingredient(topping, "Topping", 0, false));
            }
            case "4" -> {
                System.out.print("Sauce name: ");
                String sauce = scanner.nextLine();
                sandwich.addSauce(new Sauce(sauce));
            }
            default -> System.out.println("Invalid option.");
        }
    }

    private static void removeIngredientFromSignature(Scanner scanner, CustomSandwich sandwich) {

        System.out.println("\nRemove ingredient type:");
        System.out.println("1) Meat");
        System.out.println("2) Cheese");
        System.out.println("3) Topping");
        System.out.println("4) Sauce");
        System.out.print("Choose: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.print("Meat to remove: ");
                sandwich.removeMeat(scanner.nextLine());
            }
            case "2" -> {
                System.out.print("Cheese to remove: ");
                sandwich.removeCheese(scanner.nextLine());
            }
            case "3" -> {
                System.out.print("Topping to remove: ");
                sandwich.removeTopping(scanner.nextLine());
            }
            case "4" -> {
                System.out.print("Sauce to remove: ");
                sandwich.removeSauce(scanner.nextLine());
            }
            default -> System.out.println("Invalid option.");
        }
    }


    private static boolean cancelOrder(Scanner scanner, Order order) {
        System.out.println("\nAre you sure you want to cancel the order? (yes/no)");

        String confirm = scanner.nextLine().trim().toLowerCase();

        if (confirm.equals("yes")) {
            order.clear();
            System.out.println("Your order has been cancelled.");
            System.out.println("Returning to the main menu...\n");
        } else {
            System.out.println("Order NOT cancelled. Returning to menu.\n");
        }
        return false;
    }

    private static void completeOrder(Order order) {
        System.out.println("\nFinal Order Summary:");
        System.out.println(order.getOrderSummary());
        ReceiptWriter.saveReceipt(order);
        System.out.println(" Receipt saved successfully!");
    }

    private static void showOrderSummary(Order order) {
        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println(order.getOrderSummary());
        System.out.println("=========================\n");
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

