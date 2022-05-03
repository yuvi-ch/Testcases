import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode4TestCase {

    private LeetCode4 obj = new LeetCode4();

    @Test
    public void oddTest() {
        int nums1[] = {1, 2};
        int numz2[] = {3};
        int r = (int) obj.findMedianSortedArrays(nums1, numz2);
        var result=r;
    assertEquals(2,result);
    }
//---
@Test
public void EvenTest() {
    int nums1[] = {1, 2};
    int numz2[] = {3,4};
    int r = (int) obj.findMedianSortedArrays(nums1, numz2);
    var result=r;
    assertEquals(2,result);
}

}

