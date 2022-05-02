public class LeetCode7 {
    public int reverse(int x) {

        long sum = 0;

        int q = x;

        int r = x;

        while( q != 0 ){

            r = q % 10;

            sum *= 10;

            sum += r;

            q = q / 10;
        }

        if( sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;

        return (int)sum;
    }
}
