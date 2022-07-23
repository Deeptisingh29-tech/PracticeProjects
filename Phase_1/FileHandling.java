package phase1;
import java.io.*;

public class FileHandling {
	
	public static void append(String fileName, String text) throws Exception {
		
		//Open given file in append mode by creating an
        // object of BufferedWriter class
		BufferedWriter Bw = new BufferedWriter(new FileWriter(fileName, true));
		
		Bw.write(text);
		Bw.close();
	}

	public static void main(String[] args) throws Exception {
		
		//declaring the file which is to be handled
		String fileName = "E:\\Eclipse\\TextFileHandling1.txt";
		
		//giving the strings
		String str = "This line is written by using FileWriter class in java and using string. ";
		String text = "This is the appended text.";
		
		
		//File reader and file writer: making the objects for reader and writer
		FileReader Fr = new FileReader(fileName);
		FileWriter Fw = new FileWriter(fileName);
		

		// string named str is written in the file
		Fw.write(str);
		System.out.println(str);
		Fw.close();					//closing the connection
		System.out.println("File written successfully");
		
		
		//append() function is created to perform append operation
		// appending the file passed as parameter with the string passed
		append(fileName, text);
		System.out.println("String to be added: "+text);
		System.out.println("File appended successfully");
		
		
		// reading the file character by character
		int i;
		while((i = Fr.read()) != -1) {
			System.out.print((char)i);
		}
		
		
		

	}

}
