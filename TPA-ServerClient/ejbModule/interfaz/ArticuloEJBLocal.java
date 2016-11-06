package interfaz;

import java.util.*;

import javax.ejb.Local;

import dto.ArticuloDTO;

@Local
public interface ArticuloEJBLocal {
	
	public void persist(ArticuloDTO articulo);
	
	public void remove(ArticuloDTO articulo);
	
	public void update(ArticuloDTO articulo);
			
	public List<ArticuloDTO> listarArticulos();
	
	public ArticuloDTO buscarArticuloPorCodigo(Integer codArticulo);
	
	public ArticuloDTO buscarArticuloPorNombre(String nombre);

}
