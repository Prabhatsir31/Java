class person{
    int id;
    String name, course, city;

    void setData(int id, String name, String course, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.course = course;
    }

}

class A extends person{
    
  void getData(){
    System.out.println("Roll Number: "+id+" Name: "+name+" Course: "+course+" City: "+city);
  }
}

class B extends person{
    void getData() {
      System.out.println("Emp ID: "+id+" Emp Name: "+name+" Emp Course: "+course+" Emp City: "+city);
    }
}

class Lab3 {
    public static void main(String[] args) {
        A ob = new A();
        ob.setData(101, "Saurabh", "BCA", "Allahabad");
        ob.getData();
        B obj = new B();
        obj.setData(101, "Akash Sir", "English", "pune");
        obj.getData();
    }
}