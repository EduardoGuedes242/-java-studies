import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] list = {5,10,15,1,20,25,30,35};

        int maiorNumero = list[0];
        int menorNumero = list[0];

        for (int numberAtual : list) {
                if (numberAtual > maiorNumero) {
                    maiorNumero = numberAtual;
                }
                if (numberAtual < menorNumero) {
                    menorNumero = numberAtual;
                }

        }
        System.out.println("O maior numero é: " + maiorNumero);
        System.out.println("O Menor numero é: " + menorNumero);
    }
}