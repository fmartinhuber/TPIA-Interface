package dto;

import java.io.Serializable;
import java.util.*;

public class SolicitudCompraDTO implements Serializable{
	private Integer idSolicitudCompra;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	private List<SolicitudArticuloDTO> solicitudesArticulos;
	private List<ItemSolicitudCompraDTO> solicitudesCompra;
	private Boolean pendiente; // (Recien enviada a fabrica = FALSE - Devuelta por fabrica = TRUE)
	
	
	
	public SolicitudCompraDTO(String codigo, List<SolicitudArticuloDTO> solicitudesArticulos,
			List<ItemSolicitudCompraDTO> solicitudesCompra, Boolean pendiente) {
		super();
		this.codigo = codigo;
		this.solicitudesArticulos = solicitudesArticulos;
		this.solicitudesCompra = solicitudesCompra;
		this.pendiente = pendiente;
	}

	public SolicitudCompraDTO() {
		super();
	}

	
	
	public Integer getIdSolicitudCompra() {
		return idSolicitudCompra;
	}

	public void setIdSolicitudCompra(Integer idSolicitudCompra) {
		this.idSolicitudCompra = idSolicitudCompra;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<SolicitudArticuloDTO> getSolicitudesArticulos() {
		return solicitudesArticulos;
	}

	public void setSolicitudesArticulos(List<SolicitudArticuloDTO> solicitudesArticulos) {
		this.solicitudesArticulos = solicitudesArticulos;
	}

	public List<ItemSolicitudCompraDTO> getSolicitudesCompra() {
		return solicitudesCompra;
	}

	public void setSolicitudesCompra(List<ItemSolicitudCompraDTO> solicitudesCompra) {
		this.solicitudesCompra = solicitudesCompra;
	}

	public Boolean getPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}
	
}
