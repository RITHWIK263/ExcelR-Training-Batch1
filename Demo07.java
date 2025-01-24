import java.util.Scanner;
public class Demo07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int age = sc.nextInt();
        int phone_number = sc.nextInt();

        System.out.println("Your Name:"+Name);
        System.out.println("Your Age:"+age);
        System.out.println("Your Phone number:"+phone_number);
    }
    
}
