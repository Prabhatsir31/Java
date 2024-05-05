class Lab {
  int a = 10;
  static int b = 20;

  public static void main(String args[]){
    Lab l1 = new Lab();
    Lab l2 = new Lab();
    System.out.println(l1.a);
    System.out.println(l1.b);
    l2.a = 100;
    l2.b = 200;
    System.out.println(l2.a);
    System.out.println(l2.b);
    Lab l3 = new Lab();
    System.out.println(new Lab().a);
    System.out.println(l3.b);
    System.out.println(Lab.a);
    Lab l4 = null;
    System.out.println(Lab.a);
    System.out.println(l4.a);
  }
}