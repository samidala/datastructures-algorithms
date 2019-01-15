import java.util.ArrayList;
import java.util.LinkedList;

public class Training2 {

    public static void main(String[] args){
        double result = methodDivide(1, 3);
        System.out.println(result);
        result = methodDivide(7, 41);
        System.out.println(result);
        System.out.println("The binary value is: " + convertToBinary(22));
       // ArrayList


    }

    private static double methodDivide(int n, int d) {
        double aDouble = ((double)(n));
        double bDouble = ((double)(d));
       // System.out.println(aDouble/bDouble);
        return (aDouble);
    }

    public static String convertToBinary(int i){
        Integer wrap = i;
        return wrap.toBinaryString(i);
    }
}
