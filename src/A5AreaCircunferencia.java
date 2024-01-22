import java.util.Scanner;

public class A5AreaCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14159265f;
        float raio = 0.0f;

        System.out.print("Informe o número do raio: ");
        raio = sc.nextFloat();

        double area = PI*(Math.pow(raio,2));
        System.out.printf("A área do raio %.1f é: %.1fcm²", raio, area);
    }
}