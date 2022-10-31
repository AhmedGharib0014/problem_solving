class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> set = new HashSet<>();
       int result = n;

       while (true){
           int temp = result;
           result=0;

           while (temp > 0){
               int digit = temp%10;
               result += digit*digit;
               temp -= digit;
               temp /=10;
           }

           if(result == 1) return true;
           else if(set.contains(result)) return false;
           else {
               set.add(result);
           }
       }


    }
}