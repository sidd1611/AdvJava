package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class WelcomeServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String fName = (String)req.getAttribute("FirstName");
		pw.println("<script>window.alert('Login Successful!!!.....');</script>");
		pw.println("WELCOME ADMIN: "+fName);	
	}
}
