class Motor{
 static void type(){
  System.out.println("Motors are of different types");
  }

 static String motortype(){
 String name = "Dcmotor";
  System.out.println("name of the motor is");
  return name;
  }

 int voltage() {
 int motorvoltage= 12 ;
  System.out.println("Dcmotor working with voltage of");
  return motorvoltage;
  }

 float current() {
 float motorcurrent = 1.2f;
  System.out.println("Dcmotor works with current of");
  return motorcurrent;
   }

}