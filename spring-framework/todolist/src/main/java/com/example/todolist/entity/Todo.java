package com.example.todolist.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "todos")
public class Todo {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private String phoneNotify;
  private boolean concluded;

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

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public String getphoneNotify() {
    return phoneNotify;
  }
  public void setphoneNotify(String phoneNotify) {
    this.phoneNotify = phoneNotify;
  }

  public boolean isConcluded() {
    return concluded;
  }
  public void setConcluded(boolean concluded) {
    this.concluded = concluded;
  }
}
