import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor informar os numeros");

        ArrayList<Integer> lista2 = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            System.out.printf("O %sº é: ", i+1);
            lista2.add(scanner.nextInt());
        }

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(String.format("Valor do array na posicao %s é: %s", i, lista2.get(i)));
        }
    }
}