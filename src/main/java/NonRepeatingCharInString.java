import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class NonRepeatingCharInString {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(findFirstNonRepeatingChar(str));
        str = "sssssss";
        System.out.println(findFirstNonRepeatingChar(str));
    }

   static char findFirstNonRepeatingChar(String s){

        String temp = "ancdfff";

        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>(chars.length);
        char firstNonRepeatingChar = ' ';

        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        return map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().orElse(new AbstractMap.SimpleEntry<Character, Integer>(firstNonRepeatingChar,0)).getKey();



    }

    /*static char findFirstNonRepeatingCharV1(String s){

        String temp = "ancdfff";

        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        char firstNonRepeatingChar = ' ';

        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            if(set.contains(c)){
                map.remove(c);
            }else{
                map.put(c,1);
            }
        }
        if(!map.isEmpty()){
            return map.entrySet().iterator().next().getKey();
        }


        return firstNonRepeatingChar;
    }*/



}
