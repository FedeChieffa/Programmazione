package codingChallenge;

public class PrintEqual {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);


        //System.out.println(ciao2);
    }
    public static void printEqual(int x1, int x2, int x3){
        if(x1<0 || x2<0 || x3<0) System.out.println("INVALID VALUE");
        else if((x1==x2) && (x1==x3)) System.out.println("ALL OF THEM ARE EQUAL");
        else if((x1!=x2) && (x2!=x3)) System.out.println("ALL OF THEM AREN'T EQUAL");
        else
            System.out.println("NEITHER ALL ARE EQUAL OR DIFFERENT");
    }


}
