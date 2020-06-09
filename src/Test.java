public class Test {

    public static void main(String[] args) {





        Kare kare=new Kare(15);
        Daire daire=new Daire(25);

        hesapla(kare);
        hesapla(daire);
        


    }

    public static <T> void hesapla(T t) {
        System.out.println(t);
    }
}
