package com.pluralsight.ui;

import com.pluralsight.models.*;

import java.util.Scanner;

public class UserInterface {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // ----------- Sandwich -----------
        createSandwichMenu(scanner, order);

        // ----------- Drink -----------
        addDrinkMenu(scanner, order);

        // ----------- Chips -----------
        addChipsMenu(scanner, order);

        // ----------- Show summary -----------
        showOrderSummary(order, scanner);
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
        System.out.println("Create a sandwich!");
        System.out.print("Bread type (White, Wheat, Rye, Wrap): ");
        String breadType = scanner.nextLine();

        System.out.print("Bread size (4, 8, 12 inches): ");
        int breadSize = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(breadSize, breadType, toasted);

        // Example: Adding meats
        System.out.print("Add a meat (Turkey/Ham/etc.): ");
        String meatName = scanner.nextLine();
        System.out.print("Extra meat? (yes/no): ");
        boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");
        sandwich.addMeat(meatName, extraMeat);

        // Example: Adding cheese
        System.out.print("Add a cheese (Swiss/Cheddar/etc.): ");
        String cheeseName = scanner.nextLine();
        System.out.print("Extra cheese? (yes/no): ");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");
        sandwich.addCheese(cheeseName, extraCheese);

        // Example: Adding toppings
        System.out.print("Add a topping (Lettuce/Tomato/etc.): ");
        String toppingName = scanner.nextLine();
        sandwich.addTopping(new Ingredient(toppingName, "Topping", 0, false));

        // Add sandwich to order
        order.addSandwich(sandwich);
    }


}
