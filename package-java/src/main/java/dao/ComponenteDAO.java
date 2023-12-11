package dao;

import utils.ComponentesRowMapper;
import model.ComponenteModel;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ComponenteDAO {
    private JdbcTemplate con;
    private Conexao conexao;

    public ComponenteDAO() {
        this.conexao = new Conexao();
        this.con = conexao.getConexaoDoBanco();
    }

    public List<ComponenteModel> listarComponentes(){
        return con.query(
                "SELECT * FROM Componente INNER JOIN UnidadeMedida ON fkUnidadeMedida = idUnidadeMedida;",
                new ComponentesRowMapper());
    }

}
