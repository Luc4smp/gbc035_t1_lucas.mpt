public class Figurinha {
    private String nome;
    private String nasc;
    private double altura;
    private int peso;
    private String pos;
    private String pais;

    public void setFigurinha(String no, String na, double al,int pe, String po, String pa)
    {
        nome = no;
        nasc = na;
        altura = al;
        peso = pe;
        pos = po;
        pais = pa;

    }

    public String getNome(){
        return nome;
    }
    public String getNasc(){
        return nasc;
    }
    public double getAltura(){
        return altura;
    }
    public int getPeso(){
        return peso;
    }
    public String getPos(){
        return pos;
    }
    public String getPais() {
        return pais;
    }
}