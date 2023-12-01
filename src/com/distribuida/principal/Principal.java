package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Factura factura = context.getBean("factura",Factura.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Libro libro = context.getBean("libro",Libro.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Autor autor = context.getBean("autor",Autor.class);
		DatosEmpresa datosEmpresa= context.getBean("datosEmpresa", DatosEmpresa.class);
		
		//CLIENTE
		cliente.setIdCliente(1);
		cliente.setCedula("1725793589");
		cliente.setNombre("Manuel");
		cliente.setApellido("Jerla");
		cliente.setDireccion("Quito, Calderon Av. 023");
		cliente.setTelefono("0985427854");
		cliente.setCorreo("manu.je@correo.com");
		
		//FACTURA
		factura.setIdFactura(1);
		factura.setNumFactura("N.0001");
		factura.setFecha("23/11/2023");
		factura.setTotalNeto(5.6);
		factura.setIva(1.12);
		factura.setTotal(factura.getTotalNeto()*factura.getIva());
		
		//LIBRO
		libro.setIdLibro(1);
		libro.setTitulo("Ingenieria del Software Un Enfoque Practico");
		libro.setEditorial("DERECHOS RESERVADOS © 2010, 2005, 2002 respecto a la tercera edición en español por\r\n"
				+ "McGRAW-HILL INTERAMERICANA EDITORES, S.A. DE C.V");
		libro.setNumPaginas(810);
		libro.setEdicion(7);
		libro.setIdioma("Version Español");
		libro.setFechaPublicacion("2010");
		libro.setDescripcion("Refiere su contenido a la calidad del software.");
		libro.setTipoPasta("EnPastado");
		libro.setISBN("9786071503145");
		libro.setNumEjemplares(30);
		libro.setPortada("Capa Carton");
		libro.setPresentacion("el software de computadora triunfa (al satisfacer las necesidades de las personas \r\n"
				+ "que lo usan, trabajar sin fallos durante largos periodos, será fácil de modificar e incluso \r\n"
				+ "más fácil de usar) puede y debe cambiar las cosas a fin de mejorar.");
		libro.setPrecio(5.6);
		
		
		//CATEGORIA
		categoria.setIdCategoria(1);
		categoria.setCategoria("Software");
		categoria.setDescripcion("La calidad del Software");
		
		//AUTOR
		autor.setIdAutor(1);
		autor.setNombre("Roger S.");
		autor.setApellido("Pressman");
		autor.setPais("Estados Unidos");
		autor.setDireccion("N/A");
		autor.setTelefono("337597-7");
		autor.setCorreo("N/A");
		
		
		//IMPRIMIR
		System.out.println(datosEmpresa.toString());
		System.out.println(autor.toString());
		System.out.println(categoria.toString());
		System.out.println(libro.toString());
		System.out.println(factura.toString());
		System.out.println(cliente.toString());
		System.out.println(detalleFactura.toString());
		
		context.close();
	}

}
