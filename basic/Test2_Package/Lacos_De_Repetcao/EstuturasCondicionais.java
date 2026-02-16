package Test2_Package.Lacos_De_Repetcao;

public class EstuturasCondicionais {
    public static void main(String[] args){
        int idade = 2;
        boolean isMaiorDeIdade = idade >= 18;

        // if só recebe valores bolean
        if (isMaiorDeIdade){
            //System.out.println("É maior de idade.");
        }
        // !
        if(!isMaiorDeIdade){
            //System.out.println("É menor de idade.");
        }

        // else
        if (isMaiorDeIdade){
            //System.out.println("Você tem idade legal para comprar vodka.");
        }else{
           //System.out.println("Você não tem idade legal para comprar vodka.");
        }
        // else if

        if (idade >= 10 && idade <= 19){
            System.out.println("Você é adolecente");
        } else if (idade > 19) {
            System.out.println("Você é adulto");
        }else{
            System.out.println("Você é criança");
        }


    }
}
