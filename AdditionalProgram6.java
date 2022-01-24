import java.io.*;
public class AdditionalProgram6 {
	public static void main(String[] args) throws IOException {
		String s="java programming";
		char c[]=new char[s.length()];
		c=s.toCharArray();
		CharArrayReader c1=new CharArrayReader(c);
		int c2;
		while((c2=c1.read())!=-1)
			System.out.print((char)c2);
		CharArrayWriter c3=new CharArrayWriter();
		c3.write(c);
		FileWriter f1=new FileWriter("File2.txt");
		c3.writeTo(f1);
		f1.close();
	}
}

