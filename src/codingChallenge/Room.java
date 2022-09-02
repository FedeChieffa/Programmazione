package codingChallenge;


public class Room {
    Windows win1, win2, win3;
    Door door;
    Sofa sofa;
    Table table;

    public Room(Windows win1, Windows win2, Windows win3, Door door, Sofa sofa, Table table) {
        this.win1 = win1;
        this.win2 = win2;
        this.win3 = win3;
        this.door = door;
        this.sofa = sofa;
        this.table = table;
    }
    public static void main(String[] args) {
        //start coding my bruh
        Sofa s = new Sofa(100, 200,  "Brown", "leather");
        Door d = new Door(280, 120, "Black");
        Windows w1 = new Windows(60, 80);
        Windows w2 = new Windows(90, 100);
        Windows w3 = new Windows(60, 80);
        Table t = new Table(140, 200, 4, "Grey", "Wood and marble");

        Room r = new Room(w1, w2, w3, d, s, t);
        stampa(r);
    }

    public static void stampa(Room r){
        System.out.println( "è stata creata una stanza con all'interno i seguenti elementi"+
                r.win1.toString()+" "+ r.win2.toString() +" "+ r.win3.toString()+
                " "+ r.sofa.toString()+ " " + r.door.toString() + " "+ r.table.toString());
    }

    public Windows getWin1() {
        return win1;
    }

    private void setWin1(Windows win1) {
        this.win1 = win1;
    }

    public Windows getWin2() {
        return win2;
    }

    private void setWin2(Windows win2) {
        this.win2 = win2;
    }

    public Windows getWin3() {
        return win3;
    }

    private void setWin3(Windows win3) {
        this.win3 = win3;
    }

    public Door getDoor() {
        return door;
    }

    private void setDoor(Door door) {
        this.door = door;
    }

    public Sofa getSofa() {
        return sofa;
    }

    private void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Table getTable() {
        return table;
    }

    private void setTable(Table table) {
        this.table = table;
    }

}
