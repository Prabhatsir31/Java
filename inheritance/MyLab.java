class Parent
{
  void display(){
      System.out.println("display() in class Parent");
    }
}

class Child extends Parent{
    void show(){
       System.out.println("Show() in class Child");
    }
}
class MyLab{
 public static void main(String args[]){
    Child c = new Child();
                c.show();
                c.display();
   Parent p = new Parent();
                  p.display(); 
              //error   p.show(); variable p of type Parent
  }
}