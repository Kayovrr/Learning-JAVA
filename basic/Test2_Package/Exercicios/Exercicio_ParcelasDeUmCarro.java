package Test2_Package.Exercicios;

public class Exercicio_ParcelasDeUmCarro {
    // Dado o valor de um carro, descubra em quantos ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void  main(String[] args){
        double valorCarro = 10000;

        for (int parcela = 1; parcela <= 40; parcela ++){
            double valorParcela = valorCarro/parcela;

            if (valorParcela >= 1000){
                System.out.println(parcela+" Parcelas de "+ valorParcela+" R$");

            }else{
                break;
            }
        }
    }
}
