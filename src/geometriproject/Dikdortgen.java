package geometriproject;

public class Dikdortgen extends Sekil {
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {///CONS PL�

        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double Cevre() {

        return 2 * (this.kisaKenar + this.uzunKenar);
    }

    @Override
    public double Alan() {

        return this.kisaKenar * this.uzunKenar;
    }

    @Override
    public String toString() {
        return "Dikdortgen [Cevre()=" + Cevre() + ", Alan()=" + Alan() + "]";
    }


}
