import org.junit.Assert;
import org.junit.Test;

public class UdemyMBconverterTestCase {

    private UdemyMBconverter obj = new UdemyMBconverter();

    @Test
    public void RoundedNum(){
        var result = obj.printMBandKB(4000);
        Assert.assertEquals(3,result);
    }
//---
    @Test
    public void LargeNum(){
        var result = obj.printMBandKB(59980);
        Assert.assertEquals(58,result);
    }
//---
    @Test
    public void NegativeNum(){
        var result = obj.printMBandKB(-77676);
        Assert.assertEquals(-1,result);
    }


//---
}
