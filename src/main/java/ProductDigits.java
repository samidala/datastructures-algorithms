import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDigits {

    static void calc(int start, int end, int q){

        List<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++){
            int product = i * q;
            boolean result = match(i,product);
            if(result == false){
                list.add(i);
            }
        }
        System.out.println("out "+list);



    }

    public static void main(String[] args) {
        calc(10,12,2);
    }

    static boolean match(int no, int product){

        System.out.println("no "+no +" product "+product);
        int[] arr = new int[10];
        boolean result = false;

        while (no > 0){
            int mod = no % 10;
            if(arr[mod] == 0){
                arr[mod] = 1;
            }
            no = no /10;
        }
        System.out.println( " arr after no processing"+ Arrays.toString(arr));
        while (product > 0){
            int mod = product % 10;
            if(arr[mod] == 1){
                result = true;
                break;
            }
            product = product /10;
        }
        System.out.println( " arr after product processing"+ Arrays.toString(arr));
        for(int i=0;i<10;i++){
            if(arr[i] > 1){
               result = true;
            }
        }
        System.out.println("*****************************************");
        return result;

    }
}
