public class Lobo extends Mamifero {
    public String nomec; //nome cientifico
    protected String nomep; //nome popular
    private String cor; //cor do pelo

    Lobo(){
        super("sim",4,"terrestre");
        nomec = "padrao";
        nomep = "padrao";
        cor = "padrao";
        System.out.println("Construtor padrão usado\n");
    }
    Lobo(String C, String P, String Cor){
        super("sim",4,"terrestre");
        nomec = C;
        nomep = P;
        cor = Cor;
        System.out.println("Constrtor com parametros usado\n");
    }

    public void mostrar_atributos(){
        System.out.println("Vertebra: " + Vert + "\nReprodução: " + Rep + "\nAlimentação: " + getAlim());
        System.out.println("Tem pelo? " + pelo + "\nPatas: " +patas + "\nTipo: " + getTipo());
        System.out.println("Nome cientifico " + nomec + "\nNome popular: " +nomep + "\nCor do pelo: " + cor);
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Nome cientifico " + nomec + "\nNome popular: " +nomep + "\nCor do pelo: " + cor);

    }
}
