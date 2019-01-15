import com.dp.LongestIncrSubSeq;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestIncrSubSeqTest {

    private  LongestIncrSubSeq longestIncrSubSeq;

    @Before
    public void before(){
        longestIncrSubSeq = new LongestIncrSubSeq();
    }

    @Test
    public void testLis1(){

        int[] a = {1,2,10, 22, 9, 33, 21, 50, 41, 60, 80};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(8,maxLis);

    }

    @Test
    public void testLis2(){
        int[] a =  {3, 10, 2, 1, 20};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(3,maxLis);

    }

    @Test
    public void testLis3(){
        int[] a ={3, 2};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(1,maxLis);

    }

    @Test
    public void testLis4(){
        int[] a ={50, 3, 10, 7, 40, 80};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLis5(){
        int[] a ={50, 3, 10, -1, 40, 80};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLis6(){
        int[] a ={50, 3, 10, -1, 40, 80,7,6,5,4,3,2,1};
        int maxLis = longestIncrSubSeq.lis(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDp1(){

        int[] a = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(6,maxLis);

    }

    @Test
    public void testLisDp2(){
        int[] a =  {3, 10, 2, 1, 20};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(3,maxLis);

    }

    @Test
    public void testLisDp3(){
        int[] a ={3, 2};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(1,maxLis);

    }

    @Test
    public void testLisDp4(){
        int[] a ={50, 3, 10, 7, 40, 80};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDp5(){
        int[] a ={50, 3, 10, -1, 40, 80};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDp6(){
        int[] a ={50, 3, 10, -1, 40, 80,7,6,5,4,3,2,1};
        int maxLis = longestIncrSubSeq.lisDp(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDpImprovised1(){

        int[] a = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(6,maxLis);

    }

    @Test
    public void testLisDpImprovised2(){
        int[] a =  {3, 10, 2, 1, 20};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(3,maxLis);

    }

    @Test
    public void testLisDpImprovised3(){
        int[] a ={3, 2};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(1,maxLis);

    }

    @Test
    public void testLisDpImprovised4(){
        int[] a ={50, 3, 10, 7, 40, 80};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDpImprovised5(){
        int[] a ={50, 3, 10, -1, 40, 80};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testLisDpImprovised6(){
        int[] a ={50, 3, 10, -1, 40, 80,7,6,5,4,3,2,1};
        int maxLis = longestIncrSubSeq.lisDpImprovised(a);
        Assert.assertEquals(4,maxLis);

    }

    @Test
    public void testPrintLisDpImprovised1(){
        int[] a ={50, 3, 10, -1, 40, 80,7,6,5,4,3,2,1};
        int[] lis = longestIncrSubSeq.printLisDpImprovised(a);
        Assert.assertArrayEquals(new int[]{3,10,40,80},lis);;


    }

}
