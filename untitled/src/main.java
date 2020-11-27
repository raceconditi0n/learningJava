public class main {
    public static void main(String[] args) {
        System.out.println(getDurationString(125,22));
        System.out.println(getDurationString(80000));
    }

    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds <=0) || (seconds >= 59)){
            return "Invalid Value";
        } else {
            int hours = minutes / 60;
            int remainderMinutes = minutes - (60 * hours);
            String totalTime = hours + "h " + remainderMinutes + "m " + seconds + "s.";
            return totalTime;
        }
    }

    public static String getDurationString(int seconds){
        if (seconds <=0){
            return "Invalid Value";
        } else {
            int minutes = seconds / 60;
            int remainderSeconds = seconds - (60 * minutes);
            String totalMinutesAndSeconds = getDurationString(minutes, remainderSeconds);
            return totalMinutesAndSeconds;
        }
    }



}




