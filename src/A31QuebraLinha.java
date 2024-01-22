import java.util.Scanner;

public class A31QuebraLinha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Informe a quantidade de colunas: ");
        int colunas = sc.nextInt();

        quebrarLinha(frase, colunas);
    }
    public static void quebrarLinha(String frase, int colunas) {
        String[] palavras = frase.split("\\s+");
        int tamanhoLinha = 0;

        for (String palavra : palavras) {
            if (tamanhoLinha + palavra.length() <= colunas) {
                if (tamanhoLinha != 0) {
                    System.out.print(" ");
                    tamanhoLinha++;
                }
                System.out.print(palavra);
                tamanhoLinha += palavra.length();
            } else {
                System.out.println();
                System.out.print(palavra);
                tamanhoLinha = palavra.length();
            }
        }
    }
}