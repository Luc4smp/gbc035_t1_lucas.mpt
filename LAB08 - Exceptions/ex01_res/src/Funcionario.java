public class Funcionario {
    private int cpf;
    private String nome;
    private double salario;
    private double tetoSalarial;
    public Funcionario(int c, String n, double s){
        cpf = c;
        nome = n;
        salario = s;
        tetoSalarial = 40000.00;
    }

    public void salarioPerc(double s){
        double s1 = salario + salario*s;
        if ( s1 > tetoSalarial) {
            System.out.println("Salario atual: "+ salario);
            throw new Excecao("Salario é maior que o teto, erro");
        }else if ( s1 < 0) {
            System.out.println("Salario atual: "+ salario);
            throw new Excecao("valor invalido de salario, erro");
        }else{
            salario = s1;
        }
        System.out.println("Salario atual: "+ salario);
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }
}

