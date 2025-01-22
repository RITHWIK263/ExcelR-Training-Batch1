public class LTcode002 {
    public int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
            
        int reversedNumber = 0;
            
        while (x != 0) {
            
            int digit = x % 10;
                x /= 10;
                
            
            if (reversedNumber > INT_MAX / 10 || (reversedNumber == INT_MAX / 10 && digit > 7)) {
                return 0;
            }
            if (reversedNumber < INT_MIN / 10 || (reversedNumber == INT_MIN / 10 && digit < -8)) {
                return 0; 
            }
                
            reversedNumber = reversedNumber * 10 + digit;
        }
            
        return reversedNumber;
    }
        
    public static void main(String[] args) {
    LTcode002 solution = new LTcode002();
            
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(1534236469));
    }
}
