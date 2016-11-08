package dto;

import java.io.Serializable;
import java.util.List;

//Daro: Este Bean relaciona el articulo con la cantidad solicitada

public class ItemSolicitadoArticuloDTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private ArticuloDTO articulo;
	private SolicitudArticuloDTO solicitudArticulo;
	private Integer cantidad;
	
	// Constructor
	
	public ItemSolicitadoArticuloDTO() {}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public SolicitudArticuloDTO getSolicitudArticulo() {
		return solicitudArticulo;
	}

	public void setSolicitudArticulo(SolicitudArticuloDTO solicitudArticulo) {
		this.solicitudArticulo = solicitudArticulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}	

}
