class A{
  A(){
    System.out.println("A()");
  }
}
class B extends A{
  B(){
    System.out.println("B()");
  }
}
class CCISI{
  public static void main(String[] args) {
    B ob = new B();
  }
}
