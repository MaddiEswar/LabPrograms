import java.io.*;
import java.util.Scanner;
public class LabProgram15 {
	public static void main(String[] args) {
		String fname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the filename:");
		fname=sc.next();
		File f1=new File(fname);
		System.out.println("File name:"+f1.getName());
		System.out.println("Executable File:"+f1.canExecute());
		System.out.println("Readable:"+f1.canRead());
		System.out.println("Writable:"+f1.canWrite());
		System.out.println("Existance of the file:"+f1.exists());
		System.out.println("Parent File:"+f1.getParentFile());
		System.out.println("File size in bytes:"+f1.length());
		sc.close();
	}
}