import java.util.HashMap;
import java.util.Map;

public class Ciao {
    public static void main(String[] args) {
        //start coding my bru
        System.out.println("ciao");
        condizione(1999);
    }

    static HashMap<Integer, HashMap<String, Double>> ciao;

    public static CondizioneMetereologica condizione(int CAP){
        if(!ciao.containsKey(CAP))return null;
        for(Map.Entry<Integer, HashMap<String, Double>> entry : ciao.entrySet()){
            if(entry.getKey()==CAP){
                Map.Entry<String, Double> lista = (Map.Entry<String, Double>) entry.getValue();
                String cond = lista.getKey();
                Double temp = lista.getValue();
                return new CondizioneMetereologica(cond, temp);
            }
        }
        return null;
    }




}

class CondizioneMetereologica{
    String condizione;
    Double temp;

    public CondizioneMetereologica(String condizione, Double temp) {
        this.condizione = condizione;
        this.temp = temp;
    }

    public String getCondizione() {
        return condizione;
    }

    public Double getTemp() {
        return temp;
    }
}