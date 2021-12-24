class Fish{
  String name;
  String type;
  float length;
  byte weight;
  String colour;
  String[] args=new String[8];
  
   Fish(String []args){
  System.out.println("different types of fishes like");
  for(int i=0;i<args.length;i++){
  System.out.println(args[i]);
   }
 
 }

  Fish(String n){
  name=n;
  }

 Fish(String n,String t,float l,byte w,String c){
  this(n);
  this.type=t;
  this.length=l;
  this.weight=w;
  this.colour=c;
  }

 String showfish(){
 String ddl=name +"\t" +type +"\t" +length +"\t" +weight +"\t" +colour;
  return ddl;
    }

}
  