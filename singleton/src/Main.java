class Singleton{
    private static Singleton instance=null; //nesnenin daha önce oluşturulmadığını anlayabilmemiz için statik instance özelliği tanımlıyoruz

    private Singleton(){
        System.out.println("Singleton olusturuldu");
       //oluşturulma sırasında kullanacağımız kodlar
    } //bu private yada protected constructor bize dışarıdan istediğimiz kadar new ile obje üretemememizi sağlar


    //dışarıdan sınıfımızı çağıracağımız metot
    // synchronized anahtar kelimemiz ile metodun aynı anda çalışmasını engelledik.
    public static synchronized Singleton getInstance(){ //clasa özgü bir metot

        // eğer daha önce örnek oluşturulmamış ise sınıfın tek örneğini oluştur
        if(instance==null){
            instance=new Singleton(); // şart sağlanırsa obje oluşturuyoruz
            return instance; //ve döndürüyoruz
        }
        else{
    return instance; //zaten varsa null değilse döndürüyoruz
        }
    }
}
public class Main {

    public static void main(String[] args) {
	Singleton s = Singleton.getInstance();
    }
}
