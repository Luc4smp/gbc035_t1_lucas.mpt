public class CamaroteInferior extends Vip{
    private String assento;
    CamaroteInferior(){
        assento = "A20";
    }

    public String getAssento() {
        return assento;
    }
    public void mostrarAssento(){
        System.out.println("Assento de camarote inferior:" + assento);
    }
}
