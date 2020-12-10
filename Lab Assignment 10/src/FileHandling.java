/* Author: Amrutha R
Desc:Code to check whether we can read,write a file */
import java.io.*;
public class FileHandling {
	public static void main(String args[])
	{
		File f=new File("Amrutha.txt");
		String name=f.getName();
		boolean b=f.isFile();//checks whether is a file or not
		boolean w=f.canWrite();//Check whether we can write
		boolean r=f.canRead();//Checks whether it is readable or not
		long length=f.length();//Finds length
		//String x=f.;
		System.out.println(name+" "+b+" "+w+" "+r+" "+length);
		
		
	}

}