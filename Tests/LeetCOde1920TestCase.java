import org.junit.Assert;
import org.junit.Test;

public class LeetCOde1920TestCase {

    private LeetCode1920 obj = new LeetCode1920();

//--------------
    @Test
    public void Permutation1() {

        int[] arr = {0, 2, 1, 5, 3, 4};

        int[] ans = {0,1,2,4,5,3};

        var result = obj.buildArray(arr);

        Assert.assertArrayEquals(ans,result);

    }
//---------------
    @Test
    public void permutation2(){

        int[] arr = {5,0,1,2,3,4};

        int[] ans = {4,5,0,1,2,3};

        var result = obj.buildArray(arr);

        Assert.assertArrayEquals(ans,result);

    }


//--
}
