import java.sql.SQLOutput;

public class Training3 {

    String[] names = {"m1", "m2", "m3"};

    public static void main(String[] args) {
        String names[] = new String[]{"i", "j", "l", "m", "n"};

        names = new String[]{"i", "j", "l", "m", "n"};


        int[] b = new int[]{1,2,3};


        int size = b.length;

        //index based


        for (int i = 0; i < size; i++) {

            System.out.println(b[i]);
        }

        for(int i = 0; i<size-1; i++){
            System.out.println("mul: " +b[i] * b[i+1]);
        }





    }
}
