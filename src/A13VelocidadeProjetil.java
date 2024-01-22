import java.util.Scanner;

public class A13VelocidadeProjetil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a distância em quilômetros: ");
        var distancia = sc.nextFloat();

        System.out.print("Informe o tempo em segundos: ");
        var tempo = sc.nextFloat();

        var resultado = (distancia * 1000) / (tempo * 60);

        System.out.printf("A velocidade do projétil é de: %.2fm/s", resultado);
    }
}
