public class Main {

    public static void main(String[] args) {


        Factory fb=new Factory();
        ICevreHesapla hesapla=fb.HesaplayiciDondur("Paralelkenar");
        int cevre =hesapla.Hesapla(5,6);
        System.out.println("Cevre = "+cevre);

    }
}
