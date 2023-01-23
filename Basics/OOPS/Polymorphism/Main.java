// compile Time Polymorphism
package Polymorphism;

// class Main {
class Main {

  // public class Shape {

  public void area(String Circle) {
    System.out.println("Circle");
  }

  public void area(String Circle, String Triangle) {
    System.out.println("Circle & Traingle");
  }

  public void area(String Circle, String Triangle, String Rectangle) {
    System.out.println("Circle & Traingle & Rectangle");
  }

  public static void main(String[] args) {
    Main shape = new Main();
    shape.area("circle");
    shape.area("circle", "Traingle");
    shape.area("circle", "Traingle", "Rectangle");
  }
}
// }
