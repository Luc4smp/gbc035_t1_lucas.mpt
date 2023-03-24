public class Main {
    public static void main(String[] args) {

        Figurinha []jogadores = new Figurinha[3];
        jogadores [0] = new Figurinha();
        jogadores [0].setFigurinha("Neymar Junior", "05/02/1992", 1.75,68, "Atacante", "Brasil");

        jogadores [1] = new Figurinha();
        jogadores [1].setFigurinha("Richarlison", "10/05/1997", 1.84,82, "Atacante", "Brasil");

        jogadores [2] = new Figurinha();
        jogadores [2].setFigurinha("Lionel Messi", "24/06/1987", 1.70,83, "Atacante", "Argentina");

        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Figurinha "+ i+ ": " + jogadores [i].getNome() + " " + jogadores [i].getNasc() + " " +
                    jogadores [i].getAltura() + " " + jogadores [i].getPeso() + " " + jogadores [i].getPos() + " " + jogadores [i].getPais());
        }
    }
}

