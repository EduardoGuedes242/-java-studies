package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Seja be vindo ao sistema bancario");
    System.out.println("CONTA DO JOAO");
    Conta contaJoao = new Conta(74, "Corrente", "Joao");
    System.out.println(contaJoao.getSalt());
    contaJoao.sacarDinheiro(50.0);
    contaJoao.depositarDinheiro(500);
    contaJoao.sacarDinheiro(50.0);
    System.out.println(contaJoao.getSalt());
    contaJoao.cobrancaAnuidade();
    contaJoao.sacarDinheiro(435);
    
    contaJoao.encerrarConta();
    contaJoao.encerrarConta();
  }
}