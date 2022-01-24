import java.util.Scanner;
class Queue
{
	int front=0,rear=0, max=20;
	Scanner sc=new Scanner(System.in);
	int queue[]=new int[max];
	void enqueue()
	{
		System.out.println("Enter how many elements you want to enqueue");
		int k= sc.nextInt();
		System.out.println("Enter the elements:");
		for (int i=0;i<k;i++)
		{
			if(isFull())
			{
				System.out.println("Stack is full");
			}
			else {
				int e[]=new int[k];
				e[i]=sc.nextInt();
				queue[rear++]=e[i];
			}
		}
	}
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return queue[front++];
		}
	}
	boolean isFull()
	{
		return ((rear==max)?true:false);
	}
	boolean isEmpty() {
		return (rear==front)?true:false;
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("there is no content");
			return ;
		}
		System.out.println("contents are");
		for(int j=front;j<rear;j++)
		{
			System.out.println(queue[j]);
		}
	}
}
public class AdditionalProgram4 {
	public static void main(String[] args) {
		Queue k=new Queue();
		Scanner sc=new Scanner(System.in);
		System.out.println("***MENU***");
		System.out.println("1.Enqueue\n"+"2.Dequeue\n"+"3.ViewQueue\n"+"4.Exit");
		first:while(true)
		{
			System.out.println("Enter your choice : ");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				k.enqueue();
				break;
			case 2:
				System.out.println("the dequeued element is"+k.dequeue());
				break;
			case 3:
				k.display();
				break;
			case 4:
				break first;
			}
		}
	}
}