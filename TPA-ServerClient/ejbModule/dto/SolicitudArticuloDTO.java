package dto;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collector;


public class SolicitudArticuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo; 
	private String estado; 
	private Date fechaEntrega;
	private Integer idModulo;
	private List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo;
	
	
	// Constructor

	public SolicitudArticuloDTO() {}

	public SolicitudArticuloDTO(String codigo, String estado, Date fechaEntrega, Integer idModulo, List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		this.idModulo = idModulo;
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

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public List<ItemSolicitudArticuloDTO> getItemsSolicitudArticulo() {
		return itemsSolicitudArticulo;
	}

	public void setItemsSolicitudArticulo(List<ItemSolicitudArticuloDTO> itemsSolicitudArticulo) {
		this.itemsSolicitudArticulo = itemsSolicitudArticulo;
	}

}
