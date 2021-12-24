class TestBulp{
 public static void main(String []args){

 Bulp illum = new Bulp();
 System.out.println(illum.name);
 System.out.println(illum.voltage);
 System.out.println(illum.price);
 
 int res=illum.temperature();
 System.out.println(res);

 illum.illuminatingmaterial();
    }

}