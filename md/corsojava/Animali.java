package md.corsojava;

class Animali {
        
    String var_mangiano;
    String var_dormono;
    
    int var_tot_animali;    
    
    // visualizzo quello che fanno gli animali
    public void animali_fanno(){
        System.out.println(var_mangiano + ". " + var_dormono);
    } 
    
    // visualizzo il numero totale di animali
    public void animali_tot() {
        System.out.println("Al mondo ci sono " + var_tot_animali + " animali");
    }
}