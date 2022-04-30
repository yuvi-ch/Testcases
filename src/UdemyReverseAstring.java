public class UdemyReverseAstring {

    public String revStr(String str){

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length()/2;i++){

            int front = i;
            int back = sb.length()-1-i;

            char fc = sb.charAt(front);
            char bc = sb.charAt(back);

            sb.setCharAt(front,bc);
            sb.setCharAt(back,fc);

        }

        return sb.toString();
    }

}
