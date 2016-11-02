package dto;

import java.io.Serializable;

public class ElectrodomesticoDTO extends ArticuloDTO implements Serializable{

	private String fichaTecnica;
	
	public ElectrodomesticoDTO(){}

	public ElectrodomesticoDTO(String nombre, String codigo, String descripcion, String marca, float precio,
			String foto, String origen, String tipo, Integer stockActual, Integer stockSolicitado, String fichaTecnica) {
		super(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado);
		this.fichaTecnica = fichaTecnica;
	}

	public String getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	};
	
	
	
}
