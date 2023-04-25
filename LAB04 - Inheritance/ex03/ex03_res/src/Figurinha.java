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
    public Figurinha()
    {
        nome = "Padrão";
        nasc = "01/01/2000";
        altura = 1.70;
        peso = 84;
        pos = "Padrão";
        pais = "padrão";

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
    public void mostrarFig()
    {
        System.out.println("Figurinha "+ ": " + nome + " " + nasc + " " +
                altura + " " + peso + " " + pos + " " + pais);
    }
}