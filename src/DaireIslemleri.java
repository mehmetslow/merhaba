public class DaireIslemleri implements Islemler<Daire> {

    @Override
    public double alanHesapla(Daire t) {
        double alan=t.getPI()*t.getYaricap()*t.getYaricap();

        return alan;

    }

    @Override
    public double cevreHesapla(Daire t) {
        double cevre=2* t.getPI()*t.getYaricap();
        return cevre;

    }
}
