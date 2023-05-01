package PrimiEsercizi;

/**
 * @author margh
 */
public class Stringhe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String var_prova_stringa  = "Margherita";
        String var_prova_stringa2 = "MaRghEriTa";
        
        if (var_prova_stringa == var_prova_stringa2)  { 
            System.out.println(" UGUALI - utilizzo di ==");
        } else {
            System.out.println("DIVERSI - utilizzo di ==");
        }
        
        if (var_prova_stringa.equals(var_prova_stringa2)) {
            System.out.println(" UGUALI - utilizzo equals");
        } else {
            System.out.println("DIVERSI - utilizzo equals");
        }

        if ( var_prova_stringa.equalsIgnoreCase(var_prova_stringa2)) {
            System.out.println(" UGUALI - utilizzo di IgnoreCase");
        } else {
            System.out.println("DIVERSI - utilizzo di IgnoreCase");
        }
        
    }
}