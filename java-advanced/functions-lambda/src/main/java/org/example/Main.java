package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {


    List<Product> listaCarrinho = new ArrayList<Product>();
    Product arroz = new Product("Arroz", 10);
    Product feijao = new Product("Feijao", 20);
    Product cafe = new Product("Cafe", 30);

    listaCarrinho.add(arroz);
    listaCarrinho.add(feijao);
    listaCarrinho.add(cafe);

    for (Product product : listaCarrinho) {
      System.out.println(product.getName());
    }

    System.out.println("-----------------------");
    listaCarrinho.remove(0);

    for (Product product : listaCarrinho) {
      System.out.println(product.getName());
    }

    Iterator productIterator = listaCarrinho.iterator();
    while (productIterator.hasNext()) {
      Product next = productIterator.next();
    }

  }
}