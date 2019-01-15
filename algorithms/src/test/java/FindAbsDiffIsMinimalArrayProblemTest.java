import com.dp.FindAbsDiffIsMinimalArrayProblem;
import org.junit.Assert;
import org.junit.Test;

public class FindAbsDiffIsMinimalArrayProblemTest {

    @Test
    public void testcase1(){
       int a[] = {1, 3, 15, 11, 2};
       int b[] = {23, 127, 235, 19, 8};

       int minDiff =  FindAbsDiffIsMinimalArrayProblem.findMinAbsDiff(a,b);
       Assert.assertEquals(3,minDiff);
    }

    @Test
    public void testcase2(){
        int a[] = {10, 5, 40};
        int b[] = {50, 90, 80};

        int minDiff =  FindAbsDiffIsMinimalArrayProblem.findMinAbsDiff(a,b);
        Assert.assertEquals(10,minDiff);
    }

    @Test
    public void testcase3(){
        int a[] = {1, 3, 15, 11, 2};
        int b[] = {23, 127, 235, 19, 8};

        int minDiff =  FindAbsDiffIsMinimalArrayProblem.findMinAbsDiffEfficient(a,b);
        Assert.assertEquals(3,minDiff);
    }

    @Test
    public void testcase4(){
        int a[] = {10, 5, 40};
        int b[] = {50, 90, 80};

        int minDiff =  FindAbsDiffIsMinimalArrayProblem.findMinAbsDiffEfficient(a,b);
        Assert.assertEquals(10,minDiff);
    }
}
