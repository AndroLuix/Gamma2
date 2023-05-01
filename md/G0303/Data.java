package md.G0303;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.ParseException;


public class Data {
    
    //throws ParseException per metodo StringToDate
    public static void main(String[] args) throws ParseException {
        
        //con_ofPattern();
        
        //senza_ofPattern();
        
        StringToDate();
        
    }
    
    static void con_ofPattern () {
        
        LocalDateTime mia_data = LocalDateTime.now(); 
                
        System.out.println("Prima della formattazione Local:" + mia_data + "<");
        
        DateTimeFormatter mia_formattazione = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE HH:mm:ss");  
        
        //DateTimeFormatter mia_formattazione = DateTimeFormatter.ofPattern("dd MMMM yy EEEE hh:mm:ss a");  
        
        String var_data_formattata =  mia_data.format(mia_formattazione);  
        
        System.out.println("Dopo la formattazione Local: " + var_data_formattata);  
        //System.out.println("Dopo la formattazione Local: " +  mia_data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy EEE HH:mm:ss")));  

    }
    
    static void senza_ofPattern () {
        
        Date var_data = Calendar.getInstance().getTime();
        //2023-03-03T14:24:15.055448100 <- valore restituito da LocalDateTime.now()
        //Fri Mar 03 14:28:17 CET 2023 <- valore restituito da Calendar.getInstance().getTime()
        System.out.println("Prima della formattazione: " + var_data);  
        
        // Display a date in day, month, year format
        DateFormat mio_date_format = new SimpleDateFormat("dd/MM/yyyy");
        String var_oggi = mio_date_format.format(var_data);
        System.out.println("Oggi è il: " + var_oggi);
        
        // Display date with day name in a short format
        mio_date_format = new SimpleDateFormat("EEE, dd/MMM/yyyy");
        var_oggi = mio_date_format.format(var_data);
        System.out.println("Oggi è sempre il: " + var_oggi);

        // Display date with a short day and month name
        mio_date_format = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        var_oggi = mio_date_format.format(var_data);
        System.out.println("Oggi è ancora il: " + var_oggi);

        // Formatting date with full day and month name and show time up to
        // milliseconds with AM/PM
        mio_date_format = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss.SSS a");
        var_oggi = mio_date_format.format(var_data);
        System.out.println("Sempre il: " + var_oggi);

    }
    
    static void StringToDate () throws ParseException  {

        String var_data_input = "06/06/2022 14:30";
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date obj_date = format.parse(var_data_input);
        System.out.println(obj_date); 
    }
    
}