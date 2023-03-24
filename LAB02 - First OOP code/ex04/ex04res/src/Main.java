public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        int i;
=======
>>>>>>> 65a177df5ff9e70a171912f9d9e9772bd5ce0940
        Selecao []selecoes = new Selecao[2];
        selecoes[0] = new Selecao();
        selecoes[1] = new Selecao();

        Figurinha []time1 = new Figurinha[11];
        time1 [0] = new Figurinha();
        time1 [0].setFigurinha("Neymar Junior", "05/02/1992", 1.75,68, "Atacante", "Brasil");
<<<<<<< HEAD
        time1 [1] = new Figurinha();
        time1 [1].setFigurinha("Richarlison", "10/05/1997", 1.84,82, "Atacante", "Brasil");

        for(i = 2; i < 11;i++)
        {
            time1 [i] = new Figurinha();
            time1 [i].setFigurinha("Teste", "10/01/1000", 1.84,82, "Teste", "Teste");
        }

        Figurinha []time2 = new Figurinha[11];
        time2 [0] = new Figurinha();
        time2 [0].setFigurinha("Lionel Messi", "24/06/1987", 1.70,83, "Atacante", "Argentina");
        for(i = 1; i < 11;i++)
        {
            time2 [i] = new Figurinha();
            time2 [i].setFigurinha("Teste", "10/01/1000", 1.84,82, "Teste", "Teste");
        }
        selecoes[0].setSelec("primeira selecao", "tite", time1);
        selecoes[1].setSelec("segunda selecao", "treinador", time2);
=======

        time1 [1] = new Figurinha();
        time1 [1].setFigurinha("Richarlison", "10/05/1997", 1.84,82, "Atacante", "Brasil");

        time1 [2] = new Figurinha();
        time1 [2].setFigurinha("Lionel Messi", "24/06/1987", 1.70,83, "Atacante", "Argentina");

>>>>>>> 65a177df5ff9e70a171912f9d9e9772bd5ce0940

    }
}

