class TestAnimal{
 public static void main(String []args){
 
 Animal ani= new Animal();
 System.out.println(ani.name);
System.out.println(ani.weight);
 System.out.println(ani.bread);
 System.out.println(ani.height);
 System.out.println(ani.colour);
  
  ani.releaseco2();
 String res= ani.eatingfood();
  System.out.println(res);
 
 
   }

}