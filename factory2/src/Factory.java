public class Factory {
public Compressing compressing(String cm) {
    if (cm == "Zip") {

        Compressing compressing = new Zip();
        return compressing;
    }
    else if (cm == "Rar") {
        Compressing compressing = new Rar();
        return compressing;
    }
    else if (cm == "Tar") {

        Compressing compressing = new Tar();
        return compressing;
    }
    else {
        System.out.println("Hatalı giriş yaptiniz");
        return null;
    }


}



}



