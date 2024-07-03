package org.example;

public class User extends Pessoa {
  private String password;

  public User(String name, String email, String phone, String  password ){
    setName(name);
    setEmail(email);
    setPhone(phone);
    setPassword(password);
    setActive(true);
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
