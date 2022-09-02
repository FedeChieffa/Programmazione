package codingChallenge;

public class SecondAndMinuteChallenge {
    private static String getDurationString(long minute, long second){
        long XX, YY;
        if(minute<0 || second<0 || second >59) return "INVALID INPUT";
        XX=minute/60;
        YY=minute%60;
        return "The total duration is of "+XX+"h"+YY+"m"+second+"s";
        }
    private static String getDurationString(long second){
        if(second<0)return "INVALID INPUT";
        long minute = second/60;
        long second2=second%60;
        return getDurationString(minute, second2);
    }

    public static void main(String[] args) {
        System.out.println("CIAO");
        System.out.println(getDurationString(180, 40));
        System.out.println(getDurationString(3601));
    }


}
