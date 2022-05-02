import org.junit.Assert;
import org.junit.Test;

public class Leetcode9TestCase {

    private LeetCode9 obj = new LeetCode9();
    @Test
    public void TrueValueTest(){
        var result = obj.isPalindrome(121);

        Assert.assertEquals(true,result);
    }
    //--
    @Test
    public void FalseValueTest(){
        var result = obj.isPalindrome(1101);

        Assert.assertEquals(false,result);
    }
    //--
    @Test
    public void NegativeValueTest(){
        var result = obj.isPalindrome(-121);

        Assert.assertEquals(false,result);
    }

}
