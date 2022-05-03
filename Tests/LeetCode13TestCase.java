import org.junit.Assert;
import org.junit.Test;

public class LeetCode13TestCase {
    private LeetCode13 obj = new LeetCode13();

    @Test
    public void testFor10(){
        var result = obj.romanToInt("X");
        Assert.assertEquals(10,result);
    }
//--
@Test
public void testFor58(){
    var result = obj.romanToInt("LVIII");
    Assert.assertEquals(58,result);
}
//--
@Test
public void testFor3(){
    var result = obj.romanToInt("III");
    Assert.assertEquals(3,result);
}
//--
@Test
public void testFor1994(){
    var result = obj.romanToInt("MCMXCIV");
    Assert.assertEquals(1994,result);
}
//--


}
