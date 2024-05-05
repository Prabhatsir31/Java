class Lab2{
int a;
 void setA(int x){
    a=x;
 }
 void getA(){
   System.out.println(a);
 }
 public static void main(String args[]){
    Lab2 obj1 = new Lab2();
    obj1.setA(10);
    obj1.getA();
    Lab2 obj2 = new Lab2();
    obj2.setA(100);
    obj2.getA();
  }
}
