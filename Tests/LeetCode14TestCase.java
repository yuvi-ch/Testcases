import org.junit.Assert;
import org.junit.Test;

public class LeetCode14TestCase {
    private LeetCode14 obj = new LeetCode14();

    @Test
    public void NormalValue(){
        String[] strs = {"flower","flow","flight"};
        var result = obj.longestCommonPrefix(strs);
        Assert.assertEquals("fl",result);
    }
//--
@Test
public void EmptyString(){
    String[] strs = {"dog","racecar","car"};
    var result = obj.longestCommonPrefix(strs);
    Assert.assertEquals("",result);
}
}
