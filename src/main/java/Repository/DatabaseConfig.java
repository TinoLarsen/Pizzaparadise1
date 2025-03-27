package Repository;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import java.sql.*;
@Configuration
public class DatabaseConfig {

    @Bean
        public DataSource dataSource() {
                DriverManagerDataSource ds = new DriverManagerDataSource();
                ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
                ds.setUrl("jdbc:mysql://localhost:3306/PizzaDB");
                ds.setUsername("root");
                ds.setPassword("root");
                return ds;
        }

}
