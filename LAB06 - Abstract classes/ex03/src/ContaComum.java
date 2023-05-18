public class ContaComum extends ContaCorrente{
    private float limite;
    public ContaComum(){
        super();
        limite = 0;
    }

    public ContaComum( float val , int num , int pwd ){
        super(val ,num , pwd );
        limite = 0;
    }
}
