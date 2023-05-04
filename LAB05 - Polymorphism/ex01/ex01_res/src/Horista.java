public class Horista extends Funcionario{
    private float valorhora;
    private int horas;
    Horista(){
        super();
        valorhora = 50;
        horas = 10;
        setSalario(horas*valorhora);
    }
    public double horasExtra(){
        horas = horas + 8;
        setSalario(horas*valorhora);
        return getSalario();
    }
    public double aumento(){
        valorhora = valorhora +10;
        setSalario(horas*valorhora);
        return getSalario();
    }

}
