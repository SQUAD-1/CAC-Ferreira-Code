package API;

import java.sql.*;

public class ConnectorBD
{

public static void API(String []args)
{
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost::3306/mydb","root","teste");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("");
        while(rs.next())
        {
            System.out.println();
        }
        con.close();
}

catch(Exception e)
{
    System.out.println(e);
}
}
}