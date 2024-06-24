public class Equation {
    static void CalculateQuadratic(double a , double b , double c ){

        double delta = Math.pow(b,2) - 4 * a * c;
        if(a ==0 ) {
            if(b == 0 ){
                    if(c == 0)
                        {
                            System.out.println("Phuong trinh co vo so nghiem");
                        }else{
                            System.out.println("Phuong trinh vo nghiem vi a va b bang 0 ");
                        }
                }else
                {
                    System.out.println("Phuong trinh co 1 nghiem duy nhat x = " +(-c/b) );
                }
            
        }else 
         {
            if(delta < 0 ) {
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta == 0) {
                System.out.println("Phuong trinh có nghiệm kép la x = " + -b / (2 * a));
            }else if(delta > 0 ) {
                System.out.println("Phuong trinh co 2 nghiem la :  x1 = " + (-b +Math.sqrt(delta))/ (2*a) +"    " + "x2 =" + (-b -Math.sqrt(delta))/ (2*a));
            }
        }
    }
 }
