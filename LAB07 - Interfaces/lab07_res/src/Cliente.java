public class Cliente implements Classificavel {
    private String nome;
    public Cliente(String n){
        nome = n;
    }

    public boolean eMenorQue ( Classificavel o) {
        Cliente compara = (Cliente) o;
        // (s1.compareTo(s3)); 1(because s1>s3)
        if ( this.nome.compareTo(compara.nome) == -1) {
            return true ;
        } else {
            return false ;
        }
    }

    public String getNome() {
        return nome;
    }
}
