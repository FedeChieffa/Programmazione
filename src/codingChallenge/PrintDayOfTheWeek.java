package codingChallenge;

public class PrintDayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheWeek(6);
        printDayOfTheWeekIF(3);
        printDayOfTheWeekIF(1);
    }
    public static void printDayOfTheWeek(int day){
        if(day==-1) System.out.println("NOPE");
        switch (day){
            case 0:
                System.out.println("MONDAY");break;
            case 1:
                System.out.println("TUESDAY");break;
            case 2:
                System.out.println("WEDNESDAY");break;
            case 3:
                System.out.println("THURSDAY");break;
            case 4:
                System.out.println("FRIDAY");break;
            case 5:
                System.out.println("SATURDAY");break;
            default:
                System.out.println("SUNDAY");break;
        }
    }
    public static void printDayOfTheWeekIF(int day){
        if(day==-1) System.out.println("NOPE");
        else if(day==0) System.out.println("MONDAY");
        else if(day==1) System.out.println("TUESDAY");
        else if(day==2)System.out.println("WEDNESDAY");
        else if(day==3) System.out.println("THURSDAY");
        else if(day==4)System.out.println("FRIDAY");
        else if(day==5)System.out.println("SATURDAY");
        else System.out.println("SUNDAY");
    }
}
