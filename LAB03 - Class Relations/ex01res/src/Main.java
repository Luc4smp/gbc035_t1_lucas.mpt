public class Main {
    public static void main(String[] args) {


        //associação quando casa é criado
        Casa endereco1 = new Casa("Santa Mônica",100, "Uberlandia",11,"cozinha e banheiro");

        //agregação
        Proprietario p1 = new Proprietario("João", endereco1);

        //associacao, proprietario usa carro
        Carro carro1 = new Carro("abc123","ford", 100);
        p1.dirigir(carro1);
    }
}