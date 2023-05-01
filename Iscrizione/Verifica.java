package Iscrizione;

// Java program to check if an email address
// is valid using Regex.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Verifica{
    
    public static boolean Valido(String email){
        String email_richiesta = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                                    "[a-zA-Z0-9_+&*-]+)*@" +
                                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                                    "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(email_richiesta);
        if (email == null) //NULL nel ciclo if:
                           //se il valore testato è uguale a NULL, puoi stampare a video il messaggio "L'oggetto è uguale a NULL". 
                           //Se l'oggetto o il valore testato non è uguale a NULL, le istruzioni contenute 
                           //nel blocco "if" non verranno eseguite e il programma procederà come indicato.
                            
            return false;
        return pat.matcher(email).matches();

        
    }

   
}

