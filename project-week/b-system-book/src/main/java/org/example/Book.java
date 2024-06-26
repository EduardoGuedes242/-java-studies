package org.example;

public class Book {
  private int id;
  private String title;
  private String description;
  private boolean avarible;

  public Book(int id, String title, String description, boolean avarible) {
    setId(id);
    setTitle(title);
    setDescription(description);
    setAvarible(avarible);
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getAvarible() {
    return this.avarible;
  }
  public void setAvarible(boolean avarible) {
    this.avarible = avarible;
  }



}
