public class Swap {
	void swapnumbers() {
		int a = 100, b = 200;
		System.out.println("Before Swap a = "+a +" b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a = "+a +" b = "+b);		
	}
}

public class Demo11 {
    public static void main(String[] args){
        Swap obj = new SwapDemo();
        obj.swapnumbers();
    }
}