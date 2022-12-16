package accesoDatos.practica1.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesoDatos.practica1.objeto.Vendedor;
import accesoDatos.practica1.serviceI.VendedorServiceI;

@RestController
@RequestMapping(path = "/mochonSL")
public class VendedorController {
	@Autowired
	VendedorServiceI vendedorService;

	@GetMapping("/vendedores")
	public List<Vendedor> vendedores() {
		return vendedorService.getVendedores();
	}

	@GetMapping("/vendedor/{id}")
	public Vendedor vendedor(@PathVariable(value = "id") int id) {
		return vendedorService.getVendedor(id);
	}

	@PostMapping("/vendedor")
	public int newVendedor(@RequestBody Vendedor vendedor) {
		Date fechaActual = new Date(0);
		vendedor.setFecha_ingreso(fechaActual);
		
		System.out.println(vendedor.getFecha_ingreso());
		return vendedorService.newVendedor(vendedor);
	}

	@PutMapping("/vendedor/{id}")
	public int updateVendedor(@RequestBody Vendedor vendedor, @PathVariable(value = "id") int id) {
		vendedor.setId(id);
		return vendedorService.updateVendedor(vendedor);
	}

	@DeleteMapping("/vendedor/{id}")
	public int deleteVendedor(@PathVariable(value = "id") int id) {
		return vendedorService.deleteVendedor(id);
	}
}
