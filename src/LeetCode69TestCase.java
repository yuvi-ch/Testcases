import org.junit.Assert;
import org.junit.Test;

public class LeetCode69TestCase {
    private LeetCode69 obj = new LeetCode69();

    @Test
    public void testFor1(){
        var result = obj.mySqrt(1);
        Assert.assertEquals(1,result);
    }

    @Test
    public void testFor2(){
        var result = obj.mySqrt(4);
        Assert.assertEquals(2,result);
    }

    @Test
    public void testFor3(){
        var result = obj.mySqrt(9);
        Assert.assertEquals(3,result);
    }

    @Test
    public void testFor10(){
        var result = obj.mySqrt(100);
        Assert.assertEquals(10,result);
    }
    @Test
    public void testForRound2(){
        var result = obj.mySqrt(6);
        Assert.assertEquals(2,result);
    }
}
