class Solution {
   
     public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        List<Integer> numberOfWaysMemory = new ArrayList<>();
        numberOfWaysMemory.add(1);
        numberOfWaysMemory.add(2);

        for (int i = 2; i < n; i++) {
            numberOfWaysMemory.add(numberOfWaysMemory.get(i - 1) + numberOfWaysMemory.get(i - 2));
        }

        return numberOfWaysMemory.get(n - 1);
    }
}