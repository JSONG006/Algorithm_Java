package algorithm;

import java.util.Scanner;

//O(NlogN)->O(N^2)
public class Quick_sort {

	/**
	 * @param args
	 */
	private static int arr[] = new int[100];
	
	public void quicksort(int start, int end){
		if(start>end){
			return;
		}
		
		int point = arr[start];
		int i = start;
		int j = end;
		
		while(i!=j){
			//left first -> find "left number < base number(start)"-> while stop
			while(arr[j]>=point && i<j){
				j--;
			}
			//right send -> find "right number > base number(start)" -> while stop
			while(arr[i]<=point && i<j){
				i++;
			}
			//haven't meet "start and end"
			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
				
		}
		// when start meet end(i==j) while stop, then swap point(start) and i or j
		arr[start] = arr[i];
		arr[i] = point;
		
		quicksort(start,i-1);
		quicksort(i+1,end);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//init arr[]
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		
		//invoke quick_sort()
		Quick_sort qs = new Quick_sort();
		qs.quicksort(0,n-1);
		
		//print result
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
