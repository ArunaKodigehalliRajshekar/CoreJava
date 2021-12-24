class TestFish{
 public static void main(String []args){
 
  Fish mf = new Fish(args);

  Fish meen = new Fish("bangade");
  String res=meen.showfish();
  System.out.println(res);
 
    float len=2.65f;
    byte wei=8; 

  Fish neer = new Fish("catla","freshwater",len,wei,"cementblack");
  String result = neer.showfish();
  System.out.println(result);
 
      }

  }