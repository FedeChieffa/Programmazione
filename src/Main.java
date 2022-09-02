import java.util.Random;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        //start coding my bruh
        Random ran = new Random();

        int[] ciao = {0 , 1, 2, 3, 4};
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);
        System.out.println(ciao[ran.nextInt(5)]);

        String birthDate = "9/03/1999";

        StringTokenizer st = new StringTokenizer(birthDate, "/");
        if(st==null)return;
        Integer day= Integer.parseInt(st.nextToken());
        if(day==null) throw new IllegalArgumentException("Hai meno di 18 anni");
        Integer month =  Integer.parseInt(st.nextToken());
        if(month==null) throw new IllegalArgumentException("Hai meno di 18 anni");
        Integer year =  Integer.parseInt(st.nextToken());
        if(year==null) throw new IllegalArgumentException("Hai meno di 18 anni");
        if(year>0 && year<2004) throw new IllegalArgumentException("Hai meno di 18 anni");
        if(month==2 || day<0 || day >29) throw new IllegalArgumentException("Giorno non corretto");
        if(month==1 || month==3 || month==5 || month == 7 || month == 8 || month == 10
                || month==12 && day<0 || day > 31) throw new IllegalArgumentException("Giorno non corretto");
        if(month==4 || month== 6 || month==9 || month==11 || day<0 || day > 30) throw new IllegalArgumentException("Giorno non corretto");
    }

}
