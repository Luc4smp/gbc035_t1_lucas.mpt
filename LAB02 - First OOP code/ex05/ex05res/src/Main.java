public class Main {
    public static void main(String[] args) {

        int i;
        Selecao []selecoes = new Selecao[2];
        selecoes[0] = new Selecao();
        selecoes[1] = new Selecao();

        selecoes[0].setSelec("Brasil", "tite");
        selecoes[1].setSelec("Argentina", "treinador");

        selecoes[0].mostrarSel();
        selecoes[1].mostrarSel();
    }
}
