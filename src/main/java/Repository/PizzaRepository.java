package Repository;
import Domain.PizzaType;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;

import java.util.List;

@Repository
public class PizzaRepository {
    private JdbcTemplate jdbcTemplate;

    public PizzaRepository(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}


    public PizzaType save(PizzaType pizzaType) {
        String sql = "INSERT INTO PizzaType (int id, String topping, Boolean familySize, Boolean vegetarian, String size, int price, String description, String nameOfPizza) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, pizzaType.getId(), pizzaType.getTopping(), pizzaType.getFamily(), pizzaType.getVegetarian(), pizzaType.getSize(), pizzaType.getPrice(), pizzaType.getDescription(), pizzaType.getNameOfPizza());
        return pizzaType;
    }

    public void update(PizzaType pizzaType) {
        String sql = "UPDATE PizzaType SET topping=?, familySize=?, vegetarian=?, size=?, price=?, description=?, nameOfPizza=?, WHERE id=? ";
        jdbcTemplate.update(sql, pizzaType.getId(), pizzaType.getTopping(), pizzaType.getFamily(), pizzaType.getVegetarian(), pizzaType.getSize(), pizzaType.getPrice(), pizzaType.getDescription(), pizzaType.getNameOfPizza());
    }
    public void deleteById(int id) {
        String sql = "DELETE FROM PizzaType WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
    public PizzaType findById(int id) {
        String sql = "SELECT * FROM PizzaType WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(PizzaType.class), id);
    }
    public List<PizzaType> findAll() {
        String sql = "SELECT * FROM PizzaType";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(PizzaType.class));
    }

}
