package progetto_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    Player gamer;
    ArrayList<String> Lyricist;
    ArrayList<Character> Word;
    int error, totalError, punteggioTot;
    boolean stillGoing;             // TRUE= The game is still going ----- FALSE= the game is terminated
    Scanner sc = new Scanner(System.in);
    public Hangman(Player gamer, File f) throws IOException {
        this.gamer = gamer;
        this.error =0;
        this.totalError =0;
        this.punteggioTot=0;
        this.stillGoing = true;
        this.Lyricist = new ArrayList<>(popolateArrayChoice(f));
        this.Word= new ArrayList<>();
    }
    private ArrayList<String> popolateArrayChoice(File f) throws IOException {
        if(!f.exists()) throw new IOException("The file is unavaiable or inexistent");
        ArrayList<String> singleWord = new ArrayList<>();
        Scanner scan = new Scanner(new BufferedReader(new FileReader(f)));
        while(scan.hasNextLine()){
            String Word = scan.nextLine();
            singleWord.add(Word);
        }
        scan.close();
        return singleWord;
    }
    private boolean game(){
        if(!this.stillGoing) return false;
        if(Lyricist.size()==0){
            System.out.println("IL GIOCO é TERMINATO, COMPLIMENTI A "
                    + gamer.getName() + " PER LA VITTORIA, HAI TOTALIZZATO UN PUNTEGGIO DI "+ gamer.getPoint());
            //this.stillGoing = false;
            return false;
        }else if(totalError ==10){
            System.out.println("PURTROPPO IL GIOCATORE "
                    + gamer.getName() + " HA FINITO LE VITE A DISPOSIZIONE");
            //this.stillGoing = false;
            return false;
        } else if(error == 5){
            System.out.println("PUTROPPO IL GIOCATORE "
                    + gamer.getName() + " HA FINITO LE VITE A DISPOSIZIONE PER LA Word SEGUENTE"+
                    " OVVERO: "+ Word.toString());
            //this.stillGoing = false;
            return false;
        }
        return true;
    }
    private String print(ArrayList<Character> sol) {
        return sol.toString();
    }
    public void match() throws InterruptedException {
        error =0;

        String temp = takeTheWord();

        ArrayList<Character> sol = new ArrayList<>();
        //System.out.println(temp.length());

        for(int i=0; i<temp.length();i++) {  sol.add('_');  }  //IMPOSTO L'ARRAY SOLUZIONE ""VUOTO""

        int character = 0;

        System.out.println(temp);  //PER  NON PERDERE TEMPO A TROVARE LA SOLUZIONE
        
        //////////
        System.out.println("THE GAME IS STARTING");
        System.out.println("NEW WORD SELECTION STARTED....");
        Thread.sleep(1000);
        System.out.println("THE WORD HAS BEEN CHOICE");
        System.out.println(sol);
        //////////

        while(game()){
            if (character == temp.length()) break;
            //System.out.println(" " + character+ " " + temp.length());
            System.out.println("______________________________");
            System.out.println("INSERT THE CHARACTER [in this moment you have " + error
                    + " for the current word and you have " + totalError + " total error]");

            String s = sc.nextLine().toUpperCase();
            Character c = s.charAt(0);
            if (sol.contains(c)) {
                error++;
                totalError++;
                System.out.println("THIS LETTER IS ALREDY BEEN HCHOSEN,PAY MORE ATTENTION!");
                System.out.println("Actual word: " + (sol));
            } else if (Word.contains(c)) {
                character += popolateTheSolution(temp, sol, c);
                System.out.println("YOU GUESSED ONE OR MORE CHARACTER, YOU ARE DOING WELL!!!");
                System.out.println("Actual word: " + (sol));
            } else{ // if (!Word.contains(c))
                error++;
                totalError++;
                System.out.println("YOU DID A MISTAKE, THINK BETTER NEXT TIME");
                System.out.println("Actual word: " + print(sol));
            }

        }
        //ROAD TO THE NEXT WORD TO GUESS
        gamer.point++;
        System.out.println("ROUND TERMINATED");
        System.out.println("Do you wish to continue? Y/N");
        String scelta = sc.nextLine().toUpperCase();
        if(scelta.equals("Y") || scelta.equals("YES")){
            match();
        }
        else{
            System.out.println("MATCH TERMINATED, SEE YOU SOON"); System.exit(0);
        }
    }

    private int popolateTheSolution(String temp, ArrayList<Character> sol, Character l) {
        System.out.println(sol.toString());
        int occur=0;                            //how many occurences
        for(int i=0; i< Word.size();i++){
            if(temp.charAt(i)==l){
                sol.set(i, l);
                occur++;
            }
        }
        return occur;
    }

    private String takeTheWord() {
        this.Word.clear();
        Random r = new Random();
        int i = r.nextInt(Lyricist.size()-1);
        String word = Lyricist.get(i);
        Lyricist.remove(i);
        for(int k=0; k<=word.length()-1;k++)
            this.Word.add(word.charAt(k));
        return word;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Player fede = new Player("Fede");
        File f = new File("C:\\Users\\Federico Chieffa\\Desktop\\Lyricist.txt"); //CHANGE IT BEFORE START THE MAIN
        Hangman game = new Hangman(fede, f);
        System.out.println();
        game.match();
    }
}
