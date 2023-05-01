/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lui12
 */
public class ES1CondizioneIf {

 public static void main(String[] args) {

        /*
         * nel caso l'importo sia suoperiore a 50,00 euro
         * le spese di spedizione sono gratuite
         */
        double importo;
        double speseDiSpedizione;

        importo=51.00;
        System.out.println("prima della if");

        if (importo > 50.00) { //in if (valore booleano)
            speseDiSpedizione = 0.0;
            System.out.println("le spese di spedizione sono gratuite");
        } else{
             speseDiSpedizione = 10.0;
            System.out.println("spese di spedizione" + speseDiSpedizione);
        }
        
        System.out.println("dopo la if");
    }

}
    

