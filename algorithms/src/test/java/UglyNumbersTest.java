import com.dp.UglyNumbers;
import org.junit.Assert;
import org.junit.Test;

public class UglyNumbersTest {

    @Test
    public void testnthUglyNos(){

        int n = 150;
        int res = UglyNumbers.nthUglyNos(n);
        Assert.assertEquals(5832,res);
    }
}
