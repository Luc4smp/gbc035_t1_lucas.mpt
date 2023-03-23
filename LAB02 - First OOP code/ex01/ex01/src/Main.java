public class Main {
    public static void main(String[] args) {

        Figurinha neymar = new Figurinha();
        neymar.nome = "Neymar Junior";
        neymar.nasc = "05/02/1992";
        neymar.altura = 1.75;
        neymar.peso = 68;
        neymar.pos = "atacante";
        neymar.pais = "Brasil";

        Figurinha rich = new Figurinha();
        rich.nome = "Richarlison";
        rich.nasc = "10/05/1997";
        rich.altura = 1.84;
        rich.peso = 83;
        rich.pos = "atacante";
        rich.pais = "Brasil";

        Figurinha messi = new Figurinha();
        messi.nome = "Lionel Messi";
        messi.nasc = "24/06/1987";
        messi.altura = 1.70;
        messi.peso = 83;
        messi.pos = "atacante";
        messi.pais = "Argentina";

        //printa neymar
        System.out.println("Figurinha 1: " + neymar.nome + " " + neymar.nasc + " " + neymar.altura + " " + neymar.peso + " " + neymar.pos + " " + neymar.pais);

        //printa richarlison
        System.out.println("Figurinha 2: " + rich.nome + " " + rich.nasc + " " + rich.altura + " " + rich.peso + " " + rich.pos + " " + rich.pais);

        //printa messi
        System.out.println("Figurinha 3: " + messi.nome + " " + messi.nasc + " " + messi.altura + " " + messi.peso + " " + messi.pos + " " + messi.pais);
    }
}

