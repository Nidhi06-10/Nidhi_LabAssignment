
/*
 * Author : Nidhi
 * Desc : Number of words, characters and lines in text file
 * Date : 25/10/2020
 */
import java.util.*;
import java.io.*;

public class NumberOfWords {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try {
			int lines=0,chars=0,words=0;
			int code=0;
			File file = new File("Demo.txt"); 
			FileInputStream fileInputStream = new FileInputStream(file);
			while(fileInputStream.available()!=0)
			{
				code = fileInputStream.read();
				if(code!=10)// ASCII  of newline is 10
					chars++;
				if(code==32)// ASCII of white space is 32
					words++;
				if(code==13)// ASCII of Enter key is 13
				{
					lines++;
					words++;
				}
			}
			System.out.println("No.of characters = "+chars);
			System.out.println("No.of words = "+(words+1));
			System.out.println("No.of lines = "+(lines+1));
			fileInputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
	}
}
