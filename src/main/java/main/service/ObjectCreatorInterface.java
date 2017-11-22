package main.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ObjectCreatorInterface {
    Object createDatabaseObject(ResultSet resultSet) throws SQLException;
}
