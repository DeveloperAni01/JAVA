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
        //query
        String query = "select * from student";

        try {
            //load & register
            Class.forName("org.postgresql.Driver"); //optional --> without this line the connection also can be established!

            //create connection
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Establish!");

            //create statement
             Statement st = con.createStatement();

             //execute statement
            ResultSet data = st.executeQuery(query);
           while(data.next()){
               System.out.print(data.getInt("sid") + "-");
               System.out.print(data.getString("sname") + "-");
               System.out.println(data.getInt("marks"));
           }

            //close the connection
            con.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
