public class UdemyMBconverter {

    public static int printMBandKB(int KB){
        if(KB>0) {

            int YY = KB / 1024;
            int ZZ = KB % 1024;

            System.out.println(KB + " kb = " + YY + " MB and " + ZZ + " kb");
            System.out.println("Approx. MB Returned");
            return YY;

        }else{

            return -1;
            
        }
    }

}
