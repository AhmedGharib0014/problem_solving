public class ReverseInteger {


    public static int reverse(int x) {
        String s=Integer.toString(x);
        StringBuilder stringBuilder= new  StringBuilder();
        for (int i=0;i<s.length();i++){
            if(x<0 && i==0) continue;;
            stringBuilder.append(s.charAt(i));
        }


        for(int i=0 ;i<stringBuilder.length()/2;i++){
            Character ch1 = stringBuilder.charAt(stringBuilder.length()-i-1);
            stringBuilder.setCharAt(stringBuilder.length()-i-1, stringBuilder.charAt(i));
            stringBuilder.setCharAt(i,ch1);
        }

        try{
            int result = Integer.parseInt(stringBuilder.toString());
            if(x<0){
                return  -1*result;
            }else{
                return  result;
            }

        }catch (Exception e){
            return  0;
        }




    }

    public static void main(String[] args) {
        System.out.println(reverse(12));
    }

}
