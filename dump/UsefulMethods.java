import java.util.Scanner;

public class UsefulMethods {

    public static void main(String[] args) {
        System.out.println(oddSum(8));

    }

    public static boolean isDecimal(int x) {
        return x % 2 == 0;
    }

    /**
     * @param n
     * @return Returns every odd integer sum from n to 1.
     */

    public static int oddSum(int n) {
        Scanner in = new Scanner(System.in);
        if (n % 2 != 0 && n != 1 && n > 0) {
            int sum = n + (n - 2);
            n -= 2;
            int result =  oddSum(n)+ sum;
            return result;

        } else if (n % 2 == 0){
            System.out.println("Please enter odd decimal! :");
            int x = in.nextInt();
            oddSum(x);
            return x;
        }
        return 0;
    }
}
