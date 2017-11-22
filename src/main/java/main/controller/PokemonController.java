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
        this.creator = new PokemonCreator();
        this.dbLoader = new DBLoader(creator);
    }

    @RequestMapping("/pokemon")
    @ResponseBody
    public ResponseEntity<List<Pokemon>> listAllPokemon () {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon");
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Pokemon> getPokemonById (@PathVariable("id") int id) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where id = " + id);
        return new ResponseEntity<Pokemon>((Pokemon) pokemonList.get(0), HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Pokemon> getPokemonByName (@PathVariable("name") String name) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where name = \"" + name + "\"");
        return new ResponseEntity<Pokemon>((Pokemon) pokemonList.get(0), HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/type1/{type1}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByType1 (@PathVariable("type1") String Type1) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where Type1 = \"" + Type1 + "\"");
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/type2/{type2}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByType2 (@PathVariable("type2") String type2) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where Type2 = \"" + type2 + "\"");
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/total/{total}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByTotal (@PathVariable("total") int total) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where total = " + total);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/hp/{hp}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByHP (@PathVariable("hp") int hp) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where hp = " + hp);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/attack/{attack}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByAttack (@PathVariable("attack") int attack) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where attack = " + attack);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/defense/{defense}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByDefense (@PathVariable("defense") int defense) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where defense = " + defense);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/specialAttack/{specialAttack}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpecialAttack (@PathVariable("specialAttack") int specialAttack) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where specialAttack = " + specialAttack);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/specialDefense/{specialDefense}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpecialDefense (@PathVariable("specialDefense") int specialDefense) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where specialDefense = " + specialDefense);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/speed/{speed}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonBySpeed (@PathVariable("speed") int speed) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where speed = " + speed);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/generation/{generation}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByGeneration (@PathVariable("generation") int generation) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where Generation = " + generation);
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }

    @RequestMapping(value = "/pokemon/legendary/{legendary}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Pokemon>> getPokemonByLegendary (@PathVariable("legendary") boolean legendary) {
        List pokemonList = new ArrayList<Pokemon>();
        this.dbLoader.executeDBStatement(pokemonList, "SELECT * FROM pokemon where Legendary = \"" + legendary + "\"");
        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
    }
}
