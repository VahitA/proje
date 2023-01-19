package geometriproject;

public class Cember extends Sekil {
    private double yaricap;

    public Cember(double yaricap) {

        this.yaricap = yaricap;
    }

    @Override
    public double Cevre() {
        int cevre = (int) (2 * 3.14 * yaricap);
        return cevre;
    }

    @Override
    public String toString() {
        return "Cember [yaricap=" + yaricap + ", Cevre()=" + Cevre() + "]";
    }


}
