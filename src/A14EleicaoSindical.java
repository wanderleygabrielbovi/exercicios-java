import java.util.Scanner;

public class A14EleicaoSindical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validoPrimeiro = 0;
        int validoSegundo = 0;
        int validoTerceiro = 0;
        int votosNulos = 0;
        int votosBrancos = 0;

        var continuar = true;
        do {
            System.out.println("---Eleição Sindical---");
            System.out.println("\n[1] - Gerônimo da Fé");
            System.out.println("[2] - Augusto Lino");
            System.out.println("[3] - Sandra Siqueira");
            System.out.println("[8] - voto nulo");
            System.out.println("[9] - voto em branco");
            System.out.println("[0] - FINALIZAR ELEIÇÃO");

            System.out.print("Informe a opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    validoPrimeiro += 1;
                    break;
                case 2:
                    validoSegundo += 1;
                    break;
                case 3:
                    validoTerceiro += 1;
                    break;
                case 8:
                    votosNulos += 1;
                    break;
                case 9:
                    votosBrancos += 1;
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Operação não válida!");
            }
        }while (continuar);
        int totalVotantes = validoPrimeiro + validoSegundo + validoTerceiro + votosNulos + votosBrancos;
        System.out.printf("%d eleitores participaram da eleição sindical!", totalVotantes);

        float validoToEleitor = (float) (validoPrimeiro + validoSegundo + validoTerceiro)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos válidos em relação à quantidade de eleitores: %.1f.", validoToEleitor);

        float aToEleitores = (float) (validoPrimeiro)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos válidos do candidato A em relação à quantidade de eleitores: %.1f.", aToEleitores);

        float bToEleitores = (float) (validoSegundo)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos válidos do candidato B em relação à quantidade de eleitores: %.1f.", bToEleitores);

        float cToEleitores = (float) (validoTerceiro)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos válidos do candidato C em relação à quantidade de eleitores: %.1f.", cToEleitores);

        float nulosToEleitores = (float) (votosNulos)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos nulos em relação à quantidade de eleitores: %.1f.", nulosToEleitores);

        float brancosToEleitores = (float) (votosBrancos)/totalVotantes*100;
        System.out.printf("\nPorcentagem de votos em branco em relação à quantidade de eleitores: %.1f.", brancosToEleitores);
    }
}