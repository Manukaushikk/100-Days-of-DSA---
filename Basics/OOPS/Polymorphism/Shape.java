package Polymorphism;

class Shape {

  public void area() {
    System.out.println("area");
  }
}

class Circle extends Shape {

  public void area() {
    System.out.println("circle");
  }

  public static void main(String[] args) {
    Shape s = new Circle();
    s.area();
  }
}
