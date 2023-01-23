// Encapsulation => Binding data with methods
class Student {

  private int rollno;
  private String name;

  // Getters and Setters

  public int getRollno() {
    System.out.println("User is accessing the value");
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
    System.out.println("Values of rollno changed"); //Maintaining a log file here
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class main {

  public static void main(String[] args) {
    Student obj = new Student();
    obj.setRollno(9);
    obj.setName("Manu");

    System.out.println(obj.getRollno());
    System.out.println(obj.getName());
    // System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
