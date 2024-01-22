import java.util.Scanner;

public class A15MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;

        boolean print = false;
        do {
            if (print) {
                System.out.println("\nVocê digitou um valor menor que 0, por favor digite suas notas novamente!");
            }
            System.out.println("De 0 a 10, informe:\n");
            System.out.print("Primeira nota --> ");
            nota1 = sc.nextInt();
            System.out.print("Segunda nota --> ");
            nota2 = sc.nextInt();
            System.out.print("Terceira nota --> ");
            nota3 = sc.nextInt();
            System.out.print("Quarta nota --> ");
            nota4 = sc.nextInt();

            print = true;
        } while (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota4 < 0);

        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 5) {
            System.out.println("\nAprovado!");
        } else {
            System.out.println("\nReprovado!");
        }
        System.out.printf("Sua média obtida foi: %.1f", media);
    }
}
