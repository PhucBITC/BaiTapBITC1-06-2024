/**
 * Circle Tính diện tích hình tròn và chu vi 
 */
public class Circle {
    //private bán kính 
    private double r  ; 
    
    //Khởi tạo giá trị của thuộc tính nhé <:>
    public Circle(double bankinh){
        this.r = bankinh;
    }

    public double Area(){
        return Math.PI * Math.pow(this.r, 2);
    }

    public double Perimete(){
        return 2 * Math.PI * this.r;
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Dien tich cua hinh tron la " + circle.Area());
        System.out.println("Chu vi cua hinh tron la " + circle.Perimete());

    }
    
}