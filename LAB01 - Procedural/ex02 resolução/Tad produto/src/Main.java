import java.awt.*;
import java.util.Scanner;

public class Main {

    public static float altera_preco(float preco, float porcentagem) {
        float temp;
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            preco = preco * temp;
            return preco;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];

        for (int i = 0; i < 4; i++)
        {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto " + (i+1) + ":");
            nome[i] = scan.nextLine();
            preco[i] = scan.nextFloat();
            scan.nextLine();             //captura lixo
            qtd_estoque[i] = scan.nextInt();
            scan.nextLine();             //captura lixo
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        preco[0] = altera_preco(preco[0], -10);
        preco[2] = altera_preco(preco[2], -110);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        preco[1] = altera_preco(preco[1], -5);
        if (preco[1] == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");
        else
            System.out.println("\nPreco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 4");
        preco[3] = altera_preco(preco[3], -110);
        if (preco[3] == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.println("Produto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtd_estoque[i]);
        }
    }


}