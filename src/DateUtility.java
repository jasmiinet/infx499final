
public class DateUtility {
    public static boolean isLeapYear(int year){
        return (year%4 == 0 && year%100 != 0) || year%400 == 0;
    }
    
    @SuppressWarnings("empty-statement")
    public static int daysIn(int month,int year){
       return 0;
    }

}
