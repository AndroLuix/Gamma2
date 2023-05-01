/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author lui12
 */
public class Persona {
    String nome = "Luigi";
    String cognome = "Salvatore";
    int eta = 25;
    String citta = "Napoli";
    
    void saluta (){
        System.out.println("Ciao sono " + nome);
    }
    void vivo(){
        System.out.println("Io vivo a " + citta);
    }
    
    void presentarsi(){
        System.out.println("Ciao sono "+ nome + 
                " ed ho "+ eta+ " anni.");
    }
}
     
   
 

