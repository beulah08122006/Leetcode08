class Solution {
    public int singleNumber(int[] nums) {
         int result = 0;

        // Check all 32 bits
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            // Count how many numbers have this bit set
            for (int num : nums) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Keep the bit if it doesn't belong to a group of three
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }
}