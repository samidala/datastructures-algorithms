import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {

        int a[] = {1,2,3};

        List list = new ArrayList();

        list.add("s");


       /* for(Object s: list){
            System.out.println(s);
            list.add("sss");
        }
*/
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            list.add("ssss");
            itr.next();
        }

    }
}
