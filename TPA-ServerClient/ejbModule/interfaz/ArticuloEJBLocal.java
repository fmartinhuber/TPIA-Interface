package interfaz;

import java.util.List;

import javax.ejb.Local;

import dto.ArticuloDTO;

@Local
public interface ArticuloEJBLocal {
	
	//public void addArticulo(ArticuloDTO art);
	
	public void crearArticulo(ArticuloDTO articulo);
	
	public List<ArticuloDTO> listarArticulos();

}
