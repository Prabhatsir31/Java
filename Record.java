//In here there was problem same no of line copid in diffent name of classes
class S{
  int id;
  String name;
void setRecord(int id,String name){
    this.id=id;
    this.name=name;
  }
void getRecord(){
    System.out.println(id+" "+name);
  }
}
class T{
  int id;
  String name;
void setRecord(int id,String name){
    this.id=id;
    this.name=name;
  }
void getRecord(){
    System.out.println(id+" "+name);
  }
}
class Record{
  public static void main(String[] args) {
    S st = new S();
      st.setRecord(101,"Jack");
      st.getRecord();

    T t = new T();
       t.setRecord(1001,"Saurabh");
       t.getRecord();
  }
}
