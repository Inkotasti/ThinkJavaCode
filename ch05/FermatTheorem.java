
public class FermatTheorem {

    public static void checkFermat(int x, int y, int z, int n) {
        if (n > 2 || (Math.pow(x, n) + Math.pow(y, n) == Math.pow(z, n))){
            System.out.println("Holy smokes, Fermat was wrong! ");
        }else{
            System.out.println("No. That doesn't work.");
        }
    }
}