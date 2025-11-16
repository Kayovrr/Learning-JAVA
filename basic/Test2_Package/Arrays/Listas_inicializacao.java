package Test2_Package.Arrays;

public class Listas_inicializacao {
    public static void main(String[] args){
        int[][] arrayInt = new int[3][];

        // referenciando array dentro de array

        arrayInt[0] = new  int[2];
        arrayInt[1] = new  int[7];
        arrayInt[2] = new  int[1];

        for (int[] listaBase: arrayInt){
            System.out.println("\n=-=-=-=-=-=");
            for ( int num: listaBase){
                System.out.print(num+" ");
            }
        }

        // Imagem da array
        /*
                0  1  2
                [] [] []
                [] []
                   []
                   []
                   []
                   []
                   []
         */

        // outra maneira de iniciar uma lista
        int [][] arrayInt2 = {{0,1,0,0,1,1,1,1},{0,1,0,0,1,1,0,0},{0,1,0,0,0,0,0,1}};

    }
}
