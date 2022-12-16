package accesoDatos.practica1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import accesoDatos.practica1.daoI.VendedorDAOI;
import accesoDatos.practica1.mappear.objeto.VendedorMapper;
import accesoDatos.practica1.objeto.Vendedor;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class VendedorDAO implements VendedorDAOI {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Vendedor> getVendedores() {
		String sql = "SELECT * FROM vendedores";
		List<Vendedor> vendedores = new ArrayList<>();
		vendedores.addAll(jdbcTemplate.query(sql, new BeanPropertyRowMapper<Vendedor>(Vendedor.class)));
		return vendedores;
	}

	@Override
	public Vendedor getVendedor(int id) {
		String sql = "SELECT * FROM vendedores WHERE ID = ?";
		Vendedor vendedor;
		vendedor = (Vendedor) jdbcTemplate.queryForObject(sql, new VendedorMapper(), id);
		return vendedor;
	}

	@Override
	public int newVendedor(Vendedor vendedor) {
		String sql = "INSERT INTO `vendedores`(`id`, `nombre`, `fecha_ingreso`, `salario`) VALUES (?,?,?,?)";
		return jdbcTemplate.update(sql, vendedor.getId(), vendedor.getNombre(), vendedor.getFecha_ingreso(),
				vendedor.getSalario());
	}

	@Override
	public int updateVendedor(Vendedor vendedor) {
		String sql = "UPDATE vendedores SET nombre = ?,salario = ? WHERE id = ?";
		return jdbcTemplate.update(sql, vendedor.getNombre(), vendedor.getSalario(),
				vendedor.getId());
	}

	@Override
	public int deleteVendedor(int id) {
		String sql = "DELETE FROM vendedores WHERE ID = ?";
		return jdbcTemplate.update(sql, id);
	}

}
