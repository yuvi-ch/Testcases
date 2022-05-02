public class LeetCode66 {
    public int[] plusOne(int[] digits) {


        for(int currentIndex = digits.length - 1; currentIndex >= 0; currentIndex--) {


            if(digits[currentIndex] < 9) {
                digits[currentIndex]++;
                return digits;
            }


            digits[currentIndex] = 0;
        }


        int[] newDigits = new int [digits.length + 1];


        newDigits[0] = 1;

        return newDigits;


    }
}
