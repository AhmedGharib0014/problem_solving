package arthimatic_slice;

class ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums) {

        if (nums.length < 3)
            return 0;

        int result = 0;
        int j = 1;
        for (int i = 0; i < nums.length - 2; i++) {

            for (j = i + 2; j < nums.length; j++) {
                if ((nums[j] - nums[j - 1] == nums[j - 1] - nums[j - 2])) {
                    if (j - i >= 2)
                        result++;

                } else {
                    break;
                }

            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int result = numberOfArithmeticSlices(nums);
        System.out.println(result);

    }
}