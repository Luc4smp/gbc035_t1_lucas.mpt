public class Carro {
    String placa;
    String modelo;
    int gasolina;
    public Carro(String p, String m, int g){
        placa = p;
        modelo = m;
        gasolina = g;
    }

    public void ligar(){
        System.out.println("Carro ligado\n"+ "Placa: "+ placa);
    }

    public void desligar(){
        System.out.println("Carro desligado\n"+"Placa: "+ placa);
    }

    public void gasol(int t){
        gasolina = gasolina - t;
    }
}
