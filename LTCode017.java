import java.util.Arrays;

public class LTCode017 {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] points = {distance(p1, p2), distance(p1, p3), distance(p1, p4), 
                        distance(p2, p3), distance(p2, p4), distance(p3, p4)};
        Arrays.sort(points);
        return points[0] > 0 && points[0] == points[1] && points[0] == points[2] && points[0] == points[3]
               && points[4] == points[5];
    }

    private int distance(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public static void main(String[] args) {
        LTCode017 obj = new LTCode017();
        int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,1};
        System.out.println(obj.validSquare(p1, p2, p3, p4));
        int[] p1_2 = {0,0}, p2_2 = {1,1}, p3_2 = {1,0}, p4_2 = {0,12};
        System.out.println(obj.validSquare(p1_2, p2_2, p3_2, p4_2)); 
        int[] p1_3 = {1,0}, p2_3 = {-1,0}, p3_3 = {0,1}, p4_3 = {0,-1};
        System.out.println(obj.validSquare(p1_3, p2_3, p3_3, p4_3));
    }
}
