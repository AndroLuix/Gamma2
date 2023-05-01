package Iscrizione;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthStyle; 
import javax.xml.validation.Validator; 
import java.util.Scanner; // Terminale input

import java.util.*;

public class iscrizioneUtente {
    public static void main(String[] args) {
        
        //per terminale
        Scanner myObj = new Scanner(System.in);
        
        //inserimento dati: Nome e Cognome
        System.out.println("Inserisci il tuo nome");
        String nome_utente = myObj.nextLine();
        
        System.out.println("Inserisci il tuo Cognome");
        String cognome = myObj.nextLine();
       

        // comando eliminazione degli spazzi vuoti
        nome_utente = nome_utente.strip();
        cognome = cognome.strip();

        // conversione di stringhe nome e cognome in int (lunghezza)
        int length_nome = nome_utente.length();
        int length_cognome = cognome.length();

        // benvenuto
        String benvenuto = "Benvenuto " + nome_utente + " " + cognome;

        // requisiti del nome/cognome
        int length_min = 2, length_max = 15;

        // esaminazione email:

        // esaminazione del nome e cognome
        if (length_nome >= length_min && length_nome <= length_max
                && length_cognome >= length_min && length_cognome <= length_max) {
            System.out.println(benvenuto);
        //fine esaminazione
        
        //inserisci email
            System.out.println("Inserisci una email");
         String indirizzo_e = myObj.nextLine();
            
            //verifica email
            Verifica indirizzo = new Verifica();
            ArrayList<String> email = new ArrayList<>();
            
            email.add(indirizzo_e);
            for (String i : email) {
                if (Verifica.Valido(i))
                    System.out.println(i + " Email valida");//conferma email
                else
                    System.out.println(i + "Indirizzo non valido");//non conferma
                    //try catch?
            
            }
        } else {  
            System.out.println("Il nome dev'essere lungo tra " + length_min++ + " e " + --length_max + " caratteri");
                
        }
        

    }
}
