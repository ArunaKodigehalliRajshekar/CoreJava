class Ocean{
  String names;
  String location;
  float depth;
  int area;
  double latitude;
  double longitude;
  String[] args=new String[4];
 
  Ocean(String []args){
  System.out.println("names of different Ocans");
  for(int j=0;j<args.length;j++){
   System.out.println(args[j]);
     }

  }

  Ocean(String n){
  names=n;
  }

 Ocean(String n,String l,float d,int a,double la,double lo){
  this(n);
  this.location=l;
  this.depth=d;
   this.area=a;
  this.latitude=la;
  this.longitude=lo;
   } 
  
  String display(){
  String ttp=names +"\t" +location +"\t" +depth +"\t" +area +"\t" +latitude +"\t" +longitude ;
  
  return ttp;
    }

}