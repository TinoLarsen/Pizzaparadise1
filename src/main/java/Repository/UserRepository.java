package Repository;
import Domain.User;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}


    public User save (User user ) {
        String sql = "INSERT INTO User (id, name, address, email, bonus) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getId(), user.getEmail(), user.getAddress(), user.getName(), user.getBonus());
        return user;
    }
    public void update (User user ) {
        String sql ="UPDATE User SET name=?,address=?,eamil=?,bonus=? WHERE id=?";
        jdbcTemplate.update(sql, user.getId(), user.getName(), user.getEmail(), user.getAddress(), user.getBonus());
    }

    public void deletebyid (int id ){
        String sql = "DELETE FROM User WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
    public User findById (int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }
    public List<User> findAll() {
        String sql = "SELECT * FROM User";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
}
