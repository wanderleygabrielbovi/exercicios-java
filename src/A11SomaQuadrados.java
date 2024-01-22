import java.util.Scanner;

public class A11SomaQuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Informe um número: ");
        numeros[0] = sc.nextInt();
        System.out.print("Informe outro número: ");
        numeros[1] = sc.nextInt();
        System.out.print("Informe um último número: ");
        numeros[2] = sc.nextInt();

        var somaNumeros = 0;
        for (int valor : numeros){
            somaNumeros += Math.pow(valor, 2);
        }
        System.out.printf("O resultado da soma do quadrado desses três números é: %d", somaNumeros);
    }
}
