package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetalleFactura {
	
	private int idDetalleFactura;
	private int cantidad;
	private double subTotal;
	
	@Autowired
	private Factura factura;
	@Autowired
	private Libro libro;

	public DetalleFactura() {}
	

	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
}
