class A{
   int x,y,z;
     void SetVal(int a,int b){
        x=a;
        y=b;
     }
      int SumVal(){
       z=x+y;
       return(z);
     }
}
class Method {
 public static void main(String args[]) {
          A ob = new A();
          ob.SetVal(10,20);
    int  t=ob.SumVal();
        System.out.println("Your Ans is ="+t);
  }
}
