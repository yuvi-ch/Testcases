public class LeetCode9 { //allOK
    public boolean isPalindrome(int x) {

        boolean r=true;

        if(x<0)
            r=false;
        else{
            int rev=0;
            int num=x;

            while(x!=0)
            {
                rev=rev*10 +(x%10);
                x/=10;
            }

            if(rev!=num)
                r=false;

        }

        return r;

    }
}
