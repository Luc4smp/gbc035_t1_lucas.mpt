public class Vendedor extends Funcionario{
    private double comisao;
    private int vendas;
    Vendedor(){
        super();
        comisao = 10;
        vendas = 5;
        setSalario(2500+(comisao*vendas));
    }

}
