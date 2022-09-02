package MasterChallenge;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super();
        this.price=19.10d;
        System.out.println("");
    }

    @Override
    public void addHamburgerAddition1(String agg, double price){
        System.out.println("Trying to add "+ agg + " to your DeluxBurger for the price of"+
                price+"€");
        System.out.println("You shall not add nothing, we are sorry");
    }
    @Override
    public void addHamburgerAddition2(String agg, double price){
        System.out.println("Trying to add "+ agg + " to your DeluxBurger for the price of"+
                price+"€");
        System.out.println("You shall not add nothing, we are sorry");
    }
    @Override
    public void addHamburgerAddition3(String agg, double price){
        System.out.println("Trying to add "+ agg + " to your DeluxBurger for the price of"+
                price+"€");
        System.out.println("You shall not add nothing, we are sorry");
    }
    @Override
    public void addHamburgerAddition4(String agg, double price){
        System.out.println("Trying to add "+ agg + " to your DeluxBurger for the price of"+
                price+"€");
        System.out.println("You shall not add nothing, we are sorry");
    }
    @Override
    public double itemizeHamburger(){
        System.out.println("You selected DELUXBURGER with a drink and chips for the price of "+
                this.price+"€");
        return this.price;
    }
}
