public class Selecao {

    private String nomesel;
    private String nometec;
    private Figurinha []listaj = new Figurinha[11];

    public void setSelec(String no, String na, Figurinha fig[])
    {
        nomesel = no;
        nometec = na;
        listaj = fig;


    }

    public String getNometecnico(){
        return nometec;
    }
    public String getNomesele(){
        return nomesel;
    }
    public Figurinha getTime(int i){
        return listaj[i];
    }

    public void mostrarSel()
    {
        int i;
        System.out.println("Selecao "+ ": " + nomesel + " " + nometec+ " " + " Time:");

        for (i=0; i <11; i++)
        {
            listaj[i].mostrarFig();
        }
    }

}
