import java.util.Scanner;

public class BottlesOfBeer {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("How many verses of the song you would like to display?");
        System.out.print("Input the number (decimal): ");
        num = in.nextInt();
        System.out.println("Here we go!");
        System.out.println();

        printSong(num);
    }

    public static void printSong(int salms) {
        if (salms > 0) {
            printVerse(salms);
            salms -= 1;
            // for proper last but one verse. 1 bottle, not 1 bottles
            if (salms == 1){
                printOneBottleVerse();
                salms -= 1;
            }
            if (salms == 0) {
                printLastVerse();
            }
            printSong(salms);
        }
    }

    public static void printVerse(int x) {
        System.out.println(x + " bottles of beer on the wall,");
        System.out.println(x + " bottles of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
    }

    public static void printOneBottleVerse(){
        System.out.println("1 bottle of beer on the wall,");
        System.out.println("1 bottle of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
    }

    public static void printLastVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around,");
        System.out.println("cause there are no more bottles of beer on the wall!");
    }
}
