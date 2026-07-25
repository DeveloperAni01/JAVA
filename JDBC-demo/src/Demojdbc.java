import java.sql.*; //import package



public class Demojdbc {
    static void main(String[] args) {
        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute statements
        * process and results
        * close
        * */

        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "postgres123";

        try {
            //load & register
            Class.forName("org.postgresql.Driver"); //optional --> without this line the connection also can be established!

            //create connection
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Establish!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
