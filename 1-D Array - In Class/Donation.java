import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		long sum=max;
		System.out.print(0+" ");
		for(int i=1;i<n;i++){
			sum+=arr[i];
			if(arr[i]>=max){
				System.out.print(0+" ");
				max=arr[i];
			}
			else{
				System.out.print(max-arr[i]+" ");
				sum+=max-arr[i];
			}
		}
		System.out.println("\n"+sum);
	}
}
