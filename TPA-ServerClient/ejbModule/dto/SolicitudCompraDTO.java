package dto;

import java.io.Serializable;
import java.util.*;

public class SolicitudCompraDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer codigo; 
	private List<SolicitudArticuloDTO> solicitudesArticulos;
	private List<ItemSolicitudCompraDTO> itemSolicitudesCompra;
	private RecepcionCompraDTO recepcionCompra;
	private String pendiente;
	private Date fechaCreacion;
	
	// Constructor

	public SolicitudCompraDTO() {}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<SolicitudArticuloDTO> getSolicitudesArticulos() {
		return solicitudesArticulos;
	}

	public void setSolicitudesArticulos(List<SolicitudArticuloDTO> solicitudesArticulos) {
		this.solicitudesArticulos = solicitudesArticulos;
	}

	public List<ItemSolicitudCompraDTO> getItemsSolicitudesCompra() {
		return itemSolicitudesCompra;
	}

	public void setItemsSolicitudesCompra(List<ItemSolicitudCompraDTO> solicitudesCompra) {
		this.itemSolicitudesCompra = solicitudesCompra;
	}

	public RecepcionCompraDTO getRecepcionCompra() {
		return recepcionCompra;
	}

	public void setRecepcionCompra(RecepcionCompraDTO recepcionCompra) {
		this.recepcionCompra = recepcionCompra;
	}

	public String getPendiente() {
		return pendiente;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
