

public class RunLengthEncodedString {

    static void runLengthEncodedStr(String s){

        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();
        int count = 1;
        int i = 0;
        for(i=0;i<chars.length-1;i++){

            int j = i + 1;

            if(chars[i]== chars[j]){
                count++;
            }else {
                stringBuilder.append(""+chars[i]+count);
                count = 1;
            }
        }
        stringBuilder.append(""+chars[i]+count);
        System.out.println(stringBuilder);

    }

    public static void main(String[] args) {
        String s = "wwwwaaadexxxxxx";
        runLengthEncodedStr(s);
        s = "wwwwaaadexxxxxxabbbbc";
        runLengthEncodedStr(s);
    }
}
