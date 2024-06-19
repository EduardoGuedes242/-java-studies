import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Let's go search average between tree numbers");
        System.out.println("Informe o primeiro numero: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Informe o segunto numero: ");
        double numberTwo = scanner.nextDouble();
        System.out.println("Informe o terceiro numero: ");
        double numberTree = scanner.nextDouble();
        double media = (numberOne + numberTwo + numberTree) / 3;
        System.out.println("Com base nessas notas a média é: " + media);
    }
}