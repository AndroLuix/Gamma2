package md.corsojava;

/**
 * @author margh
 */
public class Debug {
    
    static String var_classe = "inizializzata";

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int var_int = 1;
        double var_double = 1.0;
        
        if (var_int == 1) {
            var_int++;
            var_int = var_int * 2;
            var_classe = var_classe + "-";
        }
        
    }
    /*************************************************************************************************
     STEP INTO, OVER, OUT
           
     Step Into
     Un metodo sta per essere richiamato e si vuole effettuare il debug del codice del metodo,
     il passo successivo entrerà nel metodo
     
     Step Over
     Un metodo sta per essere richiamato e NON si vuole effettuare il debug del codice del metodo,
     il debug non entrerà all'interno ma effettuerà le istruzioni tutte insieme
 
     Step Out
     La chiamata ritorna al metodo chiamante

     */
    /*
    static void metodo2 (int x) {
        System.out.println ("num is " + x); // <- STEP INTO
    }

    static void metodo1 (int x) {
        metodo2(x);  // <-
        metodo2(1);  // <----------------------------------- STEP OVER
    }

    public static void main (String args[]) {
        metodo1(2);
        metodo1(3);  // <----------------------------------- STEP OUT OF
    }*/
}