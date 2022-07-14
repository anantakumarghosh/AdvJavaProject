import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "UpdateQuery", value = "/UpdateQuery")
@SuppressWarnings("unused")
public class UpdateQuery extends DBConnection {


    public static int updQuery(String query) {
        Connection con = createConnection();
        Statement st = null;

        try {
            st = con.createStatement();
        } catch (SQLException e) {
            System.out.println("ExecuteQuery.java [Error] SQL Exception");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("ExecuteQuery.java [Error] Null Pointer Exception");
            e.printStackTrace();
        }

        try {
            return st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("ExecuteQuery.java [Error] SQL Exception");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("ExecuteQuery.java [Error] Null Pointer Exception");
            e.printStackTrace();
        }

        return 0;
    }
}
