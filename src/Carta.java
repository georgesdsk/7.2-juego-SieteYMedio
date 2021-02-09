import java.util.Random;

public class Carta {

    private Random rd = new Random();
    private Palo palos[] = Palo.values();
    private Valor valores[] = Valor.values();
    private Valor valor;
    private Palo palo;
    private double sumaTotal;

    public Carta() {

        valor = valores[rd.nextInt(valores.length)];
        palo = palos[rd.nextInt(palos.length)];

    }

    public double getSumaTotal() {
        return  valor.getValor();

    }

    public String toString(){

        return this.valor.toString() +" de "+ this.palo.toString();

    }

}
