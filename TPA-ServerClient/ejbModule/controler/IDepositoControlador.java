package controler;

import java.util.ArrayList;

import dto.ArticuloDTO;
import dto.MuebleDTO;


public interface IDepositoControlador {

	public ArrayList<MuebleDTO> listarMuebles();
	
	public void crearArticulo(ArticuloDTO articulo);
	
	public void modificarArticulo(ArticuloDTO articulo);
	
	public void modificarStockDelArticulo(ArticuloDTO articulo);
	
	
}
