package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		try {
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			//establishing the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaTraining","root","#Deepti29");
			System.out.println("Connected successfully");
			
			PreparedStatement pstmt = con.prepareStatement("select * from eproduct where id = ?");
			String s = "<br><hr><a href=\"index.html\">Click Here to Go Back</a>";
			String id = request.getParameter("id");
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				pw.println("Id is "+rs.getString("id")+", Name is "+rs.getString("name")+", Number is "+rs.getString("number"));
				pw.println(s);
				
			}else {
				pw.println("No details with this product id,");
				pw.println(" Click the link to enter id again <br>"+s);
			}
//			
		}catch(Exception e) {
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
