class Solution {
   public int reverse(int x) {
        boolean isMinus = false;

        if (x < 0) {
            isMinus = true;
            x *= -1;
        }

        char[] xArray = String.valueOf(x).toCharArray();
        reverseString(xArray);

        try {
            return Integer.parseInt(new String(xArray)) * (isMinus ? -1 : 1);
        } catch (Exception e) {
            return 0;
        }
    }

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