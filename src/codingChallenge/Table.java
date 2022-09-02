package codingChallenge;

public class Table {
    int heigth, widht, feet;
    String color, material;

    public Table(int heigth, int widht, int feet, String color, String material) {
        this.heigth = heigth;
        this.widht = widht;
        this.feet = feet;
        this.color = color;
        this.material = material;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidht() {
        return widht;
    }
}
