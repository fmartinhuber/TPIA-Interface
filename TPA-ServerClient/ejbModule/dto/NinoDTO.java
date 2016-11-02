package dto;

import java.io.Serializable;

public class NinoDTO extends ArticuloDTO implements Serializable{

	private Integer edadRecomendada;

	public NinoDTO() {
	}

	public NinoDTO(String nombre, String codigo, String descripcion, String marca, float precio, String foto,
			String origen, String tipo, Integer stockActual, Integer stockSolicitado, Integer edadRecomendada) {
		super(nombre, codigo, descripcion, marca, precio, foto, origen, tipo, stockActual, stockSolicitado);
		this.edadRecomendada = edadRecomendada;
	}
}
