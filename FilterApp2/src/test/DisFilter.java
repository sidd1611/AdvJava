//FilterConfig: It is an interface from "javax.servlet" package.
//              It is instantiated automatically when the Filter program is loaded onto WebContainer &
//              then this "FilterConfig" object is loaded with FilterName
//Object of FilterConfig (just like ServletConfig) is created by the WebContainer. This object is used
//to get Configuration details from web.xml and syntax to create FilterConfig object is:
//FilterConfig fc ;
//public void init(FilterConfig fc) throws ServletException { this.fc = fc; }
//Note: The parameters of <init-param> of web.xml are initialized in FilterConfig object

//Some important Methods of FilterConfig are:
//i)  public void init(FilterConfig); --->initializes filter
//ii) public String getInitParameter(String); --->returns parameter value
//iii)public Enumeration getInitParameterNames(); --->returns all parameter names
//iv) pubic ServletContext getServletContext(); --->returns ServletContext object

package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisFilter implements Filter
{
	public FilterConfig fc;
	public ServletContext sc;
	
	@Override
	public void init(FilterConfig fc)throws ServletException
	{
		this.fc = fc;
		sc = fc.getServletContext();
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain f)
			throws IOException, ServletException
			{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String uName = req.getParameter("name");
		Enumeration<String> e1 = fc.getInitParameterNames();
		Enumeration<String> e2 = sc.getInitParameterNames();
		
		pw.println("<div align='center'>");
		pw.println("WELCOME: "+uName+"<br/>");
		pw.println("*****************************<br/><br/>");
		
		pw.println("===FilterConfig Info===<br/>");
		pw.println("Filter Name: "+fc.getFilterName());
		pw.println("<br/>Filter init parameter c: "+fc.getInitParameter("c"));
		pw.println("<br/>$$$FilterConfig Data$$$");
		while(e1.hasMoreElements())
		{
			pw.println("<br/>"+fc.getInitParameter(e1.nextElement()));
		}//end of loop
		
		pw.println("<br/>===ServletConfig Info===");
		pw.println("<br/>Server Info: "+sc.getServerInfo());
		pw.println("<br/>Servlet Name: "+sc.getServletContextName());
		pw.println("<br/>$$$ServletContext Data$$$");
		while(e2.hasMoreElements())
		{
			
			pw.println("<br/>"+sc.getInitParameter(e2.nextElement()));
		}//end of loop
		
		pw.println("</div>");
			}
}
