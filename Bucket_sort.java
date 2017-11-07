package algorithm;


import java.util.Scanner;

//O(M+N)
public class Bucket_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//init 100 buckets 
		int arr[] = new int[100];
		
		//init 0 times
		for(int i=0;i<n;i++){
			arr[i] = 0;
		}
		
		//put input number into each bucket-> 5 goto arr[5]+1
		for(int i=0;i<n;i++){
			int m = scan.nextInt();
			arr[m]++;
		}
		
		//search 100 buckets->print times>1 number
		for(int i=0;i<100;i++){
			for(int j=1;j<=arr[i];j++){
				System.out.print(i+" ");
			}
		}
	}

}
