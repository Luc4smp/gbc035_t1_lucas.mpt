public class UsaBanco {
    private String nome;
    private float limiteb;

    public void emprestimo(ContaCorrente cc,int pswd, int valor){
        if (limiteb > valor){
            cc.creditaValor(pswd,valor);
        }
    }

    public void PagarConta(ContaCorrente cc,int pswd, int valor){
            cc.creditaValor(pswd,valor);
    }
    
}
