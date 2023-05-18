public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(){
        super();
        limite = 10000;
    }

    public ContaEspecial( float val , int num , int pwd ){
        super(val ,num , pwd );
        limite = getSaldo(pwd)*100;
    }

    public float getLimite() {
        return limite;
    }

}
