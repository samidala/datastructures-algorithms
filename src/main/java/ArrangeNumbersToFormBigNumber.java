
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeNumbersToFormBigNumber {

    static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            String xy = ""+o1 + o2;
            String yx = ""+o2 + o1;
            return yx.compareTo(xy);
        }
    };

    static void formBigNo(int[] a){
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(list,comparator);
        list.stream().forEach(e -> System.out.print(e));
        System.out.println();
    }

    public static void main(String[] args) {
       int a[] = {54, 546, 548, 60};

       formBigNo(a);
        a =  new int[] {1, 34, 3, 98, 9, 76, 45, 4};
        formBigNo(a);

    }
}
