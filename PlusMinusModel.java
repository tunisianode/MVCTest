public class PlusMinusModel {

    private int zahl;
    private int min;
    private int max;

    public PlusMinusModel(int min, int max) {
        this.zahl = min;
        this.min = min;
        this.max = max;


    }

    public int getZahl() {
        return this.zahl;
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


    public int increment(){
        if(zahl+1<=max){
            zahl++;
        }
        return zahl;
    }

    public int decrement()
    {
        if (zahl-1 >= min){
            zahl--;
        }
        return zahl;
    }
}
