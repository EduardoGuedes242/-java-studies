public class Main {
    public static void main(String[] args) {
        int[] array = {18,18,24};
        int resultSoma = 0;
        for(int count = 0;count < array.length; count++) {
            resultSoma = resultSoma + array[count];
        }
        resultSoma = resultSoma / 3;

        System.out.println("A Meta entre os valures forncediso é de: " + resultSoma);

    }
}