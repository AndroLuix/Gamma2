package md.corsojava;

import java.util.*;

class IntWrap {
    
    void cast_mode() {

        double var_num_double = 3.899;
           int var_num_int = 10;
        
        //var_num_int = var_num_double;
        var_num_int = (int) var_num_double;
                
        //int var_num_int2 = (int) "23";
        //int var_num_int2 = (int) '2';
         
        System.out.println("cast_mode");
        System.out.println("*     Valore di var_num_double:" + var_num_double + "<");
        System.out.println("* Valore di var_num_int:" + var_num_int + "<");
        //System.out.println("* Valore di var_num_int2:" + var_num_int2 + "<");
        System.out.println("*******************");
    }
    
    void double_to_int_fisso () {
        
           int var_numero_intero;
        Double var_numDouble  = 88.9903123;
        
        var_numero_intero = var_numDouble.intValue();

        System.out.println("double_to_int_fisso");
        System.out.println("*     Valore di var_numDouble:" + var_numDouble + "<");

        System.out.println("* Valore di var_numero_intero:" + var_numero_intero + "<");
        System.out.println("*******************");
        
    }
    
    void dblstr_to_int () {
        
        String var_input = Richiedi_Input();
        
        int var_numero_intero;
        
        double var_provo_numero = Double.parseDouble(var_input);
        
        var_numero_intero = (int) var_provo_numero;
        
        var_provo_numero = var_numero_intero * 2;
        
        System.out.println("double_to_int_dinamico");
        System.out.println("*         Valore di var_input:" + var_input + "<");
        System.out.println("* Valore di var_numero_intero:" + var_numero_intero + "<");
        System.out.println("*      Valore di provo_numero:" + var_provo_numero + "<");
        System.out.println("*********************");
    }
    
    
    void str_to_int (){
        
        String var_input = Richiedi_Input();
        
        Integer var_numero = Integer.valueOf(var_input); 
        int var_numero_int = Integer.parseInt("33"); 
        
        int var_provo_numero = var_numero * 2;
        
        System.out.println("str_to_int");
        System.out.println("*     Valore di var_numero:" + var_numero + "<");
        System.out.println("*     Valore di var_numero_int:" + var_numero_int + "<");
        System.out.println("*      Valore di provo_numero:" + var_provo_numero + "<");
        System.out.println("*********************");

    }
    
    private String Richiedi_Input () {
        Scanner var_input = new Scanner(System.in);
        System.out.println("Si prega di inserire un numero:");
        return var_input.nextLine();
    }
    
    private void Cosa_Provare () {
           Number var_number;           
          Boolean var_boolean;
        Character var_character;
          Integer var_integer;
           String var_string;
           Double var_double;
            Float var_float;
    }
    
}
public class EsempiWrapper {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntWrap mio_int_wrap = new IntWrap();
               
        //mio_int_wrap.cast_mode();
        
        //mio_int_wrap.double_to_int_fisso();
                
        //mio_int_wrap.dblstr_to_int();
        
        //mio_int_wrap.str_to_int();
        
        //formatta_numero();
        
    }
    
    static void formatta_numero (){
        
        double importo = 11.252;
        
        String str_importo;
        
        str_importo = String.format("%6.3f", importo); 
                
        System.out.println("L'importo formattato è:" + str_importo + "<");
        
        //System.out.println("Altra modalità:" + String.format("%-6.3f", importo) + "<");
        
    }
}