import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ConnectionBDD {


          public static void main(String[] args) {

            try {

              Class.forName("com.mysql.jdbc.Driver");

              String url = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";

              String user = "root";

              String password = "";


              Connection conn = DriverManager.getConnection(url, user, password);

              //Creating a Statement object

              Statement state = conn.createStatement();

              //The ResultSet object contains the result of the SQL query

              ResultSet result = state.executeQuery("CALL Call_Map()");

              //We retrieve the MetaData

              ResultSetMetaData resultMeta = result.getMetaData();



              System.out.println("\n**");

              // The column names are displayed

              for(int i = 1; i <= resultMeta.getColumnCount(); i++)

                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t*");



              System.out.println("\n**");



              while(result.next()){

                for(int i = 1; i <= resultMeta.getColumnCount(); i++)

                  System.out.print("\t" + result.getObject(i).toString() + "\t |");



                System.out.println("\n---------------------------------");


              }


              result.close();

              state.close();

            } catch (Exception e) {

              e.printStackTrace();

            }

          }

}