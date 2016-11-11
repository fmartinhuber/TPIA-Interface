package dto;

import java.io.Serializable;
import java.util.List;

public class RecepcionCompraDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private List<ItemRecepcionCompraDTO> recepcionesCompra;
	private List<SolicitudCompraDTO> solicitudesCompra;
	

	
	public RecepcionCompraDTO() {
		
	}

	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<ItemRecepcionCompraDTO> getRecepcionesCompra() {
		return recepcionesCompra;
	}

	public void setRecepcionesCompra(List<ItemRecepcionCompraDTO> recepcionesCompra) {
		this.recepcionesCompra = recepcionesCompra;
	}

	public List<SolicitudCompraDTO> getSolicitudesCompra() {
		return solicitudesCompra;
	}

	public void setSolicitudesCompra(List<SolicitudCompraDTO> solicitudesCompra) {
		this.solicitudesCompra = solicitudesCompra;
	}

}
