public class CamaroteSuperior extends Vip{
    private double ValorAdicional;
    CamaroteSuperior(){
        ValorAdicional = 100;
    }

    public double getValorCamarote() {
        return (ValorAdicional+getValorVip());
    }
}
