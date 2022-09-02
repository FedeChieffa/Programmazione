package codingChallenge;

import static java.lang.Math.round;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.43);
        printConversion(75.144);

    }
    private static int toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<=0) return -1;
        double coeff = 0.621371d;
        return (int)round(kilometersPerHour * coeff);
    }

    private static void printConversion(double kilometersPerHour){
        if(toMilesPerHour(kilometersPerHour)<0){
            System.out.println("The imput is wrong or is a negative number");
            return;
        }

        System.out.println("The amount of "+ kilometersPerHour + "km/h are "+ toMilesPerHour(kilometersPerHour)+ " mi/h");
    }
}
