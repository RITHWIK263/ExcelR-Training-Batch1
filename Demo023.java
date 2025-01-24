

public class Demo023 {
    public static void main(String[] args) {
        String[] f1 = {"Chetan","Rithwik","Prakash","raghu","Sohan "};
        String[] address= {"Khammam ", "Karimnagar","Narva","Janagam","Kothagudem "};
        long[] number = {70324443,24890112,987839991,776891011,1090775432};

        for(int i =0; i<f1.length; i++){
            System.out.println("Friend "+(i+1)+" :"+f1[i]+address[i]+number[i]);
        }
        
        
    }
}