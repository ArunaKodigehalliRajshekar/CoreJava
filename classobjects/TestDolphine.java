class TestDolphine{
 public static void main(String []args){
  Dolphine doll= new Dolphine();
  System.out.println(doll.breed);
  System.out.println(doll.weight);
  System.out.println(doll.species);
  
   doll.grow();
  int speed=doll.swimming();
  System.out.println(speed);

  doll.communication();
     }

}