public class ReverseInteger {


    public static int reverse(int x) {
        String s=Integer.toString(x);
        StringBuilder stringBuilder= new  StringBuilder();
        for (int i=0;i<s.length();i++){
            stringBuilder.append(s.charAt(i));
        }

        for(int i=0 ;i<s.length();i++){
            Character ch1 = stringBuilder.charAt(i);
            Character ch2 = stringBuilder.charAt(s.length()-i-1);
            stringBuilder.setCharAt(i,ch2);
            stringBuilder.setCharAt(s.length()-1,ch1);
        }

        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

}
