import java.util.LinkedList;

public class Impl implements  I1,I2 {


    public void display() {
        System.out.println("display called");
    }

    public static void main(String[] args) {
        new LinkedList<>();
        I1 i1 = new I1() {

        };
        I2 i2 = new Impl();
        i1.display();
        i2.display();
    }
}
