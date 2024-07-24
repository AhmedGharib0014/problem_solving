class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return calculate(nums1, nums2);
        } else {
            return calculate(nums2, nums1);
        }

    }

    public int[] calculate(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums1) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (int n : nums2) {
            if (freq.containsKey(n)) {
                result.add(n);
                int currentValue = freq.get(n) - 1;
                if (currentValue == 0) {
                    freq.remove(n);
                }else{
                    freq.put(n, currentValue);
                }

            }
        }


        // Storing it inside array of strings
        int[] arr = new int[result.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }


        return arr;
    }

}