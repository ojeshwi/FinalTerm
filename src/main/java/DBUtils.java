import models.ModelClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    public static final  String CLASS_TABLE
    public static Connection connection() {
        Connection connection = null;
        String url = "jdbc::src/main/resources/d";
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Connection Established");
        } catch (SQLException e)
        System.out.println(e.getMessage());
    }
    return connection;


    public static List<ModelClass> getallClass(connection connection){
        String sql= "SELECT * FROM " + CLASS_TABLE;
        List<ModelClass> modelClasses = new ArrayList<>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet re = stmt.executeQuery(sql);

            while (rs.next());

        }
    }
}

