public class LeetCode69 {
    public int mySqrt(int x) {

        long ans = 1;

        while (ans * ans <= x) {
            ++ans;
        }

        return (int) ans - 1;


    }
}
