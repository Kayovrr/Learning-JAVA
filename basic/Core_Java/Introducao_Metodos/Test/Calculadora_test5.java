package Core_Java.Introducao_Metodos.Test;

import Core_Java.Introducao_Metodos.Dominio.Calculadora;

public class Calculadora_test5 {
    public static void main(String... args){
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs( 1,2,3,4,5,6,76,2);
    }
}
