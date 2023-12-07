package dao;

import model.ComputadorModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ComputadorDao {
    private JdbcTemplate con;
    private Conexao conexao;

    public ComputadorDao() {
        this.conexao = new Conexao();
        this.con = conexao.getConexaoDoBanco();
    }

    public List<ComputadorModel> pegarComputadores(){
        return con.query(
                "SELECT * FROM Computador;",
                new BeanPropertyRowMapper<>(ComputadorModel.class));
    }

    public List<ComputadorModel> pegarComputadoresPorId(int id){
        return con.query(
                "SELECT * FROM Computador WHERE idComputador = ?;",
                new BeanPropertyRowMapper<>(ComputadorModel.class), id);
    }

}
