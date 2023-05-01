package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lui12
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        //riferimento classe persona
        //nome dell'oggetto (in questo caso persona1)
        // new Persona: creazione dell'oggetto
        
        
        System.out.println(persona1.nome);
        System.out.println(persona1.cognome);
        System.out.println(persona1.eta);
        System.out.println(persona1.citta);
        
        //come chiamare i metodi:
        persona1.saluta();
        persona1.presentarsi();
        persona1.vivo();
        
        //creare un oggetto con la stessa classe:
        
        Utente Luigi = new Utente("Mario", "Rossi", 25, "Bergamo");
        Utente Roberta = new Utente("Licia","Rossi",25,"Napoli");
        System.out.println(Roberta.nome);
        
        
    }
    
}
