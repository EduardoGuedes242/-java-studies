import java.util.Scanner;

//Aprendizados
//posso fazer assim (double 5/9) ou 5.0 / 9
//ou seja, eu declaro um valor no formato double ou converto ele

public class Main {
    public static void main(String[] args) {
        //Import a lib Scanner to read of values
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to temperature conversor, choice option:");
        System.out.print("\n1 - C to F");
        System.out.print("\n2 - F to C");
        System.out.print("\nInput here: ");
        int optionSelected = in.nextInt();

        if (optionSelected == 1) {
            System.out.println("Input Temperature in C: ");
            int celsius = in.nextInt();
            double resultCelsiusToFahrenheit =  celsius * (9.0 / 5.0) + 32;
            System.out.println("Result in Fahrenheit: " + resultCelsiusToFahrenheit);
        } else if (optionSelected == 2){
            System.out.println("Input Temperature in Fahrenheit: ");
            int fahrenheit = in.nextInt();
            double resultFahrenheitToCelsius =  (fahrenheit - 32) *  ((double) 5 / 9);
            System.out.println("Result in Fahrenheit: " + resultFahrenheitToCelsius);
        } else {
            System.out.println("Opcao invalida");
        }

        System.out.println("Thank");
    }
}