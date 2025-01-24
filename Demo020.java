import java.util.Scanner;
public class Demo020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if((number % 3 == 0) && (number % 5 == 0)){
            System.out.println("Fizz Bizz");
        }else if(number % 3 == 0){
            System.out.println("Fizz");
        }else if(number % 5 == 0){
            System.out.println("Bizz");
        }else{
            System.out.println("The number is not a multiple of 3 and 5");
        }
        }
    }
    

