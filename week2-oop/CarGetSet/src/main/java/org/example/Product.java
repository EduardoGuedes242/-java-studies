package org.example;

import java.lang.reflect.Constructor;

public class Product {
  private String name;
  private String observation;

  public Product(String name) {
    setName(name);
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  public String getObservation() {
    return this.name;
  }
  public void setObservation(String observation){
    this.observation = observation;
  }
}
