package OOPS;
// Methods in Java

public class main {

  public static void main(String[] args) {
    Computer obj = new Computer();
    obj.playmusic();
    String str = obj.getmepen(20);
    System.out.println(str);
  }
}

class Computer {

  public void playmusic() {
    System.out.println("Music Playing....");
  }

  public String getmepen(int cost) {
    return "Pen";
  }
}
