import java.util.Scanner;

public class A12QuadradoSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Informe um valor: ");
        numeros[0] = sc.nextInt();
        System.out.print("Informe outro valor: ");
        numeros[1] = sc.nextInt();
        System.out.print("Informe um último valor: ");
        numeros[2] = sc.nextInt();

        var somaNumeros = 0;
        for (int valor : numeros){
            somaNumeros += valor;
        }
        int quadradoSoma = (int) Math.pow(somaNumeros, 2);
        System.out.printf("O quadrado da soma dos três números é: %d", quadradoSoma);
    }
}
