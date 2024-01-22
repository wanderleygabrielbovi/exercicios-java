import java.util.Scanner;

public class A29Pangrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String string = sc.nextLine().toUpperCase();

        boolean pangrama = verificaPangrama(string);

        if (pangrama) {
            System.out.println("A frase é um pangrama!");
        } else {
            System.out.println("A frase não é um pangrama!");
        }
    }
    public static boolean verificaPangrama(String frase) {
        boolean[] letras = new boolean[26];
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra >= 'A' && letra <= 'Z') {
                int index = letra - 'A';
                if (!letras[index]) {
                    letras[index] = true;
                    contador++;
                }
            }
            if (contador == 26) {
                return true;
            }
        }
        return false;
    }
}