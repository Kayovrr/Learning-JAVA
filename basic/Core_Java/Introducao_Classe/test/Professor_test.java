package Core_Java.Introducao_Classe.test;

import Core_Java.Introducao_Classe.Dominio.Professor;

public class Professor_test {
    public static void main(String[] args){

        Professor professor = new Professor();

        professor.nome = "Mestre Pimba";
        professor.idade = 61;
        professor.sexo = 'M';

        System.out.println("O "+professor.nome+" é um capoerista proficional, com seus "+professor.idade+" anos de idade");
    }
}
