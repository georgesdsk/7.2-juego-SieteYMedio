public class Gestora {


    public double sacarCarta(){

        double valor;

        Carta carta = new Carta();
        valor = carta.getSumaTotal();
        System.out.println(carta.toString());

        return valor;

    }




}
