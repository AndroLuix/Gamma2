/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md.corsojava;

/**
 *
 * @author margh
 */
class DimostraSetGet {
    
    private String var_parola = "Prova 2";           
               int var_numero = 10;

    public void set_var_parola(String p_parola) {
        this.var_parola = p_parola;
    }
    
    public String getVar_parola() {
        return var_parola;
    }
    
}

public class DimostraPrivate {
    public static void main (String[] args) throws Exception{    
        
        String var_temp_parola;
        
        DimostraSetGet obj_setget = new DimostraSetGet();
        
        var_temp_parola = obj_setget.getVar_parola();
        System.out.println(var_temp_parola);
        
        obj_setget.set_var_parola("Pippo");
        obj_setget.var_numero = 10;
        
        var_temp_parola = obj_setget.getVar_parola();
        System.out.println(var_temp_parola);
        
    }

}