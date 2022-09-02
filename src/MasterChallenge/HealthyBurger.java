package MasterChallenge;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name, healthyExtra2Name;
    private String meat;
    private double price;
    public HealthyBurger(String meat, double price){
        this.meat=meat;
        this.price=price;
    }

    public void addHealthyAddition1(String add, double price){
        if(add!=null && price>0){
            this.healthyExtra1Name=add;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ add+" THAT COST "+price+"€");
    }
    public void addHealthyAddition2(String add, double price){
        if(add!=null && price>0){
            this.healthyExtra2Name=add;
            this.price+=price;
        }
        System.out.println("YOU HAVE ADDED: "+ add+" THAT COST "+price+"€");
    }

    @Override
    public double itemizeHamburger(){
        System.out.println("THE FINAL PRICE OF YOUR HEALTYBURGER IS: "+ this.price+"€");
        return this.price;
    }

}
