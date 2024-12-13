package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TextFileHandling {
	public static void main(String[] args) throws IOException {
	    Scanner s = new Scanner(System.in);
		File f = new File("C:\\Users\\Qapitol QA\\eclipse-workspace\\files\\src\\test\\resources\\filehandling\\data.text");
	    FileOutputStream fout= new FileOutputStream(f,true);
	    System.out.println("enter your name : ");
	    String name=s.next();
	    String password=s.next();
	    String s1 = name+" "+password;
	    byte[]b=s1.getBytes();
	    fout.write(b);
	    fout.flush();
	    fout.close();
	    System.out.println("account created ...");
	    
	    
	}
	

}
