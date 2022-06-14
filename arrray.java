import java.util.*;
class HelloWorld {
   
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<a.length; i++ ){
            System.out.println(a[i]);
        }
    }
}
