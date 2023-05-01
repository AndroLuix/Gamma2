/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md.corsojava;

/**
 *
 * @author margh
 */
public class ProvaMetodo {
    
    public static void main(String[] args) { // JRE chiama il main
        
        int var_somma;
        
        System.out.println("Prima - Sono nel metodo main");
        
        var_somma = prova2metodo(2, 5); //chiamata al metodo static

        prova3metodo(); //chiamata al metodo static
        
        //provaNoStatic (); NO perché è no static
        
        System.out.println("Dopo - Sono nel metodo main");
        
        //System.out.println("var_somma vale:" + var_somma);
        
        //System.out.println("Sono nel main - il valore del metodo è:" + prova1metodo());
                       
        //System.out.println("Sono nel main - il valore del metodo è:" + prova2metodo(2, 3));
        
    }      
    
    
    public void provaNoStatic (){
    //prova del metodo non static 
        
        System.out.println("Il metodo non è static");
    } 
    
    private void provaNoStatic2 (){
    //prova del metodo non static  
        
        provaNoStatic();
        System.out.println("Il metodo non è static");
    } 
    
    // definizione metodo
    private static int prova2metodo (int p_num1, int p_num2){
        
        //prova del metodo con parametri  
        System.out.println("--- Sono in prova2metodo - il valore di p_num1 è:" + p_num1);
        System.out.println("--- Sono in prova2metodo - il valore di p_num2 è:" + p_num2);
        
        return p_num1 + p_num2;
        
    } 
    
// definizione metodo
    public static void prova3metodo (){
    //prova del metodo senza parametri    
        System.out.println("--- Sono in prova3metodo - il valore del metodo è:" + (3+2) );
    }

}




/*
public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
  */      



/*
public void provaNoStatic (){
    //prova del metodo non static    
        System.out.println("Il metodo non è static");
    } 
    
    public static int prova1metodo (){
    //prova del metodo senza parametri    
        int a = 10;
        int b = 2;

        return a + b;
    }   
    
       
    */