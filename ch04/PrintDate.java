public class PrintDate {
    public static void main (String[] args){
        printAmerican("Monday", "25", "July", "2016");
        printEuropean("Monday", "25", "July", "2016");
    }

    public static void printAmerican(String day, String date, String month, String year){
        System.out.print("American Time: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, String date, String month, String year){
        System.out.print("European Time: ");
        System.out.println(day + ", " + date + " " + month + " " + year);
    }
}
