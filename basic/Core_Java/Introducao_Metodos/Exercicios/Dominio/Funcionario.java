package Core_Java.Introducao_Metodos.Exercicios.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario = new double[3];



    public void imprimir(){

        System.out.println("==========");
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (int i = 0; i < 3; i++){

            System.out.println(salario[i]);
        }

    }

    public void SalarioMedia(){

        double soma = 0;

        for (int i = 0; i < 3;i++) {

            soma += salario[i];
        }

        double media = soma/3;
        System.out.println(media);
        System.out.println("==========");


    }
}
