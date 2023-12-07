package dao;

import model.UsuarioModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private JdbcTemplate con;
    private Conexao conexao = new Conexao();
    private List<UsuarioModel> usuarios;

    public UsuarioDao(){
        this.con = conexao.getConexaoDoBanco();
        this.usuarios = new ArrayList<>();
    }

    public List<UsuarioModel> buscarUsuario(String email){

        usuarios = (con.query(
                "SELECT * FROM Usuario WHERE email= ?",
                new BeanPropertyRowMapper<>(UsuarioModel.class), email));

        return usuarios;
    }

    public void cadastrarUsuario(String nome, String email, String senha) {
        con.update("INSERT INTO Usuario (nome, email, senha) VALUES (?, ?, ?)",nome,
                email, senha);
    }

}
