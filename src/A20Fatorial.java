import java.math.BigInteger;
import java.util.Scanner;

public class A20Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para saber o fatorial: ");
        int num = sc.nextInt();

        while (num < 0) {
            System.out.print("O número precisa ser maior que 0! ");
            num = sc.nextInt();
        }
        BigInteger fatorial = BigInteger.ONE;
        if (num == 0 || num == 1) {
            System.out.printf("O fatorial do número %d é 1", num);
            return;
        } else {
            for (int i = 1; i <= num; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.printf("O fatorial de %d é %d", num, fatorial);
    }
}