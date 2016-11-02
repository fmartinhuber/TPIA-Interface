package dto;

import java.io.Serializable;
import java.util.List;


public class RecepcionCompraDTO implements Serializable{
	private Integer idRecepcionCompra;
	private String codigo; //Este atributo identifica univocamente al objeto, el id lo manejamos para nuestra base
	private SolicitudCompraDTO solicitudCompra;
	private List<ItemRecepcionCompraDTO> recepcionesCompra;
	
	
	
	public RecepcionCompraDTO(String codigo, SolicitudCompraDTO solicitudCompra,
			List<ItemRecepcionCompraDTO> recepcionesCompra) {
		super();
		this.codigo = codigo;
		this.solicitudCompra = solicitudCompra;
		this.recepcionesCompra = recepcionesCompra;
	}

	public RecepcionCompraDTO() {
		super();
	}

	
	
	public Integer getIdRecepcionCompra() {
		return idRecepcionCompra;
	}

	public void setIdRecepcionCompra(Integer idRecepcionCompra) {
		this.idRecepcionCompra = idRecepcionCompra;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public SolicitudCompraDTO getSolicitudCompra() {
		return solicitudCompra;
	}

	public void setSolicitudCompra(SolicitudCompraDTO solicitudCompra) {
		this.solicitudCompra = solicitudCompra;
	}

	public List<ItemRecepcionCompraDTO> getRecepcionesCompra() {
		return recepcionesCompra;
	}

	public void setRecepcionesCompra(List<ItemRecepcionCompraDTO> recepcionesCompra) {
		this.recepcionesCompra = recepcionesCompra;
	}

}
