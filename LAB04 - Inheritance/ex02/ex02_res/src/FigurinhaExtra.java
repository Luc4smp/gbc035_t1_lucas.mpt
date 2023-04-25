public class FigurinhaExtra extends Figurinha{
    String categoria; //"Legends" e "Rookies"
    String cor; //bordo, bronze, prata e ouro

    public FigurinhaExtra()
    {
        super();
        cor = "bronze";
        categoria = "legends";

    }

    public void mostrarFigex()
    {
        System.out.println("Figurinha "+ ": " + nome+ " " + nasc + " " +
                altura + " " + peso + " " + pos + " " + pais + " " + categoria + " " + cor);
    }
}
