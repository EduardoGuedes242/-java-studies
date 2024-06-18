import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double secoundNum = scanner.nextDouble();

        System.out.println("Dado os numeros informados os resultados são:");
        System.out.println(String.format("%s + %s = %s", firstNum, secoundNum, (firstNum + secoundNum)));
        System.out.println(String.format("%s - %s = %s", firstNum, secoundNum, (firstNum - secoundNum)));
        System.out.println(String.format("%s * %s = %s", firstNum, secoundNum, (firstNum * secoundNum)));
        System.out.println(String.format("%s / %s = %s", firstNum, secoundNum, (firstNum / secoundNum)));
    }
}