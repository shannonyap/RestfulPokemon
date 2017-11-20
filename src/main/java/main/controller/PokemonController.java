package main.controller;

import main.service.DBLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    private DBLoader dbLoader;

    public PokemonController() {
        this.dbLoader = new DBLoader();
    }

    @RequestMapping("/pokemon")
    @ResponseBody
    public String hell() {
        return "FFFFF";
    }
//    @RequestMapping("/pokemon")
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> listAllPokemon () {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = new ArrayList<Pokemon>();
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "from Pokemon";
//            Query query = session.createQuery(hql);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping("/pokemon/totalNumber")
//    @ResponseBody
//    public ResponseEntity<Integer> listNumberOfPokemon () {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = new ArrayList<Pokemon>();
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "from Pokemon";
//            Query query = session.createQuery(hql);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<Integer>(pokemonList.size(), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/id/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<Pokemon> getPokemonById (@PathVariable("id") int id) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        Pokemon pokemon = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.id = :id";
//            Query query = session.createQuery(hql);
//            query.setParameter("id", id);
//            pokemon = (Pokemon)query.list().get(0);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<Pokemon>(pokemon, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/name/{name}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<Pokemon> getPokemonByName (@PathVariable("name") String name) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        Pokemon pokemon = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.name = :name";
//            Query query = session.createQuery(hql);
//            query.setParameter("name", name);
//            pokemon = (Pokemon)query.list().get(0);
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<Pokemon>(pokemon, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/type1/{type1}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByType1 (@PathVariable("type1") String Type1) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.type1 = :type1";
//            Query query = session.createQuery(hql);
//            query.setParameter("type1", Type1);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/type2/{type2}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByType2 (@PathVariable("type2") String type2) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.type2 = :type2";
//            Query query = session.createQuery(hql);
//            query.setParameter("type2", type2);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/total/{total}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByTotal (@PathVariable("total") int total) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.total = :total";
//            Query query = session.createQuery(hql);
//            query.setParameter("total", total);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/hp/{hp}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByHP (@PathVariable("hp") int hp) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.hp = :hp";
//            Query query = session.createQuery(hql);
//            query.setParameter("hp", hp);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/attack/{attack}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByAttack (@PathVariable("attack") int attack) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.attack = :attack";
//            Query query = session.createQuery(hql);
//            query.setParameter("attack", attack);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/defense/{defense}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByDefense (@PathVariable("defense") int defense) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.defense = :defense";
//            Query query = session.createQuery(hql);
//            query.setParameter("defense", defense);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/specialAttack/{specialAttack}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonBySpecialAttack (@PathVariable("specialAttack") int specialAttack) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.specialAttack = :specialAttack";
//            Query query = session.createQuery(hql);
//            query.setParameter("specialAttack", specialAttack);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/specialDefense/{specialDefense}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonBySpecialDefense (@PathVariable("specialDefense") int specialDefense) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.specialDefense = :specialDefense";
//            Query query = session.createQuery(hql);
//            query.setParameter("specialDefense", specialDefense);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/speed/{speed}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonBySpeed (@PathVariable("speed") int speed) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.speed = :speed";
//            Query query = session.createQuery(hql);
//            query.setParameter("speed", speed);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/generation/{generation}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByGeneration (@PathVariable("generation") int generation) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.generation = :generation";
//            Query query = session.createQuery(hql);
//            query.setParameter("generation", generation);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/pokemon/legendary/{legendary}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<List<Pokemon>> getPokemonByLegendary (@PathVariable("legendary") boolean legendary) {
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        List pokemonList = null;
//
//        try {
//            tx = session.beginTransaction();
//            String hql = "FROM Pokemon p WHERE p.legendary = :legendary";
//            Query query = session.createQuery(hql);
//            query.setParameter("legendary", legendary);
//            pokemonList = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return new ResponseEntity<List<Pokemon>>(pokemonList, HttpStatus.OK);
//    }
}
