class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (Character c : tasks) {
            freq[c - 'A']++;
        }

        Arrays.sort(freq);

        int idleSlots = (freq[25] - 1) * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(freq[i], freq[25] - 1);
        }

        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;

    }
}