package main.service;

import main.domain.Pokemon;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PokemonCreator implements ObjectCreatorInterface {
    @Override
    public Object createDatabaseObject(ResultSet resultSet) throws SQLException {
        Pokemon p = new Pokemon();
        p.setId(resultSet.getInt("id"));
        p.setName(resultSet.getString("name"));
        p.setType1(resultSet.getString("type1"));
        p.setType1(resultSet.getString("type2"));
        p.setTotal(resultSet.getInt("total"));
        p.setHp(resultSet.getInt("hp"));
        p.setAttack(resultSet.getInt("attack"));
        p.setDefense(resultSet.getInt("defense"));
        p.setSpecialAttack(resultSet.getInt("specialAttack"));
        p.setSpecialDefense(resultSet.getInt("specialDefense"));
        p.setSpeed(resultSet.getInt("speed"));
        p.setGeneration(resultSet.getInt("generation"));
        p.setLegendary(resultSet.getBoolean("legendary"));
        return p;
    }
}

