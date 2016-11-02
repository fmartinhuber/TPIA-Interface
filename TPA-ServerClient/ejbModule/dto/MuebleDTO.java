package dto;

import java.io.Serializable;

public class MuebleDTO extends ArticuloDTO implements Serializable{

	private String material;
	
	public MuebleDTO(){}

	public MuebleDTO(String nombre, String codigo, String descripcion, String marca, float precio, String foto,
			String origen, String tipo, Integer stockActual, Integer stockSolicitado, String material) {
		super(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	};
	
	
}

