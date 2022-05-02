import org.junit.Assert;
import org.junit.Test;

public class UdemyReverseAstringTestCase {

    private UdemyReverseAstring obj = new UdemyReverseAstring();

    @Test
    public void AlphabetString(){
        var result = obj.revStr("olleh");
        Assert.assertEquals("hello",result);
    }
    //---
    @Test
    public void NumberString(){
        var result = obj.revStr("123");
        Assert.assertEquals("321",result);
    }
    @Test
    public void SpaceString(){
        var result = obj.revStr("321 olleH");
        Assert.assertEquals("Hello 123",result);
    }
}
