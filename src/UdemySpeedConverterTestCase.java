import org.junit.Assert;
import org.junit.Test;

public class UdemySpeedConverterTestCase {

    private UdemySpeedConverter obj = new UdemySpeedConverter();

    @Test
    public void test1(){
        var result = obj.toMilesPerHour(1.5);
        Assert.assertEquals(1,result);
    }
    @Test
    public void test2(){
        var result = obj.toMilesPerHour(10.25);
        Assert.assertEquals(6,result);
    }

}
