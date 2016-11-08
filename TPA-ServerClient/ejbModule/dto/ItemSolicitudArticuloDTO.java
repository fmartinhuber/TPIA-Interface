package dto;

import java.io.Serializable;
import java.util.List;

//Daro: Este Bean relaciona el articulo con la cantidad solicitada

public class ItemSolicitudArticuloDTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private ArticuloDTO articulo;
	private Integer cantidad;
	
	// Constructor
	
	public ItemSolicitudArticuloDTO() {}
	

	public ItemSolicitudArticuloDTO(ArticuloDTO articulo, Integer cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
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
