import java.util.Scanner;

public class A9ConversaoReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cotação do Dólar: R$");
        float cotacaoDolar = sc.nextFloat();;
        System.out.print("Informe quantos dólares você tem: U$");
        float saldo = sc.nextFloat();

        float conversao = saldo*cotacaoDolar;
        System.out.printf("Convertendo Dólar para Real, seu saldo será de: R$%.2f", conversao);
    }
}
