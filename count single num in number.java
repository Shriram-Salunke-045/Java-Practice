import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number should count: ");
        int i = sc.nextInt();

        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == i){
                count++;
            }
            n= n / 10;         // n/= 10
        }
        System.out.println(count);
    }
}
