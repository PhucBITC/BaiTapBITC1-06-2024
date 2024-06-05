/**
 * App
 */
public class Person {
    int namsinh;

    public Person(int namsinhcuaban){
        this.namsinh = namsinhcuaban; 
    }

    public int PerdictAge(){
        return 2024 - this.namsinh;

    }
    
    public static void main(String[] args) {
    Person person1 = new Person(2005);
    System.out.println("So tuoi cua ban la " + person1.PerdictAge());
}
}
