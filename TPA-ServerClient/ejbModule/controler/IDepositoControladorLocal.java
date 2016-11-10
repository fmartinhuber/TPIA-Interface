package controler;

import java.util.*;

import javax.ejb.Local;

import dto.*;

/**
 * @author Martin
 *
 */
@Local
public interface IDepositoControladorLocal {
	
	public void crearArticulo(ArticuloDTO articuloDTO);
	
	
	public void modificarArticulo(ArticuloDTO articuloDTO);
	
	
	public void modificarStockDelArticulo(ArticuloDTO articuloDTO);
	
	
	/**
	 * se debe listar las Solicitud de Productos pendientes. Se debe mostrar los detalles de los productos, el stock actual
	 *  y el stock solicitado. Se debe proponer una cantidad sugerida para la Solicitud de Compra. 
	 *  La cantidad sugerida debe ser el doble de la solicitada (se podrá cambiar por el operador).
	 *   Se podrá seleccionar todos o algunos artículos para la Solicitud de Compra.
	 * @return
	 */
	public void crearSolicitudCompra(SolicitudCompraDTO compraDTO);
	
	
	/**
	 * se debe listar las Solicitud de Productos pendientes. Se debe mostrar los detalles de los productos, el stock actual
	 *  y el stock solicitado. Se debe proponer una cantidad sugerida para la Solicitud de Compra. 
	 *  La cantidad sugerida debe ser el doble de la solicitada (se podrá cambiar por el operador).
	 *   Se podrá seleccionar todos o algunos artículos para la Solicitud de Compra.
	 * @return
	 */
	
	public List<SolicitudArticuloDTO> listarSolicitudArticuloPendiente();
	/**
	 * Se recibe de forma asincrónica la compra enviada por la Fábrica a partir de las Solicitudes de Compras. 
		Se debe registrar la Recepción de la Compra.
		Se debe actualizar el stock de artículos.
	 * @param compraDTO
	 */
	public void registrarRecepcionCompra(RecepcionCompraDTO compraDTO);
	
	
	/**
	 * Mediante una interfaz Web, el usuario podrá ver las Solicitudes de Artículos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las más viejas primero).
	 * @return
	 */
	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();
		
	
	public void crearRecepcionCompra(SolicitudCompraDTO solicitudCompraDTO);
	

	public void crearSolicitudArticulo(SolicitudArticuloDTO solicitudArticuloDTO);
	
	
//	public List<ArticuloDTO> listarArticulos();
//	
//	
//	public ArticuloDTO buscarArticuloPorCodigo(Integer codArticulo);
//	
//	
//	public ArticuloDTO buscarArticuloPorNombre(String nombre);
}
