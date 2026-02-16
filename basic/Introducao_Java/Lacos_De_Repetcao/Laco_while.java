package Introducao_Java.Lacos_De_Repetcao;

public class Laco_while {
    public static void main(String[] args){
        // while, do while, for
        // O valor só é repetido se o valor for verdadeiro
        int cont = 0;
        while (cont < 10){
            System.out.println(++cont);


        }
        // o do while serve para repetir o bloco de código pelo menos uma vez e continuar a repetição enquento uma condição especifica for verdadeira.
        do {
            System.out.println("dentro do do-while");
        } while (cont < 10);


    }
}
