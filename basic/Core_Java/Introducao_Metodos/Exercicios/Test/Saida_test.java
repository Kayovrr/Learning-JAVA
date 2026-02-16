package Core_Java.Introducao_Metodos.Exercicios.Test;

import Core_Java.Introducao_Metodos.Exercicios.Dominio.Funcionario;

public class Saida_test {

    public static void  main(String[] args){

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.nome = "Joremias";
        funcionario1.idade = 32;
        funcionario1.salario[0] = 1320;
        funcionario1.salario[1] = 1420;
        funcionario1.salario[2] = 1520;

        funcionario2.nome = "Sol";
        funcionario2.idade = 16;
        funcionario2.salario[0] = 1800;
        funcionario2.salario[1] = 1500;
        funcionario2.salario[2] = 2100;

        funcionario1.imprimir();
        funcionario2.imprimir();

        System.out.println("==========");

        funcionario1.SalarioMedia();
        funcionario2.SalarioMedia();











    }


}
