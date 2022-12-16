package accesoDatos.practica1.serviceI;

import java.util.List;
import accesoDatos.practica1.objeto.Vendedor;

public interface VendedorServiceI {
	List<Vendedor> getVendedores();

	Vendedor getVendedor(int id);

	int newVendedor(Vendedor vendedor);

	int updateVendedor(Vendedor vendedor);

	int deleteVendedor(int id);
}
