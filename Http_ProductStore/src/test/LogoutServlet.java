package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession();
		
		if(hs==null)
		{
			pw.println("Please! Login First......<br/>");
		}
		else
		{
			hs.invalidate();
			pw.println("Logged out Successfully......<br/>");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.include(req, res);
	}
}