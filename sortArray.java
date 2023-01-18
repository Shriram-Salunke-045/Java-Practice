// Sort a given array by predefine sort function

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Sorted array Array :");
		int arr[] = new int[] {9,6,1,10,5,};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
		    System.out.print(" "+arr[i]);
		}
	}
}
