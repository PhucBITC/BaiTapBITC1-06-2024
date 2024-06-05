/**
 * Car
 */
public class Car {
    int speed = 0 ; 
    
    public int upTo20(){
        return speed+=20 ; 
    }

    public int upTo40(){
        return speed+=20 ; 
    }

    public int upTo60(){
        return speed+=20 ; 
    }

    public static void main(String[] args) {
      Car car1 = new Car();
      int toLanThu1 = car1.upTo20();
      int toLanThu2 = car1.upTo40();
      int toLanThu3 = car1.upTo60();
      System.out.println("Toc do xe trong lan chay thu nhat la "+ toLanThu1 + "km");
      System.out.println("Toc do xe trong lan chay thu hai la "+ toLanThu2 + "km");
      System.out.println("Toc do xe trong lan chay thu ba la "+ toLanThu3 + "km");
    }

}
//ký tên e phúc <:> 
