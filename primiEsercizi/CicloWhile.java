package PrimiEsercizi;

/**
 * @author margh
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //sintassi della while
        //  while (condizione) {
        //      istruzioni_da_eseguire;
        //  }
/* **************************************************************************************************

        int contatore = 1;
        int var_num1 = 3;
        int var_num2 = 3;
        
        System.out.println ("Prima della while");
        
        System.out.println ("Sono prima della while, contatore:" + contatore);
        
        while (var_num1 < var_num2) {
            contatore++;
            System.out.println ("Sono dentro la while, contatore:" + contatore);
        }
        
        System.out.println ("Dopo la while");
        
/* **************************************************************************************************
        
        int var_conta = 0;
        String var_prova = "palla";
        boolean var_boolean = true;
        
        System.out.println ("Prima della while");
        
        var_conta = 1;
        // ripeti fino a condizione VERA
        while (var_prova == "palla") { 
          System.out.println ("Valore di var_conta:" + var_conta);
          var_conta++; 
        }

       System.out.println ("Dopo la while");
/* **************************************************************************************************

/* **************************************************************************************************/
        int var_contatore1 = 1;
        
        System.out.println ("Prima della while");

        
        
        while ((var_contatore1 >= 1) && (var_contatore1 <= 10))  { // 1-10
            
           System.out.println("Sono all'interno del ciclo WHILE: " + var_contatore1);
           var_contatore1++; 
        } 
        
        
        System.out.println ("Prima della DO while");
        var_contatore1 = 1;
        
        do {
           System.out.println("Sono all'interno del ciclo DO WHILE: " + var_contatore1);
           var_contatore1++; 
           
        } while ((var_contatore1 >= 1) && (var_contatore1 <= 10)); // 1-10 o almeno una volta
        
        System.out.println ("Dopo la DO while");
        
/***************************************************************************************************/

    }

}
