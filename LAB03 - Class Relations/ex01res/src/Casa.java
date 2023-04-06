public class Casa {
    private String rua;
    private String cidade;
    private int numero;
    private Quartos quartos;

    // Construtor
    public Casa(String r,int num, String cid, int num2,String tipos) {
        rua = r;
        cidade = cid;
        numero =num;
        Quartos q = new Quartos( num2, tipos);
    }

    String getEndereco(){
        String f = (cidade+" "+rua+" numero "+numero);
        return f;
    }
}