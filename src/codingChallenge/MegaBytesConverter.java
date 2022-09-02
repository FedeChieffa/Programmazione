package codingChallenge;
//XX = KB   YY= MB  ZZ = KB
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    private static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid imput");
            return;
        }
        int YY= kiloBytes/1024;
        int ZZ= kiloBytes%1024;
        System.out.println(kiloBytes + " KB are "+ YY + " MB and "+ ZZ +" KB");
    }
}
