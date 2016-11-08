package dto;

import java.io.Serializable;

public class ItemRecepcionCompraDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArticuloDTO articulo;
	private Integer cantidad;
	
	// Constructor

	public ItemRecepcionCompraDTO() {}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}