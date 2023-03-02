
//#include <iostream>
//using namespace std;
//
//int bina(int arr[], int l, int r, int key)
//{
//    
//    while(l<=r)
//    {
//        int mid = l+(r-l)/2;
//        if(arr[mid] == key)
//        {
//            return mid;
//        }
//        if(arr[mid] < key)
//        {
//            l = mid+1;
//        }
//        else{
//            r = mid-1;
//        }
//        
//    }
//    return -1;
//}
//
//int main()
//{
//    int n;
//    cin>>n;
//    
//    int arr[n];
//    
//    for(int i=0; i<n; i++)
//    {
//        cin>>arr[i];
//    }
//    int x;
//    cin>>x;
//    
//    cout<<bina(arr, 0, n-1, x);
//    
//
//    return 0;
//}
package Shriram;
import java.util.*;
public class leep {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int year  = scan.nextInt();
	
	if(year%4==0) {
		System.out.print("leap year");
	}
	else {
		System.out.print("not a leap year");
	}
}
}
