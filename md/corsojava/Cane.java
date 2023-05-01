package md.corsojava;

public class Cane extends Animali {
    String var_cane_crts01;
    String var_cane_crts02;
    int var_tot_cani;


    public void cani_sono(){
        var_cane_crts01 = "Il cane deriva dal lupo. ";
        var_cane_crts02 = "In totale vi sono, di razze, ";
        var_tot_cani = 200;
        //visualizzo le carattieristiche dei cani
        System.out.println(var_cane_crts01 + var_cane_crts02 + var_tot_cani);
    }

    public void cani_fanno(){
        var_dormono = "dormono 5 ore al giorno";
        var_dormono = "mangiano canri e vegetali";
        System.out.println(var_mangiano+ ". "+var_dormono);
    }

    public void non_cani_tot(){
        System.out.println("Al mondo ci sono "+ (var_tot_cani -var_tot_animali));
    }

    @Override
    public void animali_fanno(){
        System.out.println(" Sono adatti per la compagnia perciò sono considerati animali domestici");
    }

}
