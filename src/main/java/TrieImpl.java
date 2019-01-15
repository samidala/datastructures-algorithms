public class TrieImpl {

    static final int ALPHABET_SIZE = 26;
    static class TrieNode{
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }

    static TrieNode root = new TrieNode();

    static void insert(String key){

        TrieNode crawl = root;

        for(int i=0;i<key.length();i++){
            int index = key.charAt(i) - 'a';
            if(crawl.children[index] == null){
                crawl.children[index] = new TrieNode();
            }
            crawl = crawl.children[index];
        }
        crawl.isEndOfWord = true;
    }

    static boolean search(String key)
    {

        TrieNode crawl = root;

       for(int i=0;i<key.length();i++){
           int index = key.charAt(i) - 'a';
           if(crawl.children[index] == null){
               return false;
           }
           crawl = crawl.children[index];
       }

       return crawl !=null && crawl.isEndOfWord;

    }

    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


       // root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("there") == true)
            System.out.println("there --- " + output[1]);
        else System.out.println("there --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }
}
