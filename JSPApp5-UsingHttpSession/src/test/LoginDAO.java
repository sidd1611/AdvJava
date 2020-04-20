package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginDAO
{
	public String fName;
	
	public String login(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM USERREG26 WHERE UNAME=? AND UPWD=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				fName = rs.getString(3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fName;
	}
}
