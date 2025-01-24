public class Demo026 {
    public static void main(String[] args) {
        int x = 13;
        

        if(x>0){
            if(x==1){
                System.out.println("1 is neither prime nor composite");
            }
            else{
                boolean prime = true;
                for (int i = 2; i <= x-1; i++) {
                    if (x % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println(x + " is Prime");
                } else {
                    System.out.println(x + " is Not Prime");
                }
            }
        }

    }
}