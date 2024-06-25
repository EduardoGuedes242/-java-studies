package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Your car: ");
    Car car1 = new Car();

    car1.color = "Red";
    car1.modelo = "vectra";
    car1.velocityMax = 120;
    car1.run(30);
    car1.onCar();
    car1.run(60);
  }
}