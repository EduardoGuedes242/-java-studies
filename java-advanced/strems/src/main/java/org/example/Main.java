package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
  public static void main(String[] args) {

    List<Product> productList = new ArrayList<>();
    for (int i = 0; i < 1000000; i++) {
      productList.add(new Product("Product" + i, i % 2 == 0));
    }

    long startTime = System.nanoTime();
    List<Product> productListInSaleOff1 = productList.stream()
            .filter(product -> product.saleOff)
            .collect(Collectors.toList());
    long endTime = System.nanoTime();
    long duration1 = (endTime - startTime);

    startTime = System.nanoTime();
    List<Product> productListInSaleOff2 = new ArrayList<>();
    for (Product product : productList) {
      if (product.saleOff) {
        productListInSaleOff2.add(product);
      }
    }
    endTime = System.nanoTime();
    long duration2 = (endTime - startTime);

    System.out.println("Stream duration: " + duration1);
    System.out.println("For-each duration: " + duration2);
    System.out.println("=====================");

    if(duration1 > duration2) {
      System.out.println("Strem Perdeu");
    } else {
      System.out.println("For-each Perdeu");
    }


  }

  static class Product {
    String name;
    boolean saleOff;

    public Product(String name, boolean saleOff) {
      this.name = name;
      this.saleOff = saleOff;
    }
  }
}
