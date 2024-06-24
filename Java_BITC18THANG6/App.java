package Java_BITC18THANG6;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("----------------BAI 1-----------------");
        int sum = calculator.calculateSum();
        System.out.println("Sum : " + sum);
        System.out.println("------------------BAI 2 --------------");
        System.out.println("Tong la :" + calculator.calculateSumOfProduct(5));
        System.out.println("------------------BAI 3------------------");
        calculator.printPrimeFactors(35);
    }
}
