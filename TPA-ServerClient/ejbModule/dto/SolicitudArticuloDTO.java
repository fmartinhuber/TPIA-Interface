package dto;

import java.io.Serializable;
import java.util.*;

public class SolicitudArticuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer codigo; 
	private String estado; 
	private Date fechaEntrega;
	private Integer idModulo;
	
	// Constructor

	public SolicitudArticuloDTO() {}

	public SolicitudArticuloDTO(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public SolicitudArticuloDTO(Integer codigo, String estado, Date fechaEntrega, Integer idModulo) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		this.idModulo = idModulo;
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
