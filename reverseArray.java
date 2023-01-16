// To reverse an array
import java.util.*;
class  Main {
    public static void main(String[] args){

        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the elements of an array : ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n; i++){
             arr[i]=sc.nextInt();
        }
        
        System.out.print("Reversed array is  : ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
