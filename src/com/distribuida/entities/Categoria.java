package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Categoria {

	private int idCategoria;
	private String Categoria;
	private String Descripcion;
	
	public Categoria() {}
	
	
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", Categoria=" + Categoria + "]";
	}
	
	
}
