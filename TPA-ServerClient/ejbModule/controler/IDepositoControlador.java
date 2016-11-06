package controler;

import java.util.ArrayList;

import dto.*;


public interface IDepositoControlador {
	
	public void crearArticulo(ArticuloDTO articulo);
	
	public void modificarArticulo(ArticuloDTO articulo);
	
	public ArrayList<ArticuloDTO> listarArticulos();
	
}
