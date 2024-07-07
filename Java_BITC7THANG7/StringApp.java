package Java_BITC7THANG7;

public class StringApp {
    public void CheckSubString(String mainString, String subString) {
        if (mainString.contains(subString)) {
            System.out.println("Chuoi con 'Java' co trong chuoi chinh ");
        }else{
            System.out.println("Chuoi con 'Java' khong co trong chuoi chinh");
        }
    }

    public int CountCharInString(String mainString, char searchChar) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;

    }

    public String UpperCaseToString(String mainString){
        String result = mainString.toUpperCase();
        return result;
    }

    public void isPalindrome(String mainString){
        StringBuilder sb = new StringBuilder(mainString);
        if(mainString.equals(sb.reverse().toString())){
            System.out.println("Chuoi : " + mainString + " la doi xung ");
        }else{
            System.out.println("Chuoi : " + mainString + " khong phai la doi xung ");

        }
    
    }

}
