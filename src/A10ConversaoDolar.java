import java.util.Scanner;

public class A10ConversaoDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cotação do Dólar: R$");
        float cotacao = sc.nextFloat();
        System.out.print("Informe quantos reais há com você: R$");
        float saldo = sc.nextFloat();

        float conversao = saldo/cotacao;
        System.out.printf("Convertendo Real para Dólar, você terá: U$%.2f", conversao);
    }
}
