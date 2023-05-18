public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(1095,"Lucas", 20000.00);
        try {
            f.salarioPerc(0.3);
            } catch ( Excecao e ) {
            System.out.println(e.getMessage());
            }
    }
}