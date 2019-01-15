import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramWords {


    static class  Word{
        String originalWord;
        String sortedWord;

        Word(String originalWord){
            this.originalWord = originalWord;
            char[] alphabets = originalWord.toCharArray();
            Arrays.sort(alphabets);
            this.sortedWord = String.copyValueOf(alphabets).intern();
        }

        @Override
        public int hashCode() {
            return sortedWord.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Word word = (Word) obj;
            return word.sortedWord== this.sortedWord;
        }

    }

    static void findAllAnagrams1(String[] inputWords){
        Map<Word,List<String>> map = new HashMap<>();
        for(String word: inputWords){
            Word wordObj = new Word(word);
            if(map.containsKey(wordObj)){
                map.get(wordObj).add(word);
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(wordObj,list);
            }
        }
        map.entrySet().forEach(e -> System.out.println(e.getValue()));
    }
    static void findAllAnagrams(String[] inputWords){
        Map<String,List<String>> map = new HashMap<>();
        for(String word: inputWords){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            //map.computeIfPresent(sorted,(k,v) -> compute(k,v));
            if(map.containsKey(sorted)){
                map.get(sorted).add(word);
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted,list);
            }
        }
        map.entrySet().forEach(e -> System.out.println(e.getValue()));
    }
    static List<String> compute(String word, List<String> list){
        list.add(word);
        return list;
    }
    public static void main(String[] args) {
        String words[] = { "cat", "dog", "tac", "god", "act","ae","bd"};
        findAllAnagrams(words);
        System.out.println("*************************");
        findAllAnagrams1(words);
    }
}
