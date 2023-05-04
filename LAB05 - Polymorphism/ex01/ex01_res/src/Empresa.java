public class Empresa {
    private String Nome;

    Empresa(){
        Nome = "padrão";
    }

    public void main() {
        FolhaPagamento FP = new FolhaPagamento();
        Funcionario []F = new Funcionario[10];
        F[0] = new Chefe();
        F[1] = new Vendedor();
        F[2] = new Operario();
        F[3] = new Horista();
        FP.imprimeFolha(F, 4);



    }

}
