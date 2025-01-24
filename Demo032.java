
import java.util.HashSet;
import java.util.Scanner;

public class Demo032 {
    static void hash(){
        HashSet<String> h = new HashSet<>();
        h.add("Hi");
        h.add("Hello");
        h.add("world");
        System.out.println(h);

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a word");
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            h.add(word);
        }
        System.out.println(h);
        sc.close();

    }
    public static void main(String[] args) {
        hash();
    }
}