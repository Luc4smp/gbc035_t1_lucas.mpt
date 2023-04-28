public class Mamifero extends Animal{
    public String pelo; //possui pelo ou não
    protected int patas; //quantidade de patas
    private String tipo; //marinho, terrestre, anfibio

    Mamifero(){
        super("vertebrado","sexuada","heterotrofo");
        pelo = "padrao";
        patas = 0;
        tipo = "padrao";
        System.out.println("Construtor padrão usado\n");
    }
    Mamifero(String P, int pat, String T){
        super("vertebrado","sexuada","heterotrofo");
        pelo = P;
        patas = pat;
        tipo = T;
        System.out.println("Constrtor com parametros usado\n");
    }

    public void mostrar_atributos(){
        System.out.println("Vertebra: " + Vert + "\nReprodução: " + Rep + "\nAlimentação: " + getAlim());
        System.out.println("Tem pelo? " + pelo + "\nPatas: " +patas + "\nTipo: " + tipo);
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.println("Tem pelo? " + pelo + "\nPatas: " +patas + "\nTipo: " + tipo);
    }

    public String getTipo(){

        return tipo;
    }
}
