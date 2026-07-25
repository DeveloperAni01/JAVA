import java.sql.*;

public class DemoCrud {
    static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "postgres123";

        int sid = 10;
        String sname = "Anu";
        int marks = 100;

        String sql = "insert into student values (?, ?, ?)";
        String sql1 = "update student set marks = 75 where sid = 3";
        String query = "delete from student where sid = 3";

        try {
            //create connection
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Database connected!");

            //create statement
//             Statement st = con.createStatement();
            PreparedStatement pst =  con.prepareStatement(sql);
            pst.setInt(1,sid);
            pst.setString(2,sname);
            pst.setInt(3,marks);

            pst.execute();

//             boolean status =  st.execute(query);
//            System.out.println(status);


            con.close();
//           ResultSet res = st.executeQuery(sql);
//           res.next();
//            String name = res.getString("sname");
//            System.out.println(name);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
