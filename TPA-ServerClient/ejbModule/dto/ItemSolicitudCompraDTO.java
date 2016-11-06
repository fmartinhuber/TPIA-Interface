package dto;


import java.io.Serializable;

public class ItemSolicitudCompraDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idItemSolicitudCompra;
	private ArticuloDTO articulo;	
	private Integer cantidad;
	
	// Constructor
	
	public ItemSolicitudCompraDTO() {}

	public Integer getIdItemSolicitudCompra() {
		return idItemSolicitudCompra;
	}

	public void setIdItemSolicitudCompra(Integer idItemSolicitudCompra) {
		this.idItemSolicitudCompra = idItemSolicitudCompra;
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
