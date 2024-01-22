import java.util.Scanner;

public class A28Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numFibo = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i  = numFibo; numFibo > 0; numFibo--) {
            System.out.print(num1 + " ");
            if (num1 > numFibo) {
                break;
            } else {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
    }
}