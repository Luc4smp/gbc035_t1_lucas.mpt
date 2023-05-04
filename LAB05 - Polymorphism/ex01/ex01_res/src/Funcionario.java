public class Funcionario {
    private String nome;
    private String nasc;
    private double salario;
    Funcionario(){
        nome = "padrão";
        nasc = "0/0/0000";
        salario = 0;
    }
    public void setSalario(double sal){
        salario = sal;
    }
    public double getSalario(){
        return salario;
    }
}
