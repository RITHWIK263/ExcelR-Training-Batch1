public class LTCode015 {
    public static void main(String[] args) {
        int[] nums1 = {1, 15, 6, 3};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(absoluteDifference(nums1));
        System.out.println(absoluteDifference(nums2));
    }
    
    public static int absoluteDifference(int[] nums) {
        int elementSum = 0;
        for (int num : nums) {
            elementSum += num;
        }
        int digitSum = 0;
        for (int num : nums) {
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
