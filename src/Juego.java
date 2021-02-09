public class Juego {

    public static void main(String[] args) {

        Validaciones val = new Validaciones();
        Gestora g = new Gestora();
        int respuesta = 0;
        double valorTotal = 0;


        do{

            valorTotal = 0;

            do {
                System.out.println("********************");
                System.out.println("1 - Nueva Carta");
                System.out.println("2 - Me planto");
                System.out.println("********************");
                System.out.println("Que opcion desea realizar?");
                respuesta = val.numeroEntre(1,2);

                if (respuesta ==1){
                 valorTotal += g.sacarCarta();
                }

                System.out.println("Total: "+valorTotal);

                System.out.println("********************");

            }while(valorTotal < 7.5 && respuesta == 1);


            if (valorTotal > 7.5){
                System.out.println("Has perdido");
            }else if( valorTotal < 7.5){

                valorTotal += g.sacarCarta();

                if (valorTotal >7.5){
                    System.out.println("Hubieras perdido si no te hubieras rendido, has ganado");
                }else{
                    System.out.println("Hubieras ganado peazo pollo");
                }

            }else{

                System.out.println("Has ganado!!!!!1");

            }

            System.out.println("Quieres volver a jugar?");
            respuesta = val.numeroEntre(1,2);

        }while(respuesta ==1);





    }


}
