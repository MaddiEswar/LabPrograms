import java.io.*;
 class SD implements Serializable{
	int i;
	double d;
	boolean b;
	char c;
	SD(int i, double d, boolean b, char c) {
		super();
		this.i = i;
		this.d = d;
		this.b = b;
		this.c = c;
	}
	void display() {
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
public class AdditionalProgram7  {
	public static void main(String[] args)throws Exception {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file3.txt"));
		SD obj1=new SD(3,3.4,true,'b');
		SD obj2=new SD(6,3.4e+10,false,'a');
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file3.txt"));
		SD s1=(SD)ois.readObject();
		s1.display();
		s1=(SD) ois.readObject();
		s1.display();
		ois.close();
	}
}
