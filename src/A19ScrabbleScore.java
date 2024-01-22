import java.util.Scanner;

public class A19ScrabbleScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra para saber o score: ");
        String palavra = sc.nextLine();

        while (palavra.isEmpty()) {
            System.out.print("ERROR> Digite uma palavra! ");
            palavra = sc.nextLine();
        }
        palavra = palavra.replace(" ", "").toUpperCase();

        for (int i = 0; i < palavra.length(); i++) {
            char letraAtual = palavra.charAt(i);
            SwitchCase(letraAtual);
        }
        System.out.println(valorPalavra);
    }
    static int valorPalavra = 0;
    private static void SwitchCase(char letra) {
        switch(letra) {
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' :
                valorPalavra += 1;
                break;
            case 'D', 'G':
                valorPalavra += 2;
                break;
            case 'B', 'C', 'M', 'P':
                valorPalavra += 3;
                break;
            case 'F', 'H', 'V', 'W', 'Y':
                valorPalavra += 4;
                break;
            case 'K':
                valorPalavra += 5;
                break;
            case 'J', 'X':
                valorPalavra += 8;
                break;
            case 'Q', 'Z':
                valorPalavra += 10;
                break;
        }
    }
}