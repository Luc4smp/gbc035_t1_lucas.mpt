public class Main {
    public static void main(String[] args) {
        Classificador cl = new Classificador();
        Produto []p = new Produto[4];
        Cliente []c = new Cliente[4];
        Servico []s = new Servico[8];
        p[0] = new Produto(10);
        p[1] = new Produto(15);
        p[2] = new Produto(5);
        c[0] = new Cliente("Arthur");
        c[1] = new Cliente("Pedro");
        c[2] = new Cliente("Lucas");
        s[0] = new Servico(50);
        s[1] = new Servico(80);
        s[2] = new Servico(120);
        s[3] = new Servico(70);
        s[4] = new Servico(30);
        s[5] = new Servico(40);
        s[6] = new Servico(100);
        s[7] = new Servico(90);
        for(int i =0; i < 7; i++){
            if(s[i] != null){
                System.out.println("Valor "+ i+": " + s[i].getPreco());
            }
        }
        cl.ordena(s);
        for(int i =0; i < 7; i++){
            if(s[i] != null){
                System.out.println("Valor "+ i+": " + s[i].getPreco());
            }
        }

    }
}