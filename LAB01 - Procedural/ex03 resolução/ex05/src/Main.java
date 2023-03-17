import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valores = new int[5];
        int i;
        int ma = 0;
        int me = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 6 valores");

        for(i=0; i < 5; i++)
        {
            valores[i] = scan.nextInt();

            if (valores[i] > ma)
            {
                ma = valores[i];
            } else if (me > valores[i]) {
                me = valores[i];
            }
        }

        for(i=0; i < 5; i++) {
            System.out.println("Valor " + (i+1) + ":" + valores[i]);
        }
        System.out.println("Maior: " + ma);
        System.out.println("Menor: " + me);
    }
}