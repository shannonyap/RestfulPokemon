package main.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DBLoader implements DBLoaderInterface {

    private PokemonCreator creator;

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pokemon";//"jdbc:mysql://otwsl2e23jrxcqvx.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/qoku3xkesuvipcpp";

    //  Database credentials
    static final String USER = "root"; //jbehzwu2oe6w5h7p
    static final String PASS = "root"; //sx44hhkjc7lkfvx3

    public Connection connection = null;


    public DBLoader() {
        this.creator = new PokemonCreator();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void executeDBStatement(List<Object> list, String sqlStatement) {
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlStatement);
            while(resultSet.next()){
                list.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

