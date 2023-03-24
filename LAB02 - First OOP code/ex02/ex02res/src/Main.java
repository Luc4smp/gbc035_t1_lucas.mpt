public class Main {
    public static void main(String[] args) {

        Figurinha neymar = new Figurinha();
        neymar.setFigurinha("Neymar Junior", "05/02/1992", 1.75,68, "Atacante", "Brasil");

        Figurinha rich = new Figurinha();
        rich.setFigurinha("Richarlison", "10/05/1997", 1.84,82, "Atacante", "Brasil");

        Figurinha messi = new Figurinha();
        messi.setFigurinha("Lionel Messi", "24/06/1987", 1.70,83, "Atacante", "Argentina");

        //printa neymar
        System.out.println("Figurinha 1: " + neymar.getNome() + " " + neymar.getNasc() + " " + neymar.getAltura() + " " + neymar.getPeso() + " " + neymar.getPos() + " " + neymar.getPais());

        //printa richarlison
        System.out.println("Figurinha 2: " + rich.getNome() + " " + rich.getNasc() + " " + rich.getAltura() + " " + rich.getPeso() + " " + rich.getPos() + " " + rich.getPais());

        //printa messi
        System.out.println("Figurinha 3: " + messi.getNome() + " " + messi.getNasc() + " " + messi.getAltura() + " " + messi.getPeso() + " " + messi.getPos() + " " + messi.getPais());
    }
}

