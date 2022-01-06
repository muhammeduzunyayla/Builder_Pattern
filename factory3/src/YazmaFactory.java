public class YazmaFactory {
    public Yazma yazma(String yz){

        if(yz=="xml"){
            Yazma yaz =new Xml();
            return yaz;
            //teorik ve 2 kodlama

        }
        else{
            Yazma yaz=new Json();
            return yaz;

        }
    }
}
