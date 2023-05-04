public class Operario extends Funcionario{
    private double valorprod;
    private int producao;
    Operario(){
        super();
        valorprod = 300;
        producao = 100;
        setSalario(valorprod*producao);
    }
    
}
