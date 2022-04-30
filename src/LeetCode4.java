import java.util.Arrays;

public class LeetCode4 {
    //Median of two sorted arrays//

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int l=n1+n2;

        int[] nums3 = new int[l];


        for(int i=0;i<n1;i++){

            nums3[i]=nums1[i];

        }


        for(int i=0;i<n2;i++){

            nums3[n1+i]=nums2[i];

        }

        Arrays.sort(nums3);

        double median=0.0;

        if(l%2==0){
            int m = nums3[l/2] + nums3[(l/2)-1];
            median = ((double)m)/2;
        }else{

            median = (double)nums3[l/2];

        }


        return median;
    }

}
