package com.ecodeup.controler;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ecodeup.model.Cliente;

@ManagedBean(name="clienteBean")
@RequestScoped
public class ClienteBean {
	
	public List<Cliente> obtenerClientes(){
		List<Cliente> listaClientes = new ArrayList<>(); 
		Cliente clienteA = new Cliente();
		clienteA.setId_cliente(1);
		clienteA.setNombre("Sergio");
		clienteA.setApellido("Villalba");
		clienteA.setDireccion("Calle 63");
		
		Cliente clienteb = new Cliente();
		clienteb.setId_cliente(2);
		clienteb.setNombre("Sergio 2");
		clienteb.setApellido("Villalba2");
		clienteb.setDireccion("Calle63");
		
		listaClientes.add(clienteA);
		listaClientes.add(clienteb);
		return listaClientes;
	}

}
