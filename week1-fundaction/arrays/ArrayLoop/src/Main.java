import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] lista = {1, 54, 87, 7, 87, 54, 64, 85, 17, 57};
        for (int i = 0; i < lista.length; i++) {
            System.out.println(String.format("Valor do array na posicao %s é: %s", i, lista[i]));
        }
    }
}