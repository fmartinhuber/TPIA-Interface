package dto;

import java.io.Serializable;
import java.util.List;

public class RecepcionCompraDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idRecepcionCompra;
	private Integer codigo;
	private List<ItemRecepcionCompraDTO> recepcionesCompra;
	
	// Constructor
	
	public RecepcionCompraDTO() {}

	public Integer getIdRecepcionCompra() {
		return idRecepcionCompra;
	}

	public void setIdRecepcionCompra(Integer idRecepcionCompra) {
		this.idRecepcionCompra = idRecepcionCompra;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<ItemRecepcionCompraDTO> getRecepcionesCompra() {
		return recepcionesCompra;
	}

	public void setRecepcionesCompra(List<ItemRecepcionCompraDTO> recepcionesCompra) {
		this.recepcionesCompra = recepcionesCompra;
	}

}
