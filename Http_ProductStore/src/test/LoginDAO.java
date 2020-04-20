//Class with persistance logic i.e. Database Logic

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class LoginDAO
{
	public String fName;
	
	public String login(HttpServletRequest req)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM ADMINTAB26 WHERE UNAME=? AND PWORD=?");

			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				fName = rs.getString(3);
			}
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return fName;
		
	}
}