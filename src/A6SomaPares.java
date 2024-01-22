import java.util.Scanner;

public class A6SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o primeiro número do intervalo: ");
        int primeiro = sc.nextInt();
        System.out.print("Escreva o último número do intervalo: ");
        int ultimo = sc.nextInt();

        int i = primeiro;
        int somaPares = 0;
        while (i<ultimo){
            i++;
            if(i %2 == 0){
                somaPares += i;
            }
        }
        System.out.printf("A soma dos pares do intervalo proposto é: %d", somaPares);
    }
}
