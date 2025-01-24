import java.util.*;
public class Demo025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String a = sc.nextLine();

        int vowel=0;
        int cons=0;

        for(int i=0; i<a.length();i++){
            char ch = a.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                    cons++;
                }
        }
        System.out.println("Word: "+a);
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+cons);


    }
}