import java.util.Scanner;

public class A23JoKenPo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PRIMEIRO JOGADOR");
        System.out.println("Informe uma opcão:\n [1] Pedra\n [2] Papel\n [3] Tesoura");
        int priJogador = sc.nextInt();
        while (priJogador != 1 && priJogador != 2 && priJogador != 3) {
            System.out.println("Informe um valor válido!\n");
            System.out.println("PRIMEIRO JOGADOR");
            System.out.println("Informe uma opcão:\n [1] Pedra\n [2] Papel\n [3] Tesoura");
            priJogador = sc.nextInt();
        }
        System.out.println("SEGUNDO JOGADOR");
        System.out.println("Informe uma opcão:\n [1] Pedra\n [2] Papel\n [3] Tesoura");
        int segJogador = sc.nextInt();
        while (segJogador != 1 && segJogador != 2 && segJogador != 3) {
            System.out.println("Informe um valor válido!\n");
            System.out.println("SEGUNDO JOGADOR");
            System.out.println("Informe uma opcão:\n [1] Pedra\n [2] Papel\n [3] Tesoura");
            segJogador = sc.nextInt();
        }
        String priJogada = jogo(priJogador);
        String segJogada = jogo(segJogador);
        verificaJogador(priJogada, segJogada);
    }
    private static void verificaJogador(String priJogada, String segJogada) {
        if (priJogada.equals(segJogada)) {
            System.out.println("Empate!");
        } else if ((priJogada.equals("Pedra") && segJogada.equals("Tesoura")) ||
                (priJogada.equals("Papel") && segJogada.equals("Pedra")) ||
                (priJogada.equals("Tesoura") && segJogada.equals("Papel"))) {
            System.out.println("Primeiro jogador venceu!");
        } else {
            System.out.println("Segundo jogador venceu!");
        }
    }
    private static String jogo(int opcao) {
        switch (opcao) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
        }
        return null;
    }
}