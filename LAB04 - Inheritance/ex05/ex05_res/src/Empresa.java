public class Empresa {
    private String Nome;

    Empresa(){
        Nome = "padrão";
    }

    public void main() {
        Chefe []C = new Chefe[2];
        C[0] = new Chefe();
        C[1] = new Chefe();
        Vendedor []V = new Vendedor[2];
        V[0] = new Vendedor();
        V[1] = new Vendedor();
        Operario []O = new Operario[2];
        O[0] = new Operario();
        O[1] = new Operario();
        Horista []H = new Horista[2];
        H[0] = new Horista();
        H[1] = new Horista();

        System.out.println("Salario horista: " + H[0].getSalario());
        System.out.println("Salario com aumento: " + H[0].aumento());
        System.out.println("Salario com horas extras: " + H[1].horasExtra());
        System.out.println("Salario com horas extras e aumento: " + H[1].aumento());


    }

}
