public class Proprietario {
        private String nome;
        private Casa casa;
        // Construtor
        public Proprietario(String n,Casa c) {
            nome = n;
            casa = c;

        }

        public void dirigir(Carro c){
            System.out.println(nome+ " vai dirigir o carro");
            c.ligar();
            c.gasol(-10);
            c.desligar();
            System.out.println(nome+ " chegou em sua casa no endereço: " + casa.getEndereco());
        }
}
