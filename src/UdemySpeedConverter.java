public class UdemySpeedConverter {

    public static long toMilesPerHour (double kmph){
        long x = Math.round(kmph/1.609);
        if(kmph<0) {
            return -1;
        }
        return x;
    }

}
