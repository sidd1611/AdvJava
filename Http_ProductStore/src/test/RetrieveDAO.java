package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RetrieveDAO
{
	public ArrayList<ProductBean> a1 = new ArrayList<ProductBean>();
	
	public ArrayList<ProductBean> retrieve()
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM PRODUCT26");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ProductBean p = new ProductBean();
				p.setpCode(rs.getString(1));
				p.setpName(rs.getString(2));
				p.setpPrice(rs.getFloat(3));
				p.setpQty(rs.getInt(4));
				
				a1.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return a1;
	}
}