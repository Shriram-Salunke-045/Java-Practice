public class pattern6 {
    public static void main(String[] args) {
        int n;
        pattern(n=5);

    }
    public static void pattern(int n){
        
        for(int i=0; i<=(2*n)-1; i++){
            int c  = i > n ? 2 * n - i :i;

            int spaces = n-c;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=0;j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
   
