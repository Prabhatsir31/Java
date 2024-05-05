class String1{
        public static void main(String args[]){
          
          String str1 = new String("java");
          String str2 ="java";
          String str3 = new String("java");
          String str4 ="java";
          String str5="Python";      
          System.out.println(str1==str2); //false
          System.out.println(str2==str4); //True
          System.out.println(str2==str5); //false
          System.out.println(str2.equals(str5)); //false  
          System.out.println(str1.equals(str2)); //True 
          System.out.println(str4.equals(str5)); //false 
       } 
  
}