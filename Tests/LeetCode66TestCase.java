import org.junit.Assert;
import org.junit.Test;

public class LeetCode66TestCase {
    private LeetCode66 obj = new LeetCode66();
    @Test
    public void EqualLengthArrays(){
        int[] q = {1,2,3};
        int[] a = {1,2,4};
        var result=obj.plusOne(q);
        Assert.assertArrayEquals(a,result);
    }
    @Test
    public void UnequalLengthArrays(){
        int[] q = {9};
        int[] a = {1,0};
        var result=obj.plusOne(q);
        Assert.assertArrayEquals(a,result);
    }


}
