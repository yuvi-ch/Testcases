import org.junit.Assert;
import org.junit.Test;

public class UdemySpeedConverterTestCase {

    private UdemySpeedConverter obj = new UdemySpeedConverter();

    @Test
    public void OnesAndTenths(){
        var result = obj.toMilesPerHour(1.5);
        Assert.assertEquals(1,result);
    }
    @Test
    public void TensAndHundredths(){
        var result = obj.toMilesPerHour(10.25);
        Assert.assertEquals(6,result);
    }

}
