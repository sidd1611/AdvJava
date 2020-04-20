package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ViewProductsServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		HttpSession hs = req.getSession(false);
		
		if(hs==null)
		{
			pw.println("Please! Login First......<br/>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		else
		{
			String fName = (String)hs.getAttribute("FirstName");
			pw.println("Welcome ADMIN: "+fName+"<br/>");
			RequestDispatcher rd = req.getRequestDispatcher("Link1.html");
			rd.include(req, res);
			
			ArrayList<ProductBean> a1 = new RetrieveDAO().retrieve();
			
			if(a1.size()==0)
			{
				pw.println("No Products Available.......");
			}
			else
			{
				pw.println("<div align='center'><br/>");
				pw.println("<table>");
				pw.println("<tr><th>Product Code</th>"+"<th>Product Name</th>"
				          +"<th>Product Price</th>"+"<th>Product Quantity</th></tr>");
				a1.forEach((k)->
				{
					ProductBean p = (ProductBean)k;
					pw.println("<tr><td>"+p.getpCode()+"</td><td>"+p.getpName()+"</td><td>"
					                  +p.getpPrice()+"</td><td>"+p.getpQty()+"</td></tr>");
				});
				pw.println("</table></div>");
			}
		}
	}
}