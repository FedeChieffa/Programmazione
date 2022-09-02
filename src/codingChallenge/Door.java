package codingChallenge;

public class Door {
    int heigth, widht;
    String color;

    public Door(int heigth, int widht, String color) {
        this.heigth = heigth;
        this.widht = widht;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getColor() {
        return color;
    }
}
