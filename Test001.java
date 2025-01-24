public class Test001 {
    public static void main(String[] args){
        int n = 10;
        for(int i=0; i<=n; i++){
            if(i == 5 || i == 7){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
    
}
