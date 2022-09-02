package progetto_1;

public class Player {
    String name;
    int point;

    public Player(String nome) {
        this.name = nome;
        this.point =0;
    }

    public String getName() { return name; }

    public int getPoint() { return point; }
}
