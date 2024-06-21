import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, vamos descobrir se o numero é par ou impar: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Infome o numero: ");
        int number = in.nextInt();

        if(number % 2 == 0) {
            System.out.println("O Numero: " + number + " é PAR");
        } else {
            System.out.println("O Numero: " + number + " é IMPAR");
        }

    }
}