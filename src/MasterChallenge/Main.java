package MasterChallenge;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //start coding my bruh
        Hamburger hamburger = new Hamburger("Basic", "Sausage","White" , 3.56);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

        Hamburger albe = new Hamburger("Porchetta", "Porchetta nguranta", "White", 2.00);
        albe.addHamburgerAddition1("Cancer", 1.00);
        albe.addHamburgerAddition2("Pepperoni", 2.00);
        albe.addHamburgerAddition3("Ketchup", 0.60);
        albe.itemizeHamburger();

        Scanner cs = new Scanner(System.in);
        System.out.println("INSERIRE LA CARTA...");
        String carta= cs.nextLine();
        if(carta!=null){
            System.out.println("CARTA INSERITA; PAGAMENTO EFFETTUATO");
        } else System.out.println("CARTA INSERITA; PAGAMENTO NON ANDATO A BUON FINE");
    }
}
