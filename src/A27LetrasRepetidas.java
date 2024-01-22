import java.util.Scanner;

public class A27LetrasRepetidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um texto: ");
        String string = sc.nextLine();
        char priNoRepeat = FindPriNoRepete(string);

        if (priNoRepeat != '0') {
            System.out.println("A primeira letra não repetida é: " + priNoRepeat);
        } else {
            System.out.println("Não existem letras que não se repetem no texto informado.");
        }
    }
    public static char FindPriNoRepete(String texto) {
        int[] vetor = new int[256];

        for (int i = 0; i < texto.length(); i++) {
            vetor[texto.charAt(i)]++;
        }
        for (int i = 0; i < texto.length(); i++) {
            if (vetor[texto.charAt(i)] == 1) {
                return texto.charAt(i);
            }
        }
        return '0';
    }
}