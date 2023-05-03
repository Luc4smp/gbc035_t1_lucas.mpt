public class Vip extends Ingresso{
    private double valorExtra;
    Vip(){
        valorExtra = 50;
    }
    public double getValorVip(){
        return (valorExtra+getValor());
    }
}
