import java.util.Scanner;

public class A17OrdenaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] elementosNum = new int[12];

        for (int i = 0; i<elementosNum.length; i++){
            System.out.print("Informe um número: ");
            elementosNum[i] = sc.nextInt();
        }
        int n = elementosNum.length;
        int trocar = 0;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-1; j++){
                if (elementosNum[j] < elementosNum[j+1]){
                    trocar = elementosNum[j];
                    elementosNum[j] = elementosNum[j+1];
                    elementosNum[j+1] = trocar;
                }
            }
        }
        System.out.println();
        for (int i = 11; i>0; i--){
            System.out.print(elementosNum[i] +" ");
        }
    }
}
