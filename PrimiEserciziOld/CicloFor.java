package PrimiEsercizi;

/**
 * @author margh
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        /*
        //sintassi della for
          for (inizializzazione; condizione; iterazione) {
              istruzioni_da_eseguire;
          }
        */

/* **************************************************************************************************
        int i;
        
        for (i = 0; i <= 11; i++){
            System.out.println("valore i:" + i);
        }
        //System.out.println("Fuori dal ciclo FOR il valore i è:" + i);
        
/***************************************************************************************************       

/* *************************************************************************************************
        
        // i è l'indice del ciclo              
        for (int i = 10; ( (i <= 10) & (i >= 0) ); i--) {
            System.out.println("1 - Sono all'interno del ciclo FOR: " + i);
        } 
        
        // i è l'indice del ciclo              
        for (int i = 10; ( (i <= 10) & (i >= 0) ); i--) {
            System.out.println("2 - Sono all'interno del ciclo FOR: " + i);
        }
        
        //System.out.println("2 - Sono all'interno del ciclo FOR: " + i);
        
/* **************************************************************************************************/

/* *************************************************************************************************      
        //ciclo for per inserimento in array

        int giorni_mese [] = new int [12];
        
        for  (int indice_array = 0; indice_array <= 11; indice_array++) {
            giorni_mese[indice_array] = 30;
        } 
        
        //ciclo for per visualizzazione dati array (dopo il completamento dell'array)
        for  (int indice_array = 0; indice_array <= 11; indice_array++) {
            System.out.println("valore:" + giorni_mese[indice_array]);
        }
/***************************************************************************************************/

        /* 
        //sintassi della for
          for (inizializzazione, inizializzazione; condizione; iterazione,iterazione){
              istruzioni_da_eseguire;
          }
        */

/* **************************************************************************************************

        for (int i = 0, j = 0; i <= 5 || j <= 5; i++, j++){
            System.out.println("for semplice valore i:" + i + " - valore j:" + j);
        }
       
/***************************************************************************************************/

//ciclo annidato
/* *************************************************************************************************
        for (int i = 0; (i <= 5); i++){                    
            System.out.println("valore i:" + i);
            
            for (int j = 0; (j <= 5); j++){                
                 System.out.println("----valore j:" + j);
            }
        }
        
/***************************************************************************************************/

/* *************************************************************************************************
        // stampare a video il seguente output:
        //  *****
        // ****
        // ***
        // **
        // *
        // *
        int     var_max_righe = 5;
        int var_max_asterisco = 5;

        String caratteri;

        for (int i = 0; i <= var_max_righe; i++) {

            caratteri = "";
            for (int j = 0; j <= var_max_asterisco; j++) {
                caratteri = caratteri + "*";
                
                // oppure: System.out.print("*"); senza l'uso della variabile caratteri
            }
            
            System.out.println(caratteri);
            
            var_max_asterisco--;
        }
        
/***************************************************************************************************/

/* *************************************************************************************************
        // PRIMO ciclo, quello della i
        for (int i = 1; i<=10; i++) {
            
            System.out.println("valore della i: " + i);

            // SECONDO ciclo, quello della j
            //boolean var_trovato = false;
            boolean var_ripeti = true;
            for (; var_ripeti == true; ) {
                //in questo secondo ciclo vedo la variabile i?                
                System.out.println(" var_ripeti = true ");
                var_ripeti = false;
            }
            System.out.println("Sono fuori dal ciclo j MA dentro il ciclo della i");
        }
                
        //System.out.println("Sono fuori dal ciclo FOR");
        //System.out.println("Sono all'esterno del ciclo FOR i E j: " );
        //System.out.println("Sono all'esterno del ciclo FOR: " + j);
    /***************************************************************************************************

        int serie_numeri [] = {1, 3, 5, 7, 8, 9, 11, 13}; //creazione dell'array
      
        for (int i=0; i <= 7; i++) {//ciclo for che scorre l'array {
            if (serie_numeri[i]%2==0) { // se il numero è pari
                System.out.println("Lindice del numero pari è:" + i); //visualizzo l'indice del numero pari a video
            }
        }
    ***************************************************************************************************      
    
    /* ***************************************************************************************************
        int serie_numeri [] = {1, 3, 5, 7, 8, 9, 11, 13}; //creazione dell'array        

        for (int serie_numeri_temp: serie_numeri) { //ciclo for che scorre l'array

            if (serie_numeri_temp %2 == 0) { // se il numero è pari    
                System.out.println(serie_numeri_temp); //stampo il numero a video
            }
        }
    /* ***************************************************************************************************/
                
    /* **************************************************************************************************      

        String mesi_anno [] = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio"}; //creazione dell'array

        for (String mesi_anno_temp: mesi_anno) { //ciclo for che scorre l'array

            System.out.println(mesi_anno_temp); //stampo il numero a video
            
        }        

    /* ***************************************************************************************************/
    }

}
