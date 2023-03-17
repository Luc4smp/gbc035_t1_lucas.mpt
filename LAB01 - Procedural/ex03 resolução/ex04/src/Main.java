import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valores = new int[6];
        int i;
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 6 valores");

        for(i=0; i < 6; i++)
        {
            x = scan.nextInt();
            if((x % 2) == 0) {
                valores[i] = x;
            }
            else
            {
                System.out.println("Valor invalido");
                i--;
            }
        }

        for(i=0; i < 6; i++) {
            System.out.println("Valor " + (i+1) + ":" + valores[i]);
        }
    }
}