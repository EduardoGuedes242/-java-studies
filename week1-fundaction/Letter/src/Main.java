import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a letra: ");

        String latter = scanner.next().toUpperCase();

        switch (latter) {
            case "A", "E", "I", "O", "U":
                System.out.println("Esta letra é uma VOGAL");
                break;
            default:
                System.out.println("Esta letra é uma CONSOANTE");
                break;
        }
    }
}