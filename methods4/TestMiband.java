class TestMiband{
 public static void main(String []args){
 
 Miband.bluetooth();
 
 float res=Miband.time();
  System.out.println(res);
 
 Miband mi=new Miband();
 short heart=mi.heartbeat();
  System.out.println(heart);

 Miband band=new Miband();
 int result=band.steps();
  System.out.println(result);
  
    }

}