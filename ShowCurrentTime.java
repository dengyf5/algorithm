public class ShowCurrentTime{
    public static void main(String[] args){
                // total Milliseconds
                long totalMillis = System.currentTimeMillis();
                //total seconds
                long totalSeconds = totalMillis / 1000, seconds = totalSeconds % 60;
                //total minutes
                long totalMinutes = totalSeconds / 60, minutes = totalMinutes % 60;
                //total hours
                long totalHours = totalMinutes / 60, hours = totalHours % 24;
                //print time
                System.out.printf("CurrentTime is %2d:%2d:%2d",hours,minutes,seconds);//输出格林时间
    }
}