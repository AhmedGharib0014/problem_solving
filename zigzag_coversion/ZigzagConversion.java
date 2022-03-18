public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        if(s.length()<=numRows) return  s;
        if(numRows<=2) return s;

        StringBuilder stringBuilder = new StringBuilder();
        int first=0;
        int second = 0;

        for(int i=0;i<numRows;i++){
            int j=i;


            if(i==0||i==numRows-1){
                first=second=2*numRows -2;

            }else{
                first=first-2;
                second=2*numRows -first-2;
            }

            while (j<s.length() && first>0){
                stringBuilder.append(s.charAt(j));
                j=j+first;
                if(j >= s.length()) break;
                else   stringBuilder.append(s.charAt(j));
                j=j+second;
                if(j >= s.length()) break;
            }
        }
        return  stringBuilder.toString();

    }


    public static void main(String[] args) {
        String s = "AA";
        System.out.println(convert(s,1));

    }
}
