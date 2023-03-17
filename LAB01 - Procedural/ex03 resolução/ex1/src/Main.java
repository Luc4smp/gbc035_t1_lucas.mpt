import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valores = new int[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 6 valores");
        valores[0] = scan.nextInt();
        valores[1] = scan.nextInt();
        valores[2] = scan.nextInt();
        valores[3] = scan.nextInt();
        valores[4] = scan.nextInt();
        valores[5] = scan.nextInt();
        System.out.println("Valor 1:" + valores[0]);
        System.out.println("Valor 2:" + valores[1]);
        System.out.println("Valor 3:" + valores[2]);
        System.out.println("Valor 4:" + valores[3]);
        System.out.println("Valor 5:" + valores[4]);
        System.out.println("Valor 6:" + valores[5]);
    }
}