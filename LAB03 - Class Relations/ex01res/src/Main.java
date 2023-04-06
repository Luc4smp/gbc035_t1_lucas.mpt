public class Main {
    public static void main(String[] args) {


        // Ex01, associação
        Casa endereco1 = new Casa("Santa Mônica",100, "Uberlandia",11,"cozinha e banheiro");
        Pessoa pessoa = new Pessoa("João", endereco1);
        Carro carro1 = new Carro("abc123","ford", 100);
        pessoa.dirigir(carro1);
    }
}