import org.junit.Assert;
import org.junit.Test;

public class LeetCode12TestCase {

    private Leetcode12 obj = new Leetcode12();

    @Test
    public void test1(){
        var result = obj.intToRoman(3);
        Assert.assertEquals("III",result);
    }
//--
@Test
public void testX(){
    var result = obj.intToRoman(10);
    Assert.assertEquals("X",result);
}
//--
@Test
public void testXX(){
    var result = obj.intToRoman(20);
    Assert.assertEquals("XX",result);
}
//--
@Test
public void testVIII(){
    var result = obj.intToRoman(8);
    Assert.assertEquals("VIII",result);
}
//--


}
