package accesoDatos.practica1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import accesoDatos.practica1.daoI.VendedorDAOI;
import accesoDatos.practica1.objeto.Vendedor;
import accesoDatos.practica1.serviceI.VendedorServiceI;

@Repository
public class VendedorService implements VendedorServiceI {
	@Autowired
	VendedorDAOI vendedorDAO;
	
	@Override
	public List<Vendedor> getVendedores() {
		return vendedorDAO.getVendedores();
	}

	@Override
	public Vendedor getVendedor(int id) {
		return vendedorDAO.getVendedor(id);
	}

	@Override
	public int newVendedor(Vendedor vendedor) {
		return vendedorDAO.newVendedor(vendedor);
	}

	@Override
	public int updateVendedor(Vendedor vendedor) {
		return vendedorDAO.updateVendedor(vendedor);
	}

	@Override
	public int deleteVendedor(int id) {
		return vendedorDAO.deleteVendedor(id);
	}

}
