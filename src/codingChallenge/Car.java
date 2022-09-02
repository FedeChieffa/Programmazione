package codingChallenge;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;
    public int fuelLevel;

    public Car(){}

    public Car(String name, int cylinders, int wheels, int fuelLevel) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.fuelLevel=fuelLevel;
        this.engine = true;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    private void startEngine(){
        if(fuelLevel>0){
            System.out.println("Engine starting...");
            System.out.println("Engine started");
            return;
        }
    }

    public String accellerate(){
        return "STIAMO ACCELLERANDO";
    }

    public void brake(){
        System.out.println("STIAMO RALLENTANDO");
    }
}

class StationWagon extends Car{
    public StationWagon(){
        super("Station wagon", 6, 4, 100);
    }
    @Override
    public String accellerate(){
        return "Sono una station wagon e sto accellerando";
    }
}

class Ferrari extends Car{
    public Ferrari(){
        super("Ferrari", 12, 4, 250);
    }

    @Override
    public String accellerate(){
        return "Sono una ferrari e sto accellerando molto";
    }
}

class Cricchetto extends Car{
    public Cricchetto(){
        super("Cricchetto", 2, 4, 70);
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("WE ZIO");
        //start coding my bruh
        Ferrari f = new Ferrari();
        System.out.println(f.accellerate());

        Cricchetto c = new Cricchetto();
        System.out.println(c.accellerate());

        StationWagon s = new StationWagon();
        System.out.println(s.accellerate());
    }

}