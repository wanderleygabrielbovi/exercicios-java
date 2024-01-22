import java.util.Arrays;

public class A32Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 5, 1, 9, 5, 0, 4, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 3, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 2, 5},
                {0, 0, 1, 0, 8, 0, 0, 7, 9}
        };
        int[][] blocosInvalidos = validaSudoku(sudoku);

        if (blocosInvalidos.length == 0){
            System.out.println("Não há erros na tabela!");
        } else {
            System.out.println("Existem partes da tabela com erro: ");
            for (int[] bloco : blocosInvalidos) {
                System.out.println(Arrays.toString(bloco));
            }
        }
    }
    public static int[][] validaSudoku(int[][] tabela) {
        int[][] blocos = new int[0][0];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tabela[i][j] != 0 && !valido(tabela, i, j)) {
                    blocos = Arrays.copyOf(blocos, blocos.length + 1);
                    blocos[blocos.length - 1] = new int[]{i, j};
                }
            }
        }
        return blocos;
    }
    private static boolean valido(int[][] tabela, int linha, int coluna) {
        int valor = tabela[linha][coluna];

        for (int i = 0; i < 9; i++) {
            if (i != coluna && tabela[linha][i] == valor) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != linha && tabela[i][coluna] == valor) {
                return false;
            }
        }
        int guardaL = linha / 3 * 3;
        int guardaC = coluna / 3 * 3;
        for (int i = guardaL; i < guardaL + 3; i++) {
            for (int j = guardaC; j < guardaC + 3; j++) {
                if ((i != linha || j != coluna) && tabela[i][j] == valor) {
                    return false;
                }
            }
        }
        return true;
    }
}