import javax.lang.model.type.NullType;

public class Main {
    public static void main(String[] args) {

        ContaEspecial ce = new ContaEspecial();
        if(ce.getLimite() == 0){
            ContaComum cc = new ContaComum(ce.getSaldo(0000), ce.getNumConta(0000), 0000);
            ce = null;
        }
    }
}