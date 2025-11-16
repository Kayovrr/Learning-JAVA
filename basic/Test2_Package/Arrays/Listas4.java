package Test2_Package.Arrays;

public class Listas4 {
    public static void  main(String[] args){
        // outra formara de inicializar o array

        int[] numeros = {1,2,3,4,5,6,7,8};
        // ou
        int[] numeros1 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
        // esse for n te da acesso ao index de numeros1,é uma forma simplificada.
        for(int i: numeros1 ){
            System.out.println(i);
        }
    }
}
