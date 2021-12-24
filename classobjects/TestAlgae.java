class TestAlgae{
 public static void main(String []args){
 Algae ag=new Algae();
 System.out.println(ag.kingdom);
  System.out.println(ag.size);
   System.out.println(ag.colour);

  ag.freshwater();
 
 String res=ag.photosynthesis();
  System.out.println(res);
  ag.fooddiet();
   }

}