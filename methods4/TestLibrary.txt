class TestLibrary{
 public static void main(String []args){
 
  Library.use();
 
  String res= Library.bookname();
   System.out.println(res);

   Library book =new Library();
   int rate= book.price();
    System.out.println(rate);
 
  Library pages =new Library();
  short result= pages.noofpages();
   System.out.println(result);
  
    }

}