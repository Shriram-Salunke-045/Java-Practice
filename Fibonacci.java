// write a fibbonacci series for a user input number
import java.util.*;

class Main{
    public static void main(String[] args){
        int n1=0, n2=1, n3, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number size : ");
        n = sc.nextInt();
        System.out.print(n1+" "+n2);
        
        
        for(int i=2; i<n;i++){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
            
        }
    }
}
