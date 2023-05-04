public class FolhaPagamento {
    public void imprimeFolha(Funcionario F[], int tam){
        for(int i=0; i < tam; i++) {
            System.out.println("Salario " + i + ": " + F[i].getSalario());
        }

    }
}
