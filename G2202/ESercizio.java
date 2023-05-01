/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package G2202;

/**
 *
 * @author lui12
 */
public class ESercizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int arr[] = {1,3,5,7,8,9,11,13};
      
         for (int indice = 0; indice <=8; indice++){
            //arr[indice]++;
            System.out.println("Numero arrai: " +arr[indice]+ " | Indice "+ indice);
            int diviso =  arr[indice] % 2;
            System.out.println("diviso "+diviso);
            for (int contatore = 0; diviso == 0; contatore++){
                System.out.println("Combinazioni trovate:  "+ contatore+" Indice dell'array"+indice +" con valore all'interno:" + arr[indice]);
                diviso++;
            }
        }
    }
}
    

