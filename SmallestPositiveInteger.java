package GIT;
import java.util.Arrays;
import java.util.*;
public class SmallestPositiveInteger {
	static int T;
	static int n[]= new int[100];
	static int arr[][]= new int[100][100];
	static int smallestPositive(int arr[][],int p) {
		//System.out.println("Length = "+n[p]);
		int tempArr[] = new int[n[p]];
		for(int q=0;q<n[p];q++) {
			tempArr[q]=arr[p][q];
			//System.out.println(tempArr[q]);
		}
		Arrays.sort(tempArr);
		int s=1;
		for(int q=0;q<n[p];q++) {
			if(tempArr[q] >= 1) {
				if(s==tempArr[q]) {
					s++;
				}
				else {
					return s;
				}
			}
		}
		return tempArr[n[p]-1];
	}
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		T=scan.nextInt();
		
		for(int i=0;i<T;i++) {
			n[i]=scan.nextInt();
			for(int j = 0;j<n[i];j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int p=0;p<T;p++) {
			System.out.println(smallestPositive(arr,p));
		}
		for(int i=0;i<T;i++) {
			for(int j = 0;j<n[i];j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
