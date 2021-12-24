class Application{
 static void personaldetails(String[]args){
  System.out.println("in application we has to fill personaldetails");
  for(int i=0; i<args.length ; i++){
  System.out.println(args[i]);
     }
         
   }

    static void acadamics( ){
    System.out.println("personal details contains educational marks");
    
        }
      static void acadamics(byte marks ){ 
       System.out.println("personal details contains educational marks" +" " +marks);
           
    }
      static void acadamics(int fees , byte marks ){
      
    System.out.println("personal details contains educational marks and fees"  +" "  +marks  +" " +fees);
   
           }
      }   

