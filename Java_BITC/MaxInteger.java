import java.util.Scanner;

public class MaxInteger {
    public static int FindMaxInteger(){
        int number1,number2,number3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number1");
        number1 = sc.nextInt();

        System.out.println("Please enter number2");
        number2 = sc.nextInt();

        System.out.println("Please enter number3");
        number3 = sc.nextInt();
        sc.close();

       if(number2 > number1){
       return number2;
       
       }else if(number3 > number2){
        return number3;
       }
    return number3;  
    }
}
