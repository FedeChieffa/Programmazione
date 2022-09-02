package codingChallenge;

public class Printer {
    int blackTonerLevel, totPagePrinted;
    boolean bothSide;

    public Printer(int blackTonerLevel, int totPagePrinted, boolean bothSide) {
        this.blackTonerLevel = blackTonerLevel;
        this.totPagePrinted = totPagePrinted;
        this.bothSide = bothSide;
    }

    public boolean fullTheInk(){
        if(blackTonerLevel==100){
            System.out.println("Riempimento non eseguito: è già pieno");
            return false;
        }
        blackTonerLevel=100;
        System.out.println("Riempimento completato");
        return true;
    }

    public void stampa(int x){
        if(blackTonerLevel>1||blackTonerLevel<101) {
            if (x < 1) {
                System.out.println("IL NUMERO DI COPIE è ERRATO!");
            }
            int i = 1;
            while (x != 0) {
                System.out.println("INIZIO STAMPA FOGLIO n°" + i);
                blackTonerLevel--;
                System.out.println("STAMPA EFFETTUTATA DEL FOGLIO n°" + i);
                i++; x--;
                totPagePrinted++;
            }
            System.out.println("Stampa terminata con successo");
        }
    }

    public int getBlackTonerLevel() {
        return blackTonerLevel;
    }

    public int getTotPagePrinted() {
        return totPagePrinted;
    }
}
