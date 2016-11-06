package dto;

import java.io.Serializable;
import java.util.*;

public class SolicitudArticuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idSolicitudArticulo;	
	private Integer codigo; 
	private String estado; 
	private Date fechaEntrega;
	private Integer idModulo;
	
	// Constructor

	public SolicitudArticuloDTO() {}

	public Integer getIdSolicitudArticulo() {
		return idSolicitudArticulo;
	}

	public void setIdSolicitudArticulo(Integer idSolicitudArticulo) {
		this.idSolicitudArticulo = idSolicitudArticulo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
	
}
