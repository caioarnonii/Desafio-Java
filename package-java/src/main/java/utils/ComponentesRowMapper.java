package utils;

import model.ComponenteModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComponentesRowMapper implements RowMapper<ComponenteModel> {
    @Override
    public ComponenteModel mapRow(ResultSet resultSet, int i) throws SQLException {

        int idComponente = resultSet.getInt("idComponente");
        String nomeComponente = resultSet.getString("nomeComponente");
        String unMedida = resultSet.getString("tipoMedida");

        ComponenteModel componente = ComponenteEnum.valueOf(nomeComponente).getComponenteModel();

        componente.setIdComponente(idComponente);
        componente.setUnMedida(unMedida);
        componente.setNome(nomeComponente);

        return componente;
    }
}
