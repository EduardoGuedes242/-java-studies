import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int number = in.nextInt();

        if(number < 0) {
            System.out.println("O numero é negativo");
        } else if (number > 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("Este numero zero");
        }
    }
}