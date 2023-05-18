public class Amigos extends Contato{
    private int Tipo;
    public Amigos(){
        super();
        Tipo = 3;
    }
    public Amigos(String n, String a, String e, String ani,int g){
        super(n,a,e,ani);
        Tipo = g;
    }

    public int getTipo() {
        return Tipo;
    }
}
