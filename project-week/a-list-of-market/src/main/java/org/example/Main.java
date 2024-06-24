package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> listOfMarket = new HashMap<>();
        System.out.println("Welcome to the shopping list program!");
        int optionHome = 999;
        while (optionHome != 5) {
            System.out.print("Choose the desired option\n" +
                    "1) - Add item\n" +
                    "2) - List items\n" +
                    "3) - Calculate total\n" +
                    "4) - Remove item\n" +
                    "5) - Exit program\n\n" +
                    "Which option: ");
            optionHome = scanner.nextInt();
            switch (optionHome)  {
                case 1:
                    addProduct(scanner, listOfMarket);
                    break;
                case 2:
                    System.out.print("This is your current shopping list\n");
                    listProducts(listOfMarket);
                    break;
                case 3:
                    sumList(listOfMarket);
                    break;
                case 4:
                    System.out.print("This is the current shopping list: \n\n");
                    listProducts(listOfMarket);
                    removeProduct(scanner, listOfMarket);
                    break;
                case 5:
                    System.out.print("Program closed successfully\n");
                    break;
                default:
                    System.out.print("Invalid option. Choose again\n");
                    break;
            }
        }

    }

    public static void listProducts(Map<String, Double> aListOfMarket) {
        System.out.println("===START===");
        for(Map.Entry<String, Double> product : aListOfMarket.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
        System.out.println("===END===");
    }

    public static void addProduct(Scanner scanner, Map<String, Double> aListOfMarket) {
        System.out.print("Name of product: ");
        String nameProduct = scanner.next();
        System.out.print("Price of product: ");
        double priceProduct = scanner.nextDouble();
        aListOfMarket.put(nameProduct, priceProduct);
        System.out.print("Product added successfully\n");
    }

    public static void removeProduct(Scanner scanner,  Map<String, Double> aListOfMarket) {
        System.out.println("Enter the name of the item you wish to remove: ");
        String nameProduct = scanner.next();
        aListOfMarket.remove(nameProduct);
        System.out.println("Item removed successfully");
    }

    public static void sumList( Map<String, Double> aListOfMarket) {
        double totalPrice = 0;
        for(Map.Entry<String, Double> product : aListOfMarket.entrySet()) {
            totalPrice += product.getValue();
        }
        System.out.print("\n\nThe total value of your list is: $ " + totalPrice + "\n\n");
    }
}
