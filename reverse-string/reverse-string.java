class Solution {
     public void reverseString(char[] s) {

        for (int j = 0; j < s.length / 2; j++) {
            swap(s, j);
        }


    }

    public void swap(char[] s, int i) {
        int length = s.length - 1;
        char temp = s[i];
        s[i] = s[length - i];
        s[length - i] = temp;
    }
    
}