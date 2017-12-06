
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class medicine {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Medicine");
        String medicine  = s.nextLine();
        System.out.println("Enter Tmax(in hours):");
        int tmax = s.nextInt();
        System.out.println("do you want to enter time of dose?");
        char n = s.next().charAt(0);
        int time =0;
        int amount;
        SimpleDateFormat time2= new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        if (n=='y'){
                    System.out.println("Enter time of dosage");
                    String time_new = s.nextLine();
                    time = ordinalDate(,,);
        }
        System.out.println("The medicine details are ");
        System.out.println("Medicine :"+medicine);
        System.out.println("Time of dosage:");
        System.out.println(time);       
        System.out.println("Full dosage time" );
        System.out.println(time+tmax * 100);
        System.out.println("Half Concentration time:");
        System.out.println(time+tmax * 100+ half * 100);

    }
}
