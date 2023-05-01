package PrimiEsercizi;

/**
 * @author margh
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sconto = 10;
        
        // if per eguaglianza
        if (sconto == 10) {
            System.out.println("sei un nuovo cliente");
        } else if (sconto == 20) {
            System.out.println("è il tuo secondo acquisto");
        } else if (sconto == 30) {
            System.out.println("sei molto fedele");
        } else if (sconto == 40) {
            System.out.println("sei un campione di acquisti");
        } else {
            System.out.println("sconto non valido");
        }
        
        // switch della versione originale di Java
        switch (sconto) {
            case 10:
                System.out.println("sei un nuovo cliente switch");
                break;
            case 20:
                System.out.println("è il tuo secondo acquisto switch");
                break;
            case 30:
                System.out.println("sei molto fedele switch");
                break;
            case 40:
                System.out.println("sei un campione di acquisti switch");
                break;
            default:
                System.out.println("sconto non valido switch");
                break;
        }
        
        // nuova switch a freccia (switch rule, da Java14)
        switch (sconto) {
            case 10 -> System.out.println("sei un nuovo cliente switch2");
            case 20 -> System.out.println("è il tuo secondo acquisto switch2");
            case 30 -> System.out.println("sei molto fedele switch2");
            case 40 -> System.out.println("sei un campione di acquisti switch2");
            default -> System.out.println("sconto non valido switch2");
        }
        
        
        // switch originale con condizioni in OR
        switch (sconto) {
            case 10:
            case 15:
            case 18:
                System.out.println("sei un nuovo cliente switch");
                break;
            case 20:
                System.out.println("è il tuo secondo acquisto switch");
                break;
            case 30:
                System.out.println("sei molto fedele switch");
                break;
            case 40:
                System.out.println("sei un campione di acquisti switch");
                break;
            default:
                System.out.println("sconto non valido switch");
                break;
        }
        
        // switch rule con condizioni in OR
        switch (sconto) {
            case 10, 15, 18 -> {System.out.println("sei un nuovo cliente switch2");}
            case 20 -> System.out.println("è il tuo secondo acquisto switch2");
            case 30 -> System.out.println("sei molto fedele switch2");
            case 40 -> System.out.println("sei un campione di acquisti switch2");
            default -> System.out.println("sconto non valido switch2");
        }
        
        // if con or e intervalli
        if (sconto == 10 || sconto == 15 || sconto == 18) {
            System.out.println("sei un nuovo cliente");
        }
        
        if (sconto == 10 || sconto == 11 || sconto == 12 || sconto == 13 || sconto == 14 || sconto == 15 || sconto == 16 || sconto == 17 || sconto == 18 || sconto == 19 ) {
            System.out.println("sei un nuovo cliente");
        }
        
        
        if (sconto >= 10 && sconto <= 19) {  // if (sconto == 10 || sconto == 11 || sconto == 12 || sconto == 13 || sconto == 14 || sconto == 15 || sconto == 16 || sconto == 17 || sconto == 18 || sconto == 19    ) {
            System.out.println("sei un nuovo cliente");
        }
        
        // switch di assegnazione valore
        int var_scelta = 1;
        
        System.out.println("Inizio");
        
        String var_messaggio = ""; 
        switch (var_scelta) {
            case 1 -> var_messaggio = "Sono nel case 1";
            case 2 -> var_messaggio = "Sono nel case 2";
            case 3 -> var_messaggio = "Sono nel case 3";
        }
        System.out.println("var_messaggio vale:" + var_messaggio);
        
        String var_messaggio2;
        // altre righe di codice...
        var_messaggio2 = switch (var_scelta) {
                                  case 1 -> "Sono nel case 1";
                                  case 2 -> "Sono nel case 2";
                                  case 3 -> "Sono nel case 3";
                                 default -> "Sono nel default";
                              };
        System.out.println("var_messaggio2 vale:" + var_messaggio2);
        
        String var_messaggio3;
        // altre righe di codice...
        var_messaggio3 = switch (var_scelta) {
                                  case 1 -> "Sono nel case 1";
                                  case 2 -> {
                                      sconto = 11;
                                      yield "Sono nel case 2";
                                  }
                                  case 3 -> "Sono nel case 3";
                                 default -> "Sono nel default";
                              };
        System.out.println("var_messaggio2 vale:" + var_messaggio2);
        
        
        
        
    }

}
