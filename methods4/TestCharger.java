class TestCharger{
 public static void main(String []args){
 
 Charger.type();
 
 float res= Charger.current();
   System.out.println(res);

 Charger ch=new Charger();
 byte result= ch.voltage();
  System.out.println(result);

 Charger bolt=new Charger();
 short slt=bolt.power();
  System.out.println(slt); 
    }

}