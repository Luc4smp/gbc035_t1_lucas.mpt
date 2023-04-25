public class FigurinhaExtra extends Figurinha{
    String categoria; //"Legends" e "Rookies"
    String cor; //bordo, bronze, prata e ouro

    public FigurinhaExtra()
    {
        super();
        cor = "bronze";
        categoria = "legends";

    }
    public FigurinhaExtra(Figurinha K,String cat,String cr)
    {
        cor = cr;
        categoria = cat;

    }

    public void mostrarFigex()
    {
        super.mostrarFig(); System.out.println(" " + categoria + " " + cor);
    }
}
