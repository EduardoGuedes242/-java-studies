package org.example;

public class Car {
  public String modelo;
  public String color;
  public int year;
  private boolean on;
  int velocity;
  int velocityMax = 80;
  void statusCar() {
    System.out.println("The car this on: " + this.on);
  }

  void run(int vel) {
    if (!on) {
      System.out.println("Para acelerar voce precisa estar com carro ligado");
    } else {
      if((velocity + vel) > velocityMax) {
        System.out.println("Não é possivel acellar chegou na velocidade maxima");
      } else {
        velocity = velocity + vel;
        System.out.println("A velocidade atual é: " + velocity);
      }
    }
  }

  void onCar() {
    if(this.on) {
      System.out.println("This car is on");
    } else{
      this.on = true;
    }
  }

}
