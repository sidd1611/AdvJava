package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String fName = new LoginDAO().login(req);
		
		if(fName==null)
		{
			pw.println("Invalid UserName & Password.......<br/>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("FirstName", fName);
			pw.println("Welcome ADMIN: "+fName+"<br/>");
			RequestDispatcher rd = req.getRequestDispatcher("Link1.html");
			rd.include(req, res);
		}
	}
}