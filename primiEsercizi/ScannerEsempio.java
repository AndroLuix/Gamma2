package PrimiEsercizi;

/**
 * @author margh
 */

import java.util.*; //utilizza il prefisso


public class ScannerEsempio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scan02();
    }
    
    /*
      un semplice esempio dell'utilizzo della classe Scanner
    */
    public static void scan01() {
        
        String var_tastiera;
        String var_nome;
        String var_cognome;
        
        Scanner obj_tastiera = new Scanner(System.in);
        
        System.out.println("Nome?");
        var_tastiera = obj_tastiera.nextLine();
        
        var_nome = var_tastiera.toUpperCase();
        
        System.out.println("Cognome?");
        var_tastiera = obj_tastiera.nextLine();
        
        var_cognome = var_tastiera.toLowerCase();
        
        System.out.println("Ti chiami:" + var_nome + var_cognome);
    
    }
    
    /*
      attenzione all'ordine di richiesta
    */
    public static void scan02() {
    
        Scanner obj_tastiera = new Scanner(System.in);
        
        System.out.print("Inserire il nome:");
        String var_nome = obj_tastiera.nextLine();
        
        System.out.print("Inserire anni:");
        int var_anni = obj_tastiera.nextInt();      
        //double var_anni = obj_tastiera.nextDouble();
        //obj_tastiera.nextLine(); 
        
        System.out.print("Inserire il cognome:");
        String var_cognome = obj_tastiera.nextLine(); 
        
        System.out.println("Ti chiami:" + var_nome + " "
                                        + var_cognome + " e hai " 
                                        + var_anni + " anni");
        
        
        obj_tastiera.close();
    }
    
    /*
      attenzione all'impostazione locale
    */
    public static void scan03() {
        
        //java.util.Locale.setDefault(Locale.ITALY);
        //java.util.Locale.setDefault(Locale.ENGLISH);
    
        System.out.println("Inizio!");
        
        Scanner obj_tastiera = new Scanner(System.in);
        
        System.out.println("Inserisci numero:");
        double var_numero = obj_tastiera.nextDouble();
        
        System.out.println("finito, il numero inserito è:" + var_numero);
        
        obj_tastiera.close();
    }
    
}