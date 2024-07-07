package Java_BITC7THANG7;

public class Test {
    public static void main(String[] args) {
        System.out.println("================================== Bai 1 ===================================================");
        StringApp stringApp = new StringApp();
        stringApp.CheckSubString("Hello,welcome to the word of Java","Java");

        System.out.println("================================== Bai 2 ===================================================");
        int result = stringApp.CountCharInString("Xin chao phuc viet , ho ten day du cua ban la nguyen viet phuc",'p');
        System.out.println("Ki tu 'p' xuat hien " + result + "lan");

        System.out.println("================================== Bai 3 ===================================================");
        System.out.println("Chuoi duoc in hoa : " + stringApp.UpperCaseToString("em nguyen viet phuc de tu thay le hoang"));

        System.out.println("================================== Bai 4 ===================================================");
        stringApp.isPalindrome("radar");
        stringApp.isPalindrome("btec");
    }
    
}
