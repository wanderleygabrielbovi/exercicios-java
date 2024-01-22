import java.util.Scanner;

public class A22Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        while (num < 0) {
            System.out.print("Informe um número postivo! ");
            num = sc.nextInt();
        }
        if (num == 2) {
            System.out.println("O número informado é primo!");
            return;
        }
        boolean flag = false;
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("O número informado é primo!");
        } else {
            System.out.println("O número informado não é primo!");
        }
    }
}