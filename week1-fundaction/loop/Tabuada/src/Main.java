import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero que deseja saber a tubuada");
        int numero = scanner.nextInt();

        for(int i = 0; i <= 100; i++){
            System.out.println( numero + " x " + i + " = " + (numero * i) );
        }
    }
}