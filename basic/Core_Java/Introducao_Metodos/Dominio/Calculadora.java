package Core_Java.Introducao_Metodos.Dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+20);
    }

    public void subtriDoisNumeros(){
        System.out.println(9-10);
    }

    public void multiplicaDoisNumeros(int num1,int num2){

        System.out.println(num1*num2);

    }

    public void divideDoisNumeros(double num1, double num2){

        if (num2 == 0){
            System.out.println("Operação invalida");
        }else{
            System.out.println(num1/num2);
        }

    }

    public void alteraDoisNumeros(int num1,int num2){
        num1 = 12;
        num2 = 54;

        System.out.println("num1= "+num1+" e "+"num2= "+num2);


    }

    public void  somaArray(int[] numeros){

        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);

    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num:numeros){
            soma += num;
        }
        System.out.println(soma);


    }
}
