package dao;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate conexaoDoBanco;
    public Conexao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("mydb");
        dataSource.setUser("JavaUser");
        dataSource.setPassword("Java2@23");

        conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }
}
