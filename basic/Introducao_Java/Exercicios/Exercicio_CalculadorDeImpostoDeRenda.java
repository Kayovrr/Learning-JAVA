package Introducao_Java.Exercicios;

public class Exercicio_CalculadorDeImpostoDeRenda {
    public static void main(String[] args){

        double salarioAnual = 90000;
        double calculador;

        if (salarioAnual <= 38411){
            calculador = salarioAnual * 0.3582;
        } else if (salarioAnual <= 76817) {
            calculador = salarioAnual * 0.3748;
        } else{
            calculador = salarioAnual * 0.495;
        }

        System.out.println("Você vai pagar:"+calculador+" de imposto de renda nos paises baixos em 2025");

    }
}
