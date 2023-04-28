public class Animal {
    public String Vert; //vertebrado ou invertebrado
    protected String Rep; //asexuada, sexuada o ambos
    private String Alim; //autotrofo ou heterotrofo

    Animal(){

        Vert = "padrao";
        Rep = "padrao";
        Alim = "padrao";
        System.out.println("Construtor padrão usado\n");
    }
    Animal(String V, String R, String A){
        Vert = V;
        Rep = R;
        Alim = A;
        System.out.println("Constrtor com parametros usado\n");
    }

    public void mostrar_atributos(){

        System.out.println("Vertebra: " + Vert + "\nReprodução: " + Rep + "\nAlimentação: " + Alim);
    }
    public String getAlim(){
        return Alim;
    }
}
