
import static java.util.Calendar.*;


public class DateUtility {
    public static boolean isLeapYear(int year){
        return (year%4 == 0 && year%100 != 0) || year%400 == 0;
    }
    
    @SuppressWarnings("empty-statement")
    public static int daysIn(int month,int year){
       
        if (year <1 )
             throw new IllegalArgumentException ("daysIn : year ("+year+") not positive");
        if (month< JANUARY || month > DECEMBER)             
            throw new IllegalArgumentException ("daysIn : year ("+year+") not in range [1,12]");
        if ( month == APRIL || month ==JUNE || month == SEPTEMBER || month == NOVEMBER )
               return 30;
        else if (month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER || month == DECEMBER)
                return 31;
        else 
               return 28 + (isLeapYear(year)?1:0);
    }
    
    public static int ordinalDate(int month, int day, int year){
        int ordinal =0 ;
        for (int m = JANUARY;m<month;m++)
            ordinal += daysIn(m,year);
        return ordinal +day;
        
    }
    
    public static String americanFormat(int month,int day,int year){
        return month+"/"+day+"/"+year;
    }
    
    
    public static String europeanFormat(int month,int day,int year){
        return day+"/"+month+"/"+year;
    }
    

}


