public class Factory {
    
    public ICevreHesapla HesaplayiciDondur(String st){

        if (st=="Dikdörtgen")
        {
            ICevreHesapla nesne =new Dikdörtgen();
            return nesne;
        }
        else {

            ICevreHesapla nesne =new Paralelkenar();
            return nesne;
        }

    }
}
