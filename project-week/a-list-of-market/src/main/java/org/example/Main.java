package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> listOfMarket = new HashMap<>();
        System.out.println("Welcome of program list of market!");
        int optionHome = 999;

        while (optionHome != 5) {
            System.out.print("Choice option wished\n" +
                    "1) - add item\n" +
                    "2) - list\n" +
                    "3) - sum\n" +
                    "4) - remove item\n" +
                    "5) - Close program\n\n" +
                    "Which option: ");
            optionHome = scanner.nextInt();
            String nameProduct;
            double priceProduct;
            if (optionHome == 1) {
                System.out.print("Name of product: ");
                nameProduct = scanner.next();
                System.out.print("Price of product: ");
                priceProduct = scanner.nextDouble();

                listOfMarket.put(nameProduct, priceProduct);

                System.out.print("Produto adicionado com sucesso\n");
            } else if (optionHome == 2) {
                System.out.print("Essa é sua lista de compras atual\n");
                System.out.println("===INICIO===");
                System.out.print(listOfMarket.entrySet());
                System.out.println("===FIM===");
            } else if (optionHome == 3) {
                //Somar os valores da lista de compras
            } else if (optionHome == 4) {
                System.out.print("Essa é a lista de compras atual: \n\n");
                System.out.println("===INICIO===");
                System.out.print(listOfMarket.entrySet());
                System.out.println("\n===FIM===");

                System.out.println("Informe o nome do item que deseja remover: ");
                nameProduct = scanner.next();
                listOfMarket.remove(nameProduct);
                System.out.println("item removido com sucesso ");
            } else {
                if(optionHome == 5) {
                    System.out.print("Programa encerrado com sucesso\n");
                } else {
                    System.out.print("Opção invalida. Escolha novamente\n");
                }
            }
        }
    }
}