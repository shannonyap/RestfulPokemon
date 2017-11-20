package main.controller;

import main.domain.Pokemon;
import main.service.DBLoader;
import main.service.PokemonCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {
    private DBLoader dbLoader;
    private PokemonCreator creator;

    public PokemonController() {
        this.dbLoader = new DBLoader();
        this.creator = new PokemonCreator();
    }

    @RequestMapping("/pokemon")
    @ResponseBody
    public ResponseEntity<List<Pokemon>> listAllPokemon () {
        List pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping("/pokemon/totalNumber")
    @ResponseBody
    public ResponseEntity<Integer> listNumberOfPokemon () {
        int count = 0;
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT COUNT(*) FROM pokemon";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                count = resultSet.getInt("COUNT(*)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Integer>(count, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Pokemon> getPokemonById (@PathVariable("id") int id) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where id = " + id;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Pokemon>(pokemonList.get(0), HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Pokemon> getPokemonByName (@PathVariable("name") String name) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where name = " + name;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Pokemon>(pokemonList.get(0), HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/type1/{type1}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByType1 (@PathVariable("type1") String Type1) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where type1 = " + Type1;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/type2/{type2}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByType2 (@PathVariable("type2") String type2) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where type2 = " + type2;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/total/{total}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByTotal (@PathVariable("total") int total) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where total = " + total;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/hp/{hp}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByHP (@PathVariable("hp") int hp) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where hp = " + hp;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/attack/{attack}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByAttack (@PathVariable("attack") int attack) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where attack = " + attack;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/defense/{defense}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByDefense (@PathVariable("defense") int defense) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where defense = " + defense;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/specialAttack/{specialAttack}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpecialAttack (@PathVariable("specialAttack") int specialAttack) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where specialAttack = " + specialAttack;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/specialDefense/{specialDefense}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpecialDefense (@PathVariable("specialDefense") int specialDefense) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where specialDefense = " + specialDefense;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/speed/{speed}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpeed (@PathVariable("speed") int speed) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where speed = " + speed;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/generation/{generation}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByGeneration (@PathVariable("generation") int generation) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where generation = " + generation;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/legendary/{legendary}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByLegendary (@PathVariable("legendary") boolean legendary) {
        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        try {
            Statement statement = dbLoader.connection.createStatement();
            String sql = "SELECT * FROM pokemon where legendary = " + legendary;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                pokemonList.add(creator.createPokemon(resultSet));
            }
            resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }
}
