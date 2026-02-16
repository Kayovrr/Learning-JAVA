package Core_Java.TratamentoDeExceções;

public class loopDaCasaVazia {

    public static void main(String[] args) {

        boolean casa_vazia = true;

        int cont = 0;

        while (cont < 100000000) {

            if ( cont == 99999999){
                throw new IllegalArgumentException("O loop acabou");

            }
            else if (casa_vazia == true) {
                System.out.println("Tem alguem na casa, mas não por muito tempo ");
                casa_vazia = false;


            } else if (casa_vazia == false) {

                System.out.println("Não tem nimguem na casa, mas não por muito tempo");

                casa_vazia = true;
            }

            cont ++;
        }
    }
}
