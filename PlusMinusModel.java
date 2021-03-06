import java.util.ArrayList;

public class PlusMinusModel {

    private int zahl;
    private int min;
    private int max;

    private ArrayList<PlusMinusListener> listeners;

    public PlusMinusModel(int min, int max) {
        this.zahl = min;
        this.min = min;
        this.max = max;

        this.listeners = new ArrayList<PlusMinusListener>();

    }


    public void addListener(PlusMinusListener l){
        this.listeners.add(l);
    }

    public void removeListener(PlusMinusListener l)
    {
        this.listeners.remove(l);
    }
    public int getZahl() {
        return this.zahl;
    }

    private void fireModelChanged(){
        for (PlusMinusListener l:listeners){
            l.valueChanged(this);
        }
    }
    public String getZahlToString(){
        return Integer.toString(this.getZahl());
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    public void increment(){
        if(zahl+1<=max){
            zahl++;
            fireModelChanged();

        }
    }

    public void decrement()
    {
        if (zahl-1 >= min){
            zahl--;
            fireModelChanged();

        }
    }


}
