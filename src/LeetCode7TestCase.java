import org.junit.Assert;
import org.junit.Test;

public class LeetCode7TestCase {
    private LeetCode7 obj = new LeetCode7();

    @Test
    public void povitiveNumTest(){
    var result = obj.reverse(12345);
        Assert.assertEquals(54321,result);
    }
    @Test
    public void NegativeNumTest(){
        var result = obj.reverse(-123);
        Assert.assertEquals(-321,result);
    }
    @Test
    public void SingleNumberTest(){
        var result = obj.reverse(1);
        Assert.assertEquals(1,result);
    }
}
