import java.util.Scanner;

public class A21AlgarismosRomanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um algarismo romano (ex: XVIII): ");
        String romanoNumero = sc.nextLine();
        while(romanoNumero == null || romanoNumero.isEmpty()) {
            System.out.print("Informe um algarismo romano (ex: XVIII): ");
            romanoNumero = sc.nextLine();
        }
        int resultado = retornaNumero(romanoNumero.toUpperCase());
        System.out.println("O numeral romano '" + romanoNumero + "' é igual a: " + resultado);
    }
    public static int retornaNumero(String romano) {
        int resultado = 0;
        int romanoAnt = 0;

        for (int i = romano.length() - 1; i >= 0; i--) {
            int valor = separaLetras(romano.charAt(i));

            if (valor >= romanoAnt) {
                resultado += valor;
            } else {
                resultado -= valor;
            }
            romanoAnt = valor;
        }
        return resultado;
    }
    public static int separaLetras(char valorRomano) {
        switch (valorRomano) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}