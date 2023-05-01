package md.corsojava;

public class VariabileStatic {

  public static void main(String[] args) {
      Prova1 obj_prova1 = new Prova1();
      
      System.out.println("Prova1.var_static:" + Prova1.var_static + "<");
      
      System.out.println("1 PRIMA DI ASSEGNAZIONE:" + obj_prova1.var_static + "<");
      System.out.println("1 PRIMA DI ASSEGNAZIONE:" + obj_prova1.var_NON_static + "<");
      
      obj_prova1.var_static = "CAMBIO STATIC";           // NON è una copia ma è la variabile presente in classe Prova1 
      obj_prova1.var_NON_static = "CAMBIO no STATIC";    //copia
    
    
      System.out.println("1 DOPO ASSEGNAZIONE var_static:" + obj_prova1.var_static + "<");
      System.out.println("1 DOPO ASSEGNAZIONE var_NON_static:" + obj_prova1.var_NON_static + "<");
    
      Prova1 obj_prova2 = new Prova1(); 
      
      System.out.println("2 PRIMA DI ASSEGNAZIONE:" + obj_prova2.var_static + "<"); 
      System.out.println("2 PRIMA DI ASSEGNAZIONE:" + obj_prova2.var_NON_static + "<"); 
      obj_prova2.var_static = "3";
      obj_prova2.var_NON_static = "4";
              
      System.out.println("2 DOPO ASSEGNAZIONE var_static:" + obj_prova2.var_static + "<");
      System.out.println("2 DOPO ASSEGNAZIONE var_NON_static:" + obj_prova2.var_NON_static + "<");
      
      System.out.println("1-2 DOPO ASSEGNAZIONE var_static:" + obj_prova1.var_static + "<");
      System.out.println("1-2 DOPO ASSEGNAZIONE var_NON_static:" + obj_prova1.var_NON_static + "<");
  }
    
  public static class Prova1 {
    public static String var_static = "static classe Prova1";  //variabile di classe
    public String var_NON_static = "NO static classe Prova1";  
    }
}