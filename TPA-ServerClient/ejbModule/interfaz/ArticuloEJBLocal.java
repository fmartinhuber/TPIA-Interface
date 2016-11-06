package interfaz;

import java.util.*;

import javax.ejb.Local;

import dto.ArticuloDTO;

@Local
public interface ArticuloEJBLocal {
	
	public List<ArticuloDTO> listarArticulos();
	
	public ArticuloDTO buscarArticuloPorCodigo(Integer codArticulo);
	
	public ArticuloDTO buscarArticuloPorNombre(String nombre);

}
