import java.util.Scanner;

public class A3AjusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario = 0.0f;
        float ajusteSalarial = 0.0f;

        System.out.print("Informe seu salário: ");
        salario = sc.nextFloat();
        System.out.print("Informe em número o percentual do ajuste salarial: ");
        ajusteSalarial = sc.nextFloat();

        float novoSalario = salario + (salario*(ajusteSalarial/100));
        System.out.printf("Com o ajuste, seu salário será: %.2f", novoSalario);
    }
}