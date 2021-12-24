class TestMotor{
 public static void main(String []args){
 
 Motor.type();
 
 String res=Motor.motortype();
  System.out.println(res);
 
 Motor moto=new Motor();
 int result = moto.voltage();
  System.out.println(result);
 
 Motor resto=new Motor();
 float slt = resto.current();
  System.out.println(slt);
 
   }

}