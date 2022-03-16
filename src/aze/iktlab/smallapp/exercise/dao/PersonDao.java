package aze.iktlab.smallapp.exercise.dao;

import aze.iktlab.smallapp.exercise.model.Person;
import aze.iktlab.smallapp.exercise.util.AppSqlQuerry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDao {
    private static final String url  = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String pass = "00000000";
    public boolean save(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement statement = connection.createStatement();

        try {
            boolean flag = statement.execute(AppSqlQuerry.insertPerson(person));
            return flag? true: false;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }
}
