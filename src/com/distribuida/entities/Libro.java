package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Libro {
	
	private int idLibro;
	private String titulo;
	private String editorial;
	private int numPaginas;
	private int edicion;
	private String idioma;
	private String fechaPublicacion;
	private String descripcion;
	private String tipoPasta;
	private String ISBN;
	private int numEjemplares;
	private String portada;
	private String presentacion;
	private double precio;
	
	@Autowired
	private Autor autor;
	@Autowired
	private Categoria categoria;
	
	public Libro() {}
	

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPasta() {
		return tipoPasta;
	}

	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion=" + fechaPublicacion
				+ ", descripcion=" + descripcion + ", tipoPasta=" + tipoPasta + ", ISBN=" + ISBN + ", numEjemplares="
				+ numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", autor=" + autor + ", categoria=" + categoria + "]";
	}


	
}
