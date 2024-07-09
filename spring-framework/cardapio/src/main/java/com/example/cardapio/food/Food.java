package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Table(name = "foods")
@Entity(name = "foods")
public class Food {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String image;
  private int price;

  public Food() {}

  public Food(FoodRequestDTO data) {
    this.title = data.title();
    this.image = data.image();
    this.price = data.price();
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}
