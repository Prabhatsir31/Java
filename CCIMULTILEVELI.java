class A{
   A(){
    System.out.println("Show In Class A() Constructor");
  }
}

class B extends A{
   B(){
    System.out.println("Show In Class B() Constructor");
  }
}

class C extends B{
   C(){
    System.out.println("Show In Class C() Constructor");
  }
}
class CCIMULTILEVELI{
  public static void main(String[] args) {
    C ob = new C();
  }
}
