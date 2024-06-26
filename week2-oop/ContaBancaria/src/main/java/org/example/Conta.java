package org.example;

public class Conta {
  private int number;
  private String type;
  private String user;
  private double salt;
  private boolean status;

  public Conta(int number,String type, String user) {
    this.number = number;
    this.type = type;
    this.user = user;
    this.salt = 0.0;
    this.status = true;
  }

  public double getSalt() {
    return this.salt;
  }

  public void  depositarDinheiro(double salt) {
    if(this.status) {
      this.salt = this.salt + salt;
      System.out.println("Deposito realizado com sucesso");
    } else {
      System.out.println("Conta esta desativada");
    }
  }

  public boolean sacarDinheiro(double salt) {
    if(this.status) {
      if(salt > this.salt)  {
        System.out.println("Voce nao tem saldo suficiente");
        return false;
      } else {
        this.salt = this.salt - salt;
        System.out.println("Saque realizado com sucesso no valor de: R$" + salt);
        return true;
      }
    } else {
      System.out.println("Conta esta desativada");
      return false;
    }
  }

  public void encerrarConta(){
    if(this.status) {
      this.sacarDinheiro(getSalt());
      this.status = false;
      System.out.println("Conta Encerrada com sucesso");
    } else {
      System.out.println("Esta conta ja foi encerrada");
    }
  }

  public void cobrancaAnuidade() {
    if(this.status) {
      if (!this.sacarDinheiro(10)) {
        System.out.println("saldo suficiente para cobrança de anuidade - Conta ira ser desativada");
        this.status = false;
      } else {
        System.out.println("Conta renovada com sucesso");
      }
    } else {
      System.out.println("Essa conta esta desativada.");
    }
  }
}
