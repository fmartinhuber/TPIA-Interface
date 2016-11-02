package dto;

import java.io.Serializable;

public class MovimientoStockDTO implements Serializable{

	private Integer idMovimientoStock;
	private ArticuloDTO articulo;
	private String tipoMovimiento; // Ingreso o Egreso del stock
	private Integer cantidad;
	
	
	
	public MovimientoStockDTO(ArticuloDTO articulo, String tipoMovimiento, Integer cantidad) {
		super();
		this.articulo = articulo;
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
	}

	public MovimientoStockDTO() {
		super();
	}
	
	

	public Integer getIdMovimientoStock() {
		return idMovimientoStock;
	}

	public void setIdMovimientoStock(Integer idMovimientoStock) {
		this.idMovimientoStock = idMovimientoStock;
	}

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
