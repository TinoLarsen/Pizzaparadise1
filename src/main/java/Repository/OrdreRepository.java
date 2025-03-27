package Repository;

import Domain.Ordre;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;

import java.util.List;

@Repository
public class OrdreRepository {


private JdbcTemplate jdbcTemplate;

public OrdreRepository(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}


public Ordre save (Ordre ordre ) {
    String sql = "INSERT INTO User (id, date, nameOfPizza, sumPrice) VALUES (?,?,?,?)";
    jdbcTemplate.update(sql, ordre.getId(), ordre.getDate(), ordre.getNameOfPizza(), ordre.getSum());
    return ordre;
}
public void update (Ordre ordre ) {
    String sql ="UPDATE User SET date=?,nameOfPizza=?,sumPrice=?, WHERE id=?";
    jdbcTemplate.update(sql, ordre.getId(), ordre.getDate(), ordre.getNameOfPizza(), ordre.getSum());
}

public void deleteById (int id ){
    String sql = "DELETE FROM User WHERE id=?";
    jdbcTemplate.update(sql, id);
}
public Ordre findById (int id) {
    String sql = "SELECT * FROM user WHERE id=?";
    return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Ordre.class), id);
}
public List<Ordre> findAll() {
    String sql = "SELECT * FROM User";
    return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>( Ordre.class));
}
}