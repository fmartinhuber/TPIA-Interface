package dto;

import java.io.Serializable;
import java.util.*;

public class SolicitudArticuloDTO implements Serializable{
	private Integer idSolicitudArticulo;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	private Boolean pendiente; // (No cumplidas/Pendientes = FALSE - Cumplidas = TRUE)
	private Date fecha;
	
	
	public SolicitudArticuloDTO(String codigo, Boolean pendiente, Date fecha) {
		super();
		this.codigo = codigo;
		this.pendiente = pendiente;
		this.fecha = fecha;
	}

	public SolicitudArticuloDTO() {
		super();
	}

	public Integer getIdSolicitudArticulo() {
		return idSolicitudArticulo;
	}

	public void setIdSolicitudArticulo(Integer idSolicitudArticulo) {
		this.idSolicitudArticulo = idSolicitudArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Boolean getPendiente() {
		return pendiente;
	}

	public void setPendiente(Boolean pendiente) {
		this.pendiente = pendiente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
		
}
