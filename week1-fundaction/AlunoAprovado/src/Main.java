import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua nota do 1º trimestre");
        double notaOne = scanner.nextDouble();

        System.out.println("Informe sua nota do 2º trimestre");
        double notaTwo = scanner.nextDouble();

        System.out.println("Informe sua nota do 3º trimestre");
        double notaThree = scanner.nextDouble();

        double mediaFinal = (notaOne + notaTwo + notaThree);

        if(mediaFinal >= 60){
            System.out.println("Voce esta aprovado pela nota final de: " + mediaFinal);
        } else {
            System.out.println("Voce esta Reprovado pela nota final de: " + mediaFinal);
        }

    }
}