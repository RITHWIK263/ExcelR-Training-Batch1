import java.util.Scanner;
public class Demo019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        int first=0 , second=1;

        for(int i=0; i<n; i++){
            System.out.println(first+" ");

        int next = first+second;
        first = second;
        second = next;
    }
    sc.close();
    
}
}