import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Infome a area: ");
        double raio = in.nextDouble();
        double area = (raio * raio) * 3.14159;

        System.out.println("Com base nesse raio a area do circulo é: " + area);
    }
}