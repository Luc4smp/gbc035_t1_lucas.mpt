public class Main {
    public static void main(String[] args) {

        Selecao []selecoes = new Selecao[2];
        selecoes[0] = new Selecao();
        selecoes[1] = new Selecao();

        Figurinha []time1 = new Figurinha[11];
        time1 [0] = new Figurinha();
        time1 [0].setFigurinha("Neymar Junior", "05/02/1992", 1.75,68, "Atacante", "Brasil");

        time1 [1] = new Figurinha();
        time1 [1].setFigurinha("Richarlison", "10/05/1997", 1.84,82, "Atacante", "Brasil");

        time1 [2] = new Figurinha();
        time1 [2].setFigurinha("Lionel Messi", "24/06/1987", 1.70,83, "Atacante", "Argentina");


    }
}

