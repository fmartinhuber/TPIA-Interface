package dto;

import java.io.Serializable;


public class ItemRecepcionCompraDTO implements Serializable{

	private Integer idItemRecepcionCompra;
	private ArticuloDTO articulo;
	private Integer cantidad;
	
	public ItemRecepcionCompraDTO(ArticuloDTO articulo, Integer cantidad) {
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public ItemRecepcionCompraDTO() {
		
	}

	public Integer getIdItemRecepcionCompra() {
		return idItemRecepcionCompra;
	}

	public void setIdItemRecepcionCompra(Integer idItemRecepcionCompra) {
		this.idItemRecepcionCompra = idItemRecepcionCompra;
	}

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