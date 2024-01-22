import java.util.Scanner;

public class A7SalarioLiquidoProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantas horas mensais você trabalha: ");
        float horasMes = sc.nextFloat();
        System.out.print("Informe o valor da sua hora-aula: ");
        float valorHoraAula = sc.nextFloat();
        System.out.print("Informe em números o percentual do desconto de INSS: ");
        float percentualInss = sc.nextFloat();

        float salarioBruto = valorHoraAula*horasMes;
        float descontoSalarial = salarioBruto*(percentualInss/100);
        float salarioLiquido = salarioBruto-descontoSalarial;

        System.out.printf("Seu salário bruto é de: R$%.2f, com o desconto do INSS ele passa a ser líquido com: R$%.2f", salarioBruto, salarioLiquido);
    }
}