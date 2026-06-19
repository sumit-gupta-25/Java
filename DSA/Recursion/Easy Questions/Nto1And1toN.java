public class Nto1And1toN {
    public static void main(String[] args) {
        int n = 10;
        funcRev(n);
    }

    static void funcRev(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funcRev(n-1);
        System.out.println(n);
    }
}
