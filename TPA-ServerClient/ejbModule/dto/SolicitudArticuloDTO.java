package dto;

import java.io.Serializable;
import java.util.*;


public class SolicitudArticuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo; 
	private String estado; 
	private Date fechaEntrega;
	private String idDespacho;
	private List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo;
	
	
	// Constructor

	public SolicitudArticuloDTO() {}

	public SolicitudArticuloDTO(String codigo, String estado, Date fechaEntrega, String idDespacho, List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		this.idDespacho = idDespacho;
		this.itemsSolicitudArticulo = itemsSolicitudArticulo;
	}
	
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getIdDespacho() {
		return idDespacho;
	}

	public void setIdModulo(String idDespacho) {
		this.idDespacho = idDespacho;
	}

	public List<ItemSolicitudArticuloDTO> getItemsSolicitudArticulo() {
		return itemsSolicitudArticulo;
	}

	public void setItemsSolicitudArticulo(List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo) {
		this.itemsSolicitudArticulo = itemsSolicitudArticulo;
	}

}
