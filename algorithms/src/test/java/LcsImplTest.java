import com.dp.LcsImpl;
import org.junit.Assert;
import org.junit.Test;

public class LcsImplTest {


    @Test
    public void testLis(){
        char X[] = "AGGTAB".toCharArray();
        char Y[] = "GXTXAYB".toCharArray();
        int lcs = LcsImpl.lcs(X,Y,X.length,Y.length);
        Assert.assertEquals(4,lcs);
    }

    @Test
    public void testLisDp(){
        char X[] = "AGGTAB".toCharArray();
        char Y[] = "GXTXAYB".toCharArray();
        int lcs = LcsImpl.lcsDp(X,Y);
        Assert.assertEquals(4,lcs);
    }


}
