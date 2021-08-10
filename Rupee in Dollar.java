import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency in rupees: ");
        float n = sc.nextFloat();
        
        System.out.println(n+" Rs in dollar = "+(n*0.013)+" $");
}
}
