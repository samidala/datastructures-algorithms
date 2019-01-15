import java.util.ArrayList;

import java.util.List;



public class NumberFormatting
{
    public static void main(String[] args)
    {


        int top = Integer.parseInt("1");
        int bottom = Integer.parseInt("3");
       // System.out.println("Result: " + divide(top,bottom,true));
        System.out.println("Result: " + divide(3,41,true));
    }

    public static String divide(int numerator, int denominator, boolean showRepeatingGroup)
    {
        System.out.println("numerator "+numerator +",denominator "+denominator);
        int whole = numerator / denominator;
        numerator = (numerator % denominator) * 10;
        System.out.println("whole "+whole);

        System.out.println("numerator "+numerator);

        StringBuilder result = new StringBuilder(whole + ".");
        int initialLength = result.length();

        List<Integer> remainders = new ArrayList<>();
        int repeatingPos = -1;

        System.out.println("before while "+numerator);

        while (numerator > 0 && repeatingPos == -1) {
            remainders.add(numerator);
            whole = numerator / denominator;
            numerator = (numerator % denominator) * 10;
            result.append(whole);
            System.out.println("in while numerator "+numerator);
            System.out.println("result "+result);
            repeatingPos = remainders.indexOf(numerator);
            System.out.println(remainders);
        }

        if (repeatingPos >= 0 && showRepeatingGroup) {
            result.insert(initialLength + repeatingPos,  "{");
            result.append("}");
        }

        return result.toString();
    }
}