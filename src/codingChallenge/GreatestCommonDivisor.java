package codingChallenge;

public class GreatestCommonDivisor {
    public static double getGreatestCommonDivisor(int x, int y){
        if(y==0)return x;
        int q, r=0;
        if(x>0 && x>y){
            q=x/y;
            r=x%y;
            if(r>y) return -1; //è una condizione che va rispettata secondo il teorema di euclide;
            }
        return getGreatestCommonDivisor(y, r);
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(126 , 147));
    }
/*
    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(Punto a){
        this.x = a.getX();
        this.y = a.getY();
    }
  */
}
