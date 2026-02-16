package Core_Java.modificadores_de_acesso;

import java.util.ArrayList;

 class lista_de_compras {

     public String nome_produto;
     public int preco;
     private boolean propriedade_privada;


     private String estaprivada() {

         if (propriedade_privada == true) {

             System.out.println("Locke aprova");
         } else {
             System.out.println("Marx aprova");
         }

         return "foi isso";
     }

}


