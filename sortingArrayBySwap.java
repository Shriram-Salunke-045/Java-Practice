import java.util.*;

class Main{
public static void main(String[] args){
    
    int arr[] = new int[]{9,5,7,8,6,10,3};
    
    System.out.print("Sorted array as : ");
    for(int i=0; i<arr.length; i++){
        for(int  j=i+1; j<arr.length; j++){
            int temp = 0;
            
            if(arr[i]>arr[j]){
                
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        System.out.print(arr[i]+" ");
    }
}
}
