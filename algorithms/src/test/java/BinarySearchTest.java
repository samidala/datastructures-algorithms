import com.dp.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testFindNearestNo1(){

        int[] a = {1,2,3,4,59,78,82,86,101};
        int key = 3;
        int pos = BinarySearch.findNearestNo(a,key);
        Assert.assertEquals(2,pos);

    }

    @Test
    public void testFindNearestNo2(){

        int[] a = {1,2,3,4,59,78,82,86,101};
        int key = 5;
        int pos = BinarySearch.findNearestNo(a,key);
        Assert.assertEquals(3,pos);

    }

    @Test
    public void testFindNearestNo3(){

        int[] a = {1,2,3,4,7,78,82,86,101};
        int key = 6;
        int pos = BinarySearch.findNearestNo(a,key);
        Assert.assertEquals(4,pos);

    }
}
