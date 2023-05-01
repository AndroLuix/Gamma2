package ES3IfCompito;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lui12
 */
public class IfElseExercism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int ral;
        double tassa;
        double quota;
       
        String rientra;
        
        ral = 20000;
        
       
        
         if ( ral<=8125 ){
            rientra = " Quindi: No tax area ";
            System.out.println(ral + rientra );

        }else if(ral > 8125 && ral <= 15000) {
            rientra=" Prima fascia. Tassazione 23% "; 
            System.out.print(ral+rientra);
            tassa = 0.23;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 15000 && ral <= 28000) { 
            rientra=" Seconda fascia. Tassazione: 27% "; 
            System.out.print(ral+rientra);
            tassa = 0.27;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 28000 && ral <= 55000){ 
            rientra = " Terza fascia. tassazione 38%";
            System.out.println(ral + rientra);
            tassa = 0.38;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 55000 && ral <= 75000) { 
            rientra=" Quarta fascia. Tassazione: 41% "; 
            System.out.print(ral+rientra);
            tassa = 0.41;
            quota = ral * tassa;
            System.out.println(quota);

        }else if(ral > 75000){ 
            rientra = " Quinta ed ultima fascia. Tassazione 43%";
            System.out.println(ral + rientra);
            tassa = 0.43;
            quota = ral * tassa;
            System.out.println(quota);
        }
        
    }
    
}
