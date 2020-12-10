/*
 * Author:Nidhi
 * 
 */
import java.io.*;

public class FileProgram {
	public static void main(String args[])
	{
		try
		{
		CopyDataThread cp=new CopyDataThread(new FileReader("Demo.txt"),new FileWriter("target.txt"));//Creating object
		Thread t=new Thread(cp);
		t.start();//By using start we can use threads
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}