import org.junit.Assert;
import org.junit.Test;

public class LeetCode1929TestCase {

    private LeetCode1929 obj = new LeetCode1929();

    @Test
    public void test1(){

        int[] arr = {1,2,1};
        int[] ans = {1,2,1,1,2,1};

        var result = obj.getConcatenation(arr);

        Assert.assertArrayEquals(ans,result);

    }
    //----------
    @Test
    public void test2(){

        int[] arr = {1,3,2,1};
        int[] ans = {1,3,2,1,1,3,2,1};

        var result = obj.getConcatenation(arr);

        Assert.assertArrayEquals(ans,result);

    }





}
