package codingChallenge;

public class Point {

    int x;
    int y;
    // write your code here
    public Point(int x, int y){
        this.x=x; this.y=y;
    }
    public int getX(){ return this.x; }
    public int getY(){ return this.y; }
    public void setX(int k){ this.x=k; }
    public void setY(int k){ this.y=k; }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(Point p){
        return distance(p.x, p.y);
    }

    public double distance(int k, int z){
        return Math.sqrt(((k-this.x)*(k-this.x))+(z-this.y)*(z-this.y));
    }

    public static void main(String[] args)  {
        Point p = new Point(6,5);
        Point p2= new Point(9,4);
        System.out.println(p.distance());
        System.out.println(p.distance(2,2));
        System.out.println(p.distance(p2));
    }
}