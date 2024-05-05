class Employee{
   String ename;
   int eid;
     Employee(String name,int id){
       eid=id;
       ename=name;
     }
    void show(){
       System.out.println("Employee Id:"+eid);
       System.out.println("Employee Name:"+ename);
     }
  }

class MyLab{
  public static void main(String[] args) {
    Employee obj = new Employee("Saurabh" , 101);
             obj.show();
  }
}
