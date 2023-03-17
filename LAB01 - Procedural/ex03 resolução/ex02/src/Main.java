import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valores = new int[6];
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 6 valores");

        for(i=0; i < 6; i++)
        {
            valores[i] = scan.nextInt();
        }

        for(i=0; i < 6; i++) {
            System.out.println("Valor " + (i+1) + ":" + valores[i]);
        }
    }
}