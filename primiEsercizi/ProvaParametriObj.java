package md.corsojava;

class TestParametri {
    int a;
    int b;
    
    TestParametri (int i, int j){
        a = i;
        b = j;
    }
    
    void dimostro_parametri (TestParametri p_obj_test_parametri) {
    
       //TestParametri mio_temp_test_parametri = new TestParametri(p_obj_test_parametri.a, p_obj_test_parametri.b);
       
        System.out.println("*");
        System.out.println("    Dentro dimostro_parametri:");
                
        System.out.println("        prima p_obj_test_parametri.a:" + p_obj_test_parametri.a); //3
        System.out.println("        prima p_obj_test_parametri.b:" + p_obj_test_parametri.b);//6
        
        p_obj_test_parametri.a = p_obj_test_parametri.a * 4; 
        p_obj_test_parametri.b = p_obj_test_parametri.b / 2; 

        System.out.println("         dopo obj_test_parametri.a:" + p_obj_test_parametri.a); //12
        System.out.println("         dopo obj_test_parametri.b:" + p_obj_test_parametri.b); //3
        System.out.println("*");

    } 
}

public class ProvaParametriObj {

    public static void main(String[] args) {
        
        TestParametri mio_test_parametri = new TestParametri(3, 6);
        
        System.out.println("Prima della chiamata");
        System.out.println("    mio_test_parametri.a vale:" + mio_test_parametri.a); //3
        System.out.println("    mio_test_parametri.b vale:" + mio_test_parametri.b); //6
        
        mio_test_parametri.dimostro_parametri(mio_test_parametri); // chiamata al metodo per riferimento
        
        System.out.println("Dopo la chiamata");
        System.out.println("    mio_test_parametri.a vale:" + mio_test_parametri.a); //3 
        System.out.println("    mio_test_parametri.b vale:" + mio_test_parametri.b); //  6            

    }    
}