package dto;

import java.io.Serializable;


public class ModaDTO extends ArticuloDTO implements Serializable{

	private String color;
	private String talle;
	
	public ModaDTO(){}

	public ModaDTO(String nombre, String codigo, String descripcion, String marca, float precio, String foto,
			String origen, String tipo, Integer stockActual, Integer stockSolicitado, String color,
			String talle) {
		super(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado);
		this.color = color;
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	};
	
	
	
	
}
