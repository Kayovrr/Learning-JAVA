package Core_Java.Introducao_Classe.test;

import Core_Java.Introducao_Classe.Dominio.Carro;

public class Carro_test {
    public static void main(String[] args){

        Carro carro = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Turbo";
        carro.ano = 2000;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

    }
}
