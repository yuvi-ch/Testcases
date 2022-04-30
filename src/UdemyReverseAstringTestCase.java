import org.junit.Assert;
import org.junit.Test;

public class UdemyReverseAstringTestCase {

    private UdemyReverseAstring obj = new UdemyReverseAstring();

    @Test
    public void test1(){
        var result = obj.revStr("olleh");
        Assert.assertEquals("hello",result);
    }
    //---
    @Test
    public void test2(){
        var result = obj.revStr("123");
        Assert.assertEquals("321",result);
    }

}
