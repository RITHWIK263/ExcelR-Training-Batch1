import java.util.Scanner;
public class Demo018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        long minutes = sc.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        sc.close();

    }
    
}
