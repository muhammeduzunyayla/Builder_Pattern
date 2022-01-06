public class Main {

    public static void main(String[] args) {
        System.out.println("-----ASUS LAPTOP----");
        Factory f = new Factory(new ASUSFactory());
        f.Birlestir();
        System.out.println("-----HP LAPTOP----");
        f = new Factory(new HPFactory());
        f.Birlestir();

    }
}
