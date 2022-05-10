public class secondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(50, 45));
        System.out.println(getDurationString(2845L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long Minutes, long Seconds) {
        if ((Minutes < 0) || (Seconds < 0) || (Seconds > 59)) {
            return INVALID_VALUE_MESSAGE;

        }
        long Hours = Minutes / 60;
        long remainingMinutes = Minutes % 60;

        String hoursString = Hours + "h";
        if(Hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = Minutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = Seconds + "s";
        if(Seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + " ";
        }

        private static String getDurationString(long Seconds){
        if(Seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }
        long Minutes = Seconds / 60;
        long remainingSeconds = Seconds % 60;

        return getDurationString(Minutes, remainingSeconds);
        }
    }


