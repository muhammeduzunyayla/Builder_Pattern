public class OkumaFactory {
   public Okuma okuma(String ok){

       if(ok=="xlsx"){
           Okuma oku =new Xlsx();
           return oku;
           //teorik ve 2 kodlama

       }
       else{
           Okuma oku=new Ods();
           return oku;

       }
   }
}
