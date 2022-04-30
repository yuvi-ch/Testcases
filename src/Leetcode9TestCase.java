import org.junit.Assert;
import org.junit.Test;

public class Leetcode9TestCase {

    private LeetCode9 obj = new LeetCode9();
    @Test
    public void test1(){
        var result = obj.isPalindrome(121);

        Assert.assertEquals(true,result);
    }
    //--
    @Test
    public void test2(){
        var result = obj.isPalindrome(1101);

        Assert.assertEquals(false,result);
    }
    //--
    @Test
    public void test3(){
        var result = obj.isPalindrome(-121);

        Assert.assertEquals(false,result);
    }

}
