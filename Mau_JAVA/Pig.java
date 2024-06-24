package Mau_JAVA;

public class Pig {
    private int Age;
    private String name;
   
    //constructor 
    


    // Getter method to get the red value of the color.
    public int getRed() {
        return red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        return green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
       return blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
       this.red= 255- this.red;
       this.green= 255- this.green;
       this.blue= 255- this.blue;
    }
    
}
