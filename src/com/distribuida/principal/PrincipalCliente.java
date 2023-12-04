package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClienteDAO clienteDAO= context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		//CRUD
		//findAll
		//List<Cliente> clientes = clienteDAO.finAll();
		
		//findOne 
		//Cliente cliente = clienteDAO.findOne(3);
		
		//add
		//Cliente cliente1 = new Cliente(0,"17521469222","Nombre","Apellido","Direccioxd","654654654","ijjdjd@nfdd.cs");
		//clienteDAO.add(cliente1);
		
		//Update
		//Cliente cliente2 = new Cliente(39,"1752146922","Manuel","Maju","Direccio X","0954654654","paleta54@hotchanell.com");
		//clienteDAO.up(cliente2);
		
		//Delete
		clienteDAO.del(39);
		
		
//		System.out.println(clientes.toString());
//		for (Cliente cliente : clientes) {
//			System.out.println(cliente.toString());
//		}
	context.close();
	}

}
