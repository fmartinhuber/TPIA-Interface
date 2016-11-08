package dto;

import java.io.Serializable;

public class MovimientoStockDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArticuloDTO articulo;
	private String tipoMovimiento; 
	private Integer cantidad;
	
	// Constructor
	
	public MovimientoStockDTO() {}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}

