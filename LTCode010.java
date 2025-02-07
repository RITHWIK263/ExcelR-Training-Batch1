public class LTCode010 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;
            int commonBitMask = ~(ones & twos);
            ones &= commonBitMask;
            twos &= commonBitMask;
        }
        
        return ones;
    }

    public static void main(String[] args) {
        LTCode010 solution = new LTCode010();
        
        int[] nums1 = {2, 2, 3, 2};
        System.out.println(solution.singleNumber(nums1));
        
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(solution.singleNumber(nums2));
    }
}
