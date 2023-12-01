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
		
		List<Cliente> clientes = clienteDAO.finAll();
		
		//System.out.println(clientes.toString());
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
		context.close();
	}

}
