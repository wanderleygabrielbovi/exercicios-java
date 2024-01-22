import java.util.Scanner;

public class A1TwoFer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        var nome = sc.nextLine();
        System.out.println(comportamento(nome));
    }
    private static String comportamento(String label) {
        String texto = "";
        if (!label.isEmpty()){
            texto = "Um para " +label +", outro para mim.";
        }else {
            texto = "Um para você, outro para mim.";
        }
        return texto;
    }
}
