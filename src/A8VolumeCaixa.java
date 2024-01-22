import java.util.Scanner;

public class A8VolumeCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o volume: ");
        var volume = sc.nextFloat();

        System.out.print("Informe o comprimento: ");
        var comprimento = sc.nextFloat();

        System.out.print("Informe a altura: ");
        var altura = sc.nextFloat();

        System.out.print("Informe a largura: ");
        var largura = sc.nextFloat();

        System.out.println("O volume da caixa é: " + ((comprimento*largura)*altura));
    }
}
