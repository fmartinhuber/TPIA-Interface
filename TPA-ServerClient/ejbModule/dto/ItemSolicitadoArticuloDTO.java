package dto;

import java.io.Serializable;
import java.util.List;


//Daro: Este Bean relaciona el articulo con la cantidad solicitada

public class ItemSolicitadoArticuloDTO implements Serializable{
	private Integer idItemSolicitadoArticulo;
	private ArticuloDTO articulo;
	private SolicitudArticuloDTO solicitudArticulo;
	private Integer cantidad;
	
	
	
	public ItemSolicitadoArticuloDTO(ArticuloDTO articulo, SolicitudArticuloDTO solicitudArticulo,
			Integer cantidad) {
		super();
		this.articulo = articulo;
		this.solicitudArticulo = solicitudArticulo;
		this.cantidad = cantidad;
	}

	public ItemSolicitadoArticuloDTO() {
		super();
	}
	
	

	public Integer getIdItemSolicitadoArticulo() {
		return idItemSolicitadoArticulo;
	}

	public void setIdItemSolicitadoArticulo(Integer idItemSolicitadoArticulo) {
		this.idItemSolicitadoArticulo = idItemSolicitadoArticulo;
	}

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
