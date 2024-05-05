class P{
  int id;
  String name;

  void setRecord(int id,String name){
    this.id=id;
    this.name=name;
  }
  void getRecord(){
    System.out.println(this.id+" "+this.name);
  }
}

class T extends P{
  int sal;
  void setSal(int sal){
    this.sal=sal;
  }
  void getSal(){
    System.out.println("Salary "+sal);
  }
}

class S extends P{
  int fees;
   void setFees(int fees){
     this.fees=fees;
   }
   void getFees(){
     System.out.println("Fees "+fees);
   }
}

class Record2{
 public static void main(String[] args) {
   S st = new S();
     st.setRecord(101,"Saurabh");
     st.getRecord();
     st.setFees(5000);
     st.getFees();

   T t = new T();
     t.setRecord(1002,"Jack");
     t.getRecord();
     t.setSal(50000);
     t.getSal();
 }
}
