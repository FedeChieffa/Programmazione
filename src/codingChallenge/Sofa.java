package codingChallenge;

public class Sofa {
    int heigth, widht;
    String color, material;

    public Sofa(int heigth, int widht, String color, String material) {
        this.heigth = heigth;
        this.widht = widht;
        this.color = color;
        this.material = material;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getMaterial() {
        return material;
    }
}
