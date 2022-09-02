package codingChallenge;

public class AreaCalculator {
    public static void main(String[] args) {
        //start coding my bruh
        System.out.println(areaCalculator(3));
        System.out.println(areaCalculator(4, 8));

    }
    private static double areaCalculator(double radius){
        if(radius<0)return -1.0d;
        return areaCalculator(Math.PI*radius, radius);
    }

    private static double areaCalculator(double x, double y){
        if(x<=0 || y<=0) return -1.0d;
        return x*y;
    }
}
