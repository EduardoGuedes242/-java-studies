package org.example;


//Encapsulamento serve para criar todos metodos possiveis para tipo de objeto
//EXEMPLO TENHO UM SISTEMA DE CADASTRO DE VEICULO (CARRO, CAMINHAO, MOTO) TODOS ELES TEM AS MESMAS FUNCOES PADROES
// ligar(), desligar(), acelerar() entre outros
//entao ao criar um objeto implemento a interface criada

public interface Controlador {
  public abstract void ligar();
  public abstract void desligar();
  public abstract void play();
  public abstract void pause();
}
