package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;


public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AutorDAO autorDAO= context.getBean("autorDAOImpl",AutorDAO.class);
		List<Autor> autores = autorDAO.findAll();
		
		System.out.println(autores.toString());
		for (Autor autor : autores) {
			System.out.println(autor.toString());
		}
		
	context.close();
	
	}

}
