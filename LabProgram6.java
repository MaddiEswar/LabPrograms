import java.util.Scanner;
public class LabProgram6 {
	static void mergePass(int b[],int lb,int ub) {
		int mid;
		if(lb!=ub) {
			mid=(lb+ub)/2;
			mergePass(b,lb,mid);
			mergePass(b,mid+1,ub);
			mergeSort(b,lb,mid,ub);
		}
	}
	static void mergeSort(int c[],int lb,int mid,int ub) {
		int i,j,k;
		int temp[]=new int[20];
		i=lb;j=mid+1; k=lb;
		while((i<=mid)&&(j<=ub)) {
			if(c[i]<c[j]) {
				
				temp[k++]=c[i++];}
			else {
				temp[k++]=c[j++];}
		}
		while(i<=mid) {
			temp[k++]=c[i++];}
		while(j<=ub) {
			temp[k++]=c[j++];}
		for(i=lb;i<=ub;i++)
			c[i]=temp[i];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[100];
		int n;
		System.out.print("Enter number of elements :");
		n=sc.nextInt();
		System.out.print("Enter the elements :");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Before Sorting:");
		for(int i=0;i<n;i++)
			System.out.printf("%3d",a[i]);
		mergePass(a,0,n-1);
		System.out.println("\nAfter Sorting:");
		for(int i=0;i<n;i++)
			System.out.printf("%3d",a[i]);
		sc.close();
	}

}