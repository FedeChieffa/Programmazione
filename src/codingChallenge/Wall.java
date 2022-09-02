package codingChallenge;

public class Wall {
    double wall, width;

    public Wall(){
        this(0, 0);
    }

    public Wall(double wall, double width){
        if(wall<0 || width<0){
            setWall(wall);
            setWidth(width);
        }
        this.wall = wall;
        this.width = width;
    }
    public void setWidth(double width) {
        if(width<0)width=0;
        this.width = width;
    }

    public void setWall(double wall) {
        if(wall<0)wall=0;
        this.wall = wall;
    }

    public double getWall() {
        return wall;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.getWidth()*this.getWall();
    }

    public static void main(String[] args) {
        Wall w = new Wall(40, 50);
        System.out.println(w.getArea());
        w.setWall(-1);
        System.out.println(w.getArea());
    }
}
