public class Daire {

    private final double PI=3.14;

    private double yaricap;

    public Daire(){

    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getPI() {
        return PI;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "PI=" + PI +
                ", yaricap=" + yaricap +
                '}';
    }
}
