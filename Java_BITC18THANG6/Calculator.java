package Java_BITC18THANG6;

import java.util.Scanner;

public class Calculator {
    public int calculateSum(){
    Scanner scanner = new Scanner(System.in);
    String input;
    int sum = 0;

    do {
    System.out.print("Moi nhap so : ");
    int number = scanner.nextInt();
    sum += number;

    System.out.print("Nhap 'n' neu muon dung .Nhap bat ky de tiep tuc chuong trinh :");
    input = scanner.next();

    }while( !input.equals("n"));
    // AD ra đề khó qué , làm não nghĩ sâu xa (:)
    return sum;
    }

    public int calculateSumOfProduct(int n) {
        int sum = 0;
        System.out.print("Bieu thuc co dang la :  ");
        for (int i = 1; i <= n; i++) {
            int dem = 1;
            for (int j = 1; j <= i; j++) {
                dem *= j;
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" * " + j);
                }
            }

            sum = sum + dem;
            if (i < n) {
                System.out.print(" + ");
                // Nếu i < n thì sau mỗi lần lặp kết thúc nó sẽ thêm +
            }
        }
        System.out.println();
        return sum;
    }

    public void printPrimeFactors(int n) {
        System.out.print("Cac thua so nguyen to cua " + n + " la : ");
        while (n % 2 == 0) {

            System.out.print(2 + " ");
            n /= 2;// Kiểm tra và in ra số 2 như là thừa số nguyên tố nếu có
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {

                System.out.print(i + " ");
                n /= i;// Kiểm tra các số lẻ từ 3 trở đi
            }
        }

        if (n > 2) {
            System.out.print(n);
            // Điều kiện nếu n là số nguyên tố lớn hơn 2
        }
        // In dấu xuống dòng để định dạng kết quả

        System.out.println();
    }
}
