package com.ecodeup.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecodeup.model.Cliente;
import com.ecodeup.model.JPAConnection;

public class clienteDAO {
	
	EntityManager entity = JPAConnection.getEntityFactory().createEntityManager();
	
	//PERSISTE EN LA BASE DE DATOS UN OBJETO CLIENTE
	public void insertar(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();
		JPAConnection.close();
	}
	
	public void editar(Cliente cliente) {
		entity.getTransaction().begin();
		entity.merge(cliente);
		entity.getTransaction().commit();
		JPAConnection.close();
	}
	
	public Cliente findCliente(int id_cliente) {
		Cliente cliente = new Cliente();
		cliente = entity.find(Cliente.class, id_cliente);
		JPAConnection.close();
		return cliente;
	}
	
	public List<Cliente> findClientes(){
		List<Cliente> listaClientes = new ArrayList<>(); 
		Query query=entity.createQuery("SELECT cliente FROM CLIENTE cliente");		
		listaClientes=query.getResultList();
		return listaClientes;
	}
}
