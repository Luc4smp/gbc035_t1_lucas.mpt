public class Figurinhaextra {
    private String nome;
    private String nasc;
    private double altura;
    private int peso;
    private String pos;
    private String pais;
    private String categoria;
    private String cor;

    public Figurinhaextra()
    {
        nome = "Padrão";
        nasc = "01/01/2000";
        altura = 1.70;
        peso = 84;
        pos = "Padrão";
        pais = "padrão";
        categoria = "Legends";
        cor = "bronze";

    }
    public String getNome(){
        return nome;
    }
    public String getNascex(){
        return nasc;
    }
    public double getAlturaex(){
        return altura;
    }
    public int getPesoex(){
        return peso;
    }
    public String getPosex(){
        return pos;
    }
    public String getPaisex() {
        return pais;
    }
    public String getCategoriaex() {
        return categoria;
    }
    public String getCorex() {
        return cor;
    }
    public void mostrarFigex()
    {
        System.out.println("Figurinha "+ ": " + nome + " " + nasc + " " +
                altura + " " + peso + " " + pos + " " + pais + " " + categoria + " " + cor);
    }
}
