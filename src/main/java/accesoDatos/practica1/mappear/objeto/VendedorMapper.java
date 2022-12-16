package accesoDatos.practica1.mappear.objeto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import accesoDatos.practica1.objeto.Vendedor;

public class VendedorMapper implements RowMapper<Vendedor> {
	@Override
	public Vendedor mapRow(ResultSet rs, int i) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setId(rs.getInt("id"));
		vendedor.setNombre(rs.getString("nombre"));
		vendedor.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		vendedor.setSalario(rs.getInt("salario"));
		return vendedor;
	}
}
