public class Main {
    public static void main(String[] args) {
        System.out.println("realizando a soma de 0 a 100");

        int numberInitial = 0;

        int count = 0;

        while (count <= 100 ) {
            numberInitial = numberInitial + count;
            count++;

        }
        System.out.println("O reusltado da soma entre os numeros 0 e 100 é = " + numberInitial );
    }
}