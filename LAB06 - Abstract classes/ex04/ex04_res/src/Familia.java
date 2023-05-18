public class Familia extends Contato{
    private String Parentesco;
    public Familia(){
        super();
        Parentesco = "desconhecido";
    }
    public Familia(String n, String a, String e, String ani,String p){
        super(n,a,e,ani);
        Parentesco = p;
    }

    public String getParentesco() {
        return Parentesco;
    }
}
