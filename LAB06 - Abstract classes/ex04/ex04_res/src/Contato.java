public abstract class Contato {
    private String nome;
    private String apelido;
    private String email;
    private String aniversario;
    public Contato(){
        nome = "padrão";
        apelido = "padrão";
        email = "padrão@gmail.com";
        aniversario = "00/00/0000";
    }

    public Contato(String n, String a, String e, String ani){
        nome = n;
        apelido = a;
        email = e;
        aniversario = ani;
    }

    public void imprimirBasico(){
        System.out.println("Nome: "+ nome + "\n Apelido: " + apelido);
    }
    public void imprimirContato(){
        imprimirBasico();
        System.out.println("\n Email: " + email + "\nAniversario: "+ aniversario);
    }
}
