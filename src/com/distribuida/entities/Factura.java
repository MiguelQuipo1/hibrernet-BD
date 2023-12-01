package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	private int idFactura;
	private String numFactura;
	private String fecha;
	private double totalNeto;
	private double iva;
	private double total;
	
	@Autowired
	private Cliente cliente;
	
	public Factura () {}
	
	public Factura (Cliente cliente) {
		this.cliente=cliente;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}

	
}
