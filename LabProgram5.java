import java.util.Scanner;
class BinarySearch
{
  int binarysearch(int array[],int e, int n)
  {
      int lb=0;
      int ub=n-1;
      while (lb<= ub) 
      {
    	  int mid = (lb+ub)/2;
    	  if (array[mid] == e)
    		  return mid;
    	  else if (array[mid] < e)
    		  lb = mid + 1;
    	  else
    		  ub = mid - 1;
      }
      return -1;
  }
}
class LabProgram5{
    private static Scanner sc;
  public static void main(String args[]) {
    BinarySearch obj = new BinarySearch();
    sc = new Scanner(System.in);
    int n,i,element,result;
    int array[]=new int[20];
    System.out.print("Enter size of the array:");
    n=sc.nextInt();
    System.out.print("Enter the elements :");
    for(i=0;i<n;i++)
    	array[i]=sc.nextInt();
    System.out.println("Enter the element to be searched:");
    element = sc.nextInt();
    result = obj.binarysearch(array, element, n);
    if (result == -1)
    	System.out.print("Element is not found in array");
    else
    	System.out.print("Element is at index " + result);
    sc.close();
  }
}

