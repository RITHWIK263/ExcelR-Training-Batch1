public class LTCode014 { 
    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;
        System.out.println(differenceOfProductAndSum(n1));
        System.out.println(differenceOfProductAndSum(n2));
    }
    public static int differenceOfProductAndSum(int n) {
        int product = 1;  
        int sum = 0;     
        while (n > 0) {
            int digit = n % 10; 
            product *= digit;    
            sum += digit;        
            n /= 10;             
        }
        return product - sum;
    }
}

