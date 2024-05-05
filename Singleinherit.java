class A{
  void show(){
    System.out.println("Show In Class A");
  }
}
class B extends A{
   void display(){
     System.out.println("Display In Class B");
   }
}
class Singleinherit {
  public static void main(String[] args) {
    A ob1 = new A();
      ob1.show();
      //ob1.display();
    B ob2 = new B();
      ob2.display();
      ob2.show();
  }
}
