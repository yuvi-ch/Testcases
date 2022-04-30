import org.junit.Assert;
import org.junit.Test;

public class LeetCode14TestCase {
    private LeetCode14 obj = new LeetCode14();

    @Test
    public void test1(){
        String[] strs = {"flower","flow","flight"};
        var result = obj.longestCommonPrefix(strs);
        Assert.assertEquals("fl",result);
    }
//--
@Test
public void test2(){
    String[] strs = {"dog","racecar","car"};
    var result = obj.longestCommonPrefix(strs);
    Assert.assertEquals("",result);
}
}
