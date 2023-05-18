public class Trabalho extends Contato{
    private String Tipo;
    public Trabalho(){
        super();
        Tipo = "funcionario";
    }

    public Trabalho(String n, String a, String e, String ani,String t){
        super(n,a,e,ani);
        Tipo = t;
    }

    public String getTipo() {
        return Tipo;
    }
}
