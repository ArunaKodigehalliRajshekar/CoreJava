class TestOcean{
  public static void main(String []args){
  
  Ocean sea = new Ocean(args);
   
  Ocean slt=new Ocean("indianocean");
  String res=slt.display();
   System.out.println(res);
  
    
    float hal=55.6f;
     int ar =26700;
     double lat=118.678d;
     double lon=210.682d;
  
  Ocean ght=new Ocean("indianocean","northeast",hal,ar,lat,lon);
  String hht=ght.display();
   System.out.println(hht);
 
       }


 }