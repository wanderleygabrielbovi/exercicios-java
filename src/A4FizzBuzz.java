 import java.util.Scanner;

public class A4FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número inicial do intervalo: ");
        int numInicio = sc.nextInt();

        int numFinal = 0;
        do {
        System.out.print("Informe o número final do intervalo maior que o inicial: ");
        numFinal = sc.nextInt();
        } while (numInicio > numFinal);

        for (int i = numInicio; i <= numFinal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
