//Filters in Servlet Programming:A filter is a PRE-PROCESSING component which is executed before Servlet
//program & which accepts the request from the web-browser & forwards the request to the Servlet Program

//Advantages of Filters:
//i)  Filter is used for recording all incoming requests i.e. logging
//ii) Filter also logs the IP address of the computer from which the request is generated
//iii)Filters are used for conversion process
//iv) Filters are used for data compression process
//v)  Filters are used for Encryption and Decryption process
//vi) Filters are used for input validation process
//so, overall filter is used to perform some preparatory work before forwarding request to Servlet for 
//actual processing.

//Component used to construct Filter-Programs are: i)Filter ii)FilterChain iii)FilterConfig

//Filter: It is an interface from "javax.servlet" package and the User-Defined class must be implemented
//from "Filter" interface to achieve working of a Filter. Life-Cycle methods from this interface are:
//public void init(FilterConfig) ---> used to initialize the filter
//public void doFilter(ServletRequest, ServletResponse, FilterChain) :invoked for each request & filters the task
//public void destroy() ---> Filter taken-out of service and stops the service

//FilterChain:It is an interface form "javax.servlet" package & used to invoke NextResource/ServletProgram
//public void doFilter(ServletRequest, ServletResponse)--> different from doFilter() method of Filter
//Interface as it has 2 parameters and doFilter() method of Filter interface has 3 parameters. This mehtod
//passes the control to the next Resource

//We use <filter><filter-name>..<filter-class>..</filter><filter-mapping><filter-name>...<filter-class>..</filter-mapping>
//as part of web.xml for mapping filter program.

package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter
{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException
			{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String fName = new LoginDAO().login(req);
		if(fName==null)
		{
			pw.println("Invalid UserName or Password.....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		else
		{
			req.setAttribute("FirstName", fName);
			fc.doFilter(req, res); //this statement will forward the request to servlet having same 
			                       //url-pattern as of this Filter
		}
			}
	
}