public class LTCode011 {
    

    public int[] singleNumber(int[] nums) {
        
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int rightmostBit = xor & (-xor); 
       
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & rightmostBit) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num; 
            }
        }

        return result;
    }
    public static void main(String[] args) {
        LTCode011 solution = new LTCode011();
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        int[] result1 = solution.singleNumber(nums1);
        System.out.println("Unique numbers in nums1: " + result1[0] + ", " + result1[1]);
        int[] nums2 = {-1, 0};
        int[] result2 = solution.singleNumber(nums2);
        System.out.println("Unique numbers in nums2: " + result2[0] + ", " + result2[1]);
        int[] nums3 = {0, 1};
        int[] result3 = solution.singleNumber(nums3);
        System.out.println("Unique numbers in nums3: " + result3[0] + ", " + result3[1]);
    }
}
