import org.junit.Assert;
import org.junit.Test;

public class Leetcode1480TestCase {

    private Leetcode1480 obj = new Leetcode1480();

    @Test
    public void DifferentNums(){
        int[] num ={1,2,3,4};
        int[] ans={1,3,6,10};
        var result = obj.runningSum(num);
        Assert.assertArrayEquals(ans,result);

    }
    //---
    @Test
    public void SameNumbers(){
        int[] num ={1,1,1,1,1};
        int[] ans={1,2,3,4,5};
        var result = obj.runningSum(num);
        Assert.assertArrayEquals(ans,result);

    }
    //---
    @Test
    public void SingleElementArray(){
        int[] num ={1};
        int[] ans={1};
        var result = obj.runningSum(num);
        Assert.assertArrayEquals(ans,result);

    }

}
