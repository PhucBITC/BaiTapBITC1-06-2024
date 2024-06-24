

public class App {
    public static void main(String[] args) {
        System.out.println("--------------------Bai1-----------------------");
        CheckYear checkYear = new CheckYear();
        checkYear.CheckLeapYear(19);
        checkYear.CheckLeapYear(2004);
        //Day la nam nhuan 
        checkYear.CheckLeapYear(2013);
        //Day khong phai nam nhuan
        checkYear.CheckLeapYear(1000);
        //Day khong phai nam nhuan 

        System.out.println("----------------------Bai2-----------------");

        Calculator calculator = new Calculator();
        calculator.CalculatorInteger("+",4,2);
        //4+ 2 = 6 ;
        calculator.CalculatorInteger("-",4,2);
        //4+ 2 = 6 ;
        calculator.CalculatorInteger("*",4,2);
        //4+ 2 = 6 ;
        calculator.CalculatorInteger("/",4,2);
        calculator.CalculatorInteger("/",4,0);
        //4+ 2 = 6 ;
        //4+ 2 = 6 ;

        System.out.println("-----------------------Bai3--------------------");
        MaxInteger my = new MaxInteger();
        int max = my.FindMaxInteger();
        System.out.println("so lon nhat la : " + max);

        System.out.println("-------------------------Bai4----------------------");
        Equation equation = new Equation();
        equation.CalculateQuadratic(4,5,6);
        equation.CalculateQuadratic(0,5,6);
        equation.CalculateQuadratic(0,0,6);
        equation.CalculateQuadratic(0,0,0);
        equation.CalculateQuadratic(4,8,3);

    }
}
