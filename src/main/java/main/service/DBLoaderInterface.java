package main.service;

import java.util.List;

public interface DBLoaderInterface {
    public void executeDBStatement(List<Object> list, String sqlStatement);
}
