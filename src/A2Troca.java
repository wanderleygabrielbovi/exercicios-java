import java.util.Scanner;

public class A2Troca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;

        System.out.print("Informe um valor para a variável [A]: ");
        a = sc.nextDouble();
        System.out.print("Informe um valor para a variável [B]: ");
        b = sc.nextDouble();

        double troca = a;
        a = b;
        b = troca;
        System.out.println("\n---Foi trocado os valores das variáveis---");
        System.out.printf("Variável [A]: %.0f", a);
        System.out.printf("\nVariável [B]: %.0f", b);
    }
}