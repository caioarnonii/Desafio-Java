package dao;

import utils.ComponentesRowMapper;
import model.ComponenteModel;
import org.springframework.jdbc.core.JdbcTemplate;

public class RegistroDAO {
    private JdbcTemplate con;
    private Conexao conexao;

    public RegistroDAO() {
        this.conexao = new Conexao();
        this.con = conexao.getConexaoDoBanco();
    }

    public int cadastrarRegistro(ComponenteModel componenteModel){
        return con.update(
                "INSERT INTO Registro (dadoRegistro, fkComponente) VALUES (?, ?);",
               componenteModel.getMonitoramento(), componenteModel.getIdComponente());
    }
}
