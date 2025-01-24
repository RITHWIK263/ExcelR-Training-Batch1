import java.util.Scanner;
public class PS002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        if(value <= 0){
            System.out.println(-1);
        }else{
            int nextmultiple = ((value/100)+1)*100;
            System.out.println(nextmultiple);
        }
        sc.close();

    }
    
}
