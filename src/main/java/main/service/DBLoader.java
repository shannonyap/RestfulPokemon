package main.service;

public class DBLoader {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://x3ztd854gaa7on6s.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/ledxbd5av0vi3m0g";

    //  Database credentials
    static final String USER = "p01o3zrbxoctcyue";
    static final String PASS = "ff0a26jami6dwosa";

    public DBLoader() {
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            //STEP 2: Register JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            stmt = conn.createStatement();
//
//            String sql = "SELECT * FROM pokemon";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                //Retrieve by column name
//                int id  = rs.getInt("id");
//
//                //Display values
//                System.out.print("ID: " + id);
//            }
//            rs.close();
//        } catch (Exception e) {
//
//        }
    }

}
