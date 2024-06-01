/**
 * TimeCovesionApp
 */
public class TimeCovesionApp {
    private int covertHoursToMinutes;
    private int covertDaysToMinutes;

    public TimeCovesionApp(int hoursToMinutes, int dayToMinutes){
        this.covertHoursToMinutes = hoursToMinutes;
        this.covertDaysToMinutes = dayToMinutes;
    }
    public int covertHoursToMinutes(){
        return this.covertHoursToMinutes * 60;
    }
    public int covertDaysToMinutes(){
        return this.covertDaysToMinutes *24 * 60 ;
    }

    public static void main(String[] args) {
        TimeCovesionApp timeCovesionApp = new TimeCovesionApp(2,3);
        System.out.println("Gio sang phut la " + timeCovesionApp.covertHoursToMinutes() + " phut ");
        System.out.println("Ngay sang phut la " +timeCovesionApp.covertDaysToMinutes()+ " phut ");
        
    }
}
