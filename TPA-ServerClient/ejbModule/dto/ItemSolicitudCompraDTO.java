package dto;


import java.io.Serializable;


public class ItemSolicitudCompraDTO implements Serializable{

	private Integer ItemSolicitudCompra;
	private ArticuloDTO articulo;
	private Integer cantidad;
	
	
	
	public ItemSolicitudCompraDTO(ArticuloDTO articulo, Integer cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	public ItemSolicitudCompraDTO() {
		super();
	}

	
	
	public Integer getItemSolicitudCompra() {
		return ItemSolicitudCompra;
	}

	public void setItemSolicitudCompra(Integer itemSolicitudCompra) {
		ItemSolicitudCompra = itemSolicitudCompra;
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
