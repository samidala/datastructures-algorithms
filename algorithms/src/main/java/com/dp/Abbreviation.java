package com.dp;

public class Abbreviation {

    public static void main(String[] args) {

        //System.out.println("abcd".matches("a{1}b{1}.*"));

        String a = "daBcd";
        String b = "ABC";
        canMatch(a,b);

         a = "daBcd";
         b = "ABCC";
        canMatch(a,b);

        a = "daBcd";
        b = "ABc";
        canMatch(a,b);
    }



    static String canMatch(String a,String b){

        int indexes[] = new int[b.length()];
        String result = "";

        int startFromIndex = 0;
        for (int i = 0; i < b.length(); i++) {

            char c = b.charAt(i);
            int index = a.indexOf(c, startFromIndex);
            if(index == -1){
                if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                }else{
                    c = Character.toLowerCase(c);
                }
                index = a.indexOf(c, startFromIndex);
            }
          //  int indexUpperCase = a.indexOf(c, startFromIndex);
            if (index == -1) {
                result = "NO";
                break;
            } else {
                startFromIndex = index;
                indexes[i] = index;
            }
        }
        if(result != "NO"){

            for (int i = 0; i < indexes.length - 1; i++) {
                int start = indexes[i];
                int end = indexes[i+1];
                for(int j=start;j<end;j++){
                    char c = a.charAt(j);
                    if(Character.isUpperCase(c) && !b.contains(c+"") && !b.contains(Character.toUpperCase(c)+"")){
                        result = "NO";
                        break;
                    }
                }
            }
            if(result != "NO"  ){
                for(int i = indexes[indexes.length - 1]; i < a.length();i++){
                    char c = a.charAt(i);
                    if(Character.isUpperCase(c)){
                        result = "NO";
                        return result;
                    }
                }
            }
            result = "YES";

        }

        System.out.println(result);

        return result;



    }
}
