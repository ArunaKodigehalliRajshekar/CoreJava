class Charger{
 static void type(){
  System.out.println("charger of different types like smallpin,ctype,flat, etc");
   }
 
 static float current (){
 float chargercurrent= 1.2f;
  System.out.println("charger having current output in amps");
  return  chargercurrent;
  }

 byte voltage(){
 byte chargervoltage= 10;
  System.out.println("output voltage of charges in volts");
  return chargervoltage;
   }

 short power (){
 short chargerpower= 45;
  System.out.println("power of charger are defined in wats");
  return  chargerpower;
   }


}