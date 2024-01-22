import java.util.Scanner;

public class A16SomaNaturais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var inicio = false;
        int soma = 0;
        do {
            System.out.println("Informe um intervalo que contenha 100 números natuais\n");

            var primeiroNum = 0;
            do {
                System.out.print("Informe o primeiro número natural do intervalo: ");
                primeiroNum = sc.nextInt();
            } while (primeiroNum < 0);

            var segundoNum = 0;
            do {
                System.out.print("Informe o segundo número natural do intervalo e maior que o primeiro digitado: ");
                segundoNum = sc.nextInt();
            } while (segundoNum < 0 || segundoNum < primeiroNum);

            int contador = 0;
            for (int i = primeiroNum; i < segundoNum; i++) {
                contador++;
                soma += i;
                System.out.print(i + " ");
            }
            if (contador < 100) {
                System.out.println("\n\nERROR>>>");
                inicio = true;
            }
        } while (inicio);
        System.out.printf("\nA soma dos números do intervalo é: %d", soma);
    }
}