public class KareIslemleri implements Islemler<Kare>  {
    @Override
    public double alanHesapla(Kare t) {

        double alan= t.getKenar()*t.getKenar();

        return alan;
    }

    @Override
    public double cevreHesapla(Kare t) {

        return 4*t.getKenar();
    }
}
