package phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailIdValidation {

	public static void main(String[] args) {
		
		// to take the email as input
		Scanner s = new Scanner(System.in);
		ArrayList<String> emailId = new ArrayList<String>();
		
		emailId.add("aman.1@xyz.com");
        emailId.add("gagan.2@xyz.com");
        emailId.add("abhay.3@xyz.com");
        emailId.add("deep.4@xyz.com");
        emailId.add("rik.fiesler@gmx.com");
        emailId.add("lara.kramm@gmx.com");
        emailId.add("sine.neuwirth@gmx.com");
        
        String search = null;
        System.out.println("Enter the email ID ");
        search = s.nextLine();
        
        //to verify if the email enter is present in the array
        if(emailId.contains(search)) {
        	System.out.println("Entered email ID " + search + " FOUND");
        }
        else {
        	System.out.println("Entered email ID " + search + " NOT FOUND");
	    }
        

        

	}

}
