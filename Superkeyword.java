class A{
  int a=1000;
}
class B extends A{
  int a=100;
  void show(){
      int a=10;
      System.out.println(a);//10
      System.out.println(this.a);//100
      System.out.println(super.a);//1000
  }
}
class Superkeyword{
  public static void main(String[] args){
    B ob = new B();
      ob.show();
  }
}
