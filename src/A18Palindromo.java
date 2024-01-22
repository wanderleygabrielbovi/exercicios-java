import java.util.Scanner;

public class A18Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra/frase/número para verificar se ela é palíndroma: ");
        String palavra = sc.nextLine();
        String converte = palavra.replace(" ", "").toLowerCase();

        String palindromo = "";
        for (int i = converte.length()-1; i >= 0; i--){
            palindromo += converte.charAt(i);
        }
        if (palindromo.equals(converte)){
            System.out.printf("%s É palíndromo!", palavra);
        }else {
            System.out.printf("%s NÃO é palíndromo!", palavra);
        }
    }
}