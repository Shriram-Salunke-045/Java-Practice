public class pattern5 {
    public static void main(String[] args) {
        int n;
        pattern(n=5);

    }
    public static void pattern(int n){
        
        for(int i=0; i<=(2*n)-1; i++){
            int c  = i > n ? 2 * n - i :i;
            for(int j=0;j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
