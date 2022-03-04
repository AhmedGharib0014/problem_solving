package two_sum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - i;
            if (numbersMap.containsKey(x)) {
                result[0] = numbersMap.get(x);
                result[1] = i;
                return result;
            } else {
                numbersMap.put(x, i);
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int[] test = { 2, 7, 11, 15 };

        System.out.println(twoSum(test, 9));

    }

}
