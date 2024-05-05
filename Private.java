//Access modifire 
class A {
   private void show() {
        System.out.println("Private Method called:");
    }
    void display(){
        A ob=new A();
          ob.show();
    }
}

class Private {
    public static void main(String args[]) {
       A ob = new A();
        ob.display();
    }
}