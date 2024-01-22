import java.util.Scanner;

public class A30Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double troco;
            System.out.print("Informe o valor total a ser pago: ");
            double valorCompra = sc.nextDouble();
        do {
            System.out.print("Informe o valor de pagamento: ");
            double valorDado = sc.nextDouble();

            troco = valorDado - valorCompra;

        } while (troco < 0);
        System.out.println("Troco a ser entregue ao cliente: " + troco);

        int[] cedulas = {100, 50, 10, 5, 1};
        String[] valorCedulas = {"R$100", "R$50", "R$10", "R$5", "R$1"};

        System.out.println("Quantidade de cédulas a serem entregues ao cliente:");

        for (int i = 0; i < cedulas.length; i++) {
            int qtdCedulas = (int) (troco / cedulas[i]);
            if (qtdCedulas > 0) {
                System.out.println(valorCedulas[i] + ": " + qtdCedulas);
                troco -= qtdCedulas * cedulas[i];
            }
        }
        int[] moedas = {50, 10, 5, 1};
        String[] valorMoedas = {"R$0.50", "R$0.10", "R$0.05", "R$0.01"};

        System.out.println("Quantidade de moedas a serem entregues ao cliente:");

        int trocoCents = (int) (troco * 100);

        for (int i = 0; i < valorMoedas.length; i++) {
            int qtdMoedas = trocoCents / moedas[i];
            if (qtdMoedas > 0) {
                System.out.println(valorMoedas[i] + ": " + qtdMoedas);
                trocoCents %= moedas[i];
            }
        }
    }
}