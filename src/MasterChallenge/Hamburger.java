package MasterChallenge;

public class Hamburger {
    String name, meat, breadRollType;
    String addition1name, addition2name,addition3name, addition4name;
    double addition1price, addition2price,addition3price, addition4price;

    double price;

    public Hamburger() {
        System.out.println("Default ");
    }

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String aggiunta, double price){
        if(aggiunta!=null){
            this.addition1name=aggiunta;
            this.addition1price=price;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ aggiunta+" THAT COST "+price+"€");
    }
    public void addHamburgerAddition2(String aggiunta, double price){
        if(aggiunta!=null){
            this.addition2name=aggiunta;
            this.addition2price=price;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ aggiunta+" THAT COST "+price+"€");
    }
    public void addHamburgerAddition3(String aggiunta, double price){
        if(aggiunta!=null){
            this.addition3name=aggiunta;
            this.addition3price=price;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ aggiunta+" THAT COST "+price+"€");
    }
    public void addHamburgerAddition4(String aggiunta, double price){
        if(aggiunta!=null){
            this.addition4name=aggiunta;
            this.addition4price=price;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ aggiunta+" THAT COST "+price+"€");
    }

    public double itemizeHamburger(){
        System.out.println("THE FINAL PRICE OF YOUR HAMBURGER IS: "+ this.price+"€");
        return this.price;
    }
}
