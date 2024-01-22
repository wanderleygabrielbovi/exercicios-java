import java.util.Scanner;

public class A25SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[100];
        int valor;
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um número (ou 0 para encerrar): ");
            valor = sc.nextInt();
            if(valor == 0) {
                break;
            } else {
                num[i] = valor;
                contador++;
            }
        }
        if (contador > 0) {
            int soma = 0;
            for (int x : num) {
            soma += x;
            }
            System.out.print("A média dos elementos inseridos é: " + soma / contador);
        } else {
            System.out.println("Até logo e obrigado pelos peixes!");
        }
    }
}