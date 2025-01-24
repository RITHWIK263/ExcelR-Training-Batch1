public class Demo03 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        if((num1 > num2) && (num1 > num3)){
            System.out.println("Greatest number:"+num1);
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println("Greatest number:"+num2);
        }else{
            System.out.println("Greatest number:"+num3);
        }
    }
    
}
