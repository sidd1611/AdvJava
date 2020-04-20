package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	 @Override
	 public void doPost(HttpServletRequest req, HttpServletResponse res) 
			 throws ServletException, IOException
			 {
		 String fName = new LoginDAO().login(req);
		 if(fName==null)
		 {
			 RequestDispatcher rd = req.getRequestDispatcher("Fail.jsp");
			 rd.forward(req, res);
		 }
		 else
		 {
			 HttpSession hs = req.getSession();
			 hs.setAttribute("FirstName", fName);
			 RequestDispatcher rd = req.getRequestDispatcher("Success.jsp");
			 rd.forward(req, res);
		 }
			 }
}
