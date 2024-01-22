import java.util.Scanner;

public class A26Anagramas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String string1 = sc.nextLine().toLowerCase().replaceAll(" ","");

        System.out.print("Informe outra palavra: ");
        String string2 = sc.nextLine().toLowerCase().replaceAll(" ", "");

        char[] palavra1 = new char[string1.length()];
        char[] palavra2 = new char[string2.length()];
        for (int i = 0; i < palavra1.length; i++){
            palavra1[i] = string1.charAt(i);
            palavra2[i] = string2.charAt(i);
        }
        ordenaQuickSort(palavra1, 0, palavra1.length - 1);
        ordenaQuickSort(palavra2, 0, palavra2.length - 1);

        boolean anagrama = true;
        for (int i = 0; i < palavra1.length; i++) {
            if (palavra1[i] != palavra2[i]) {
                anagrama = false;
                break;
            }
        }
        if (anagrama) {
            System.out.println("Os textos informados são anagramas!");
        } else {
            System.out.println("Os textos informados não são anagramas!");
        }
    }
    public static void ordenaQuickSort(char[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particao(vetor, inicio, fim);

            ordenaQuickSort(vetor, inicio, pivo - 1);
            ordenaQuickSort(vetor, pivo + 1, fim);
        }
    }
    public static int particao(char[] vetor, int inicio, int fim) {
        char pivo = vetor[fim];
        int index = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                index++;
                char temp = vetor[index];
                vetor[index] = vetor[j];
                vetor[j] = temp;
            }
        }
        char temp = vetor[index + 1];
        vetor[index + 1] = vetor[fim];
        vetor[fim] = temp;

        return index + 1;
    }
}