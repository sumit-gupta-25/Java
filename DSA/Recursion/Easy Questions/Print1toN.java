public class Print1toN {
    public static void main(String[] args) {
        int n = 10;
        funcRev(n);
    }

    static void funcRev(int n) {
        if(n == 0) {
            return;
        }
        funcRev(n-1);
        
        System.out.println(n);
    }
}
