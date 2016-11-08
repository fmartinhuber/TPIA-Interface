package controler;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

import dto.ArticuloDTO;
import dto.RecepcionCompraDTO;
import dto.SolicitudArticuloDTO;
import dto.SolicitudCompraDTO;

@Remote
public interface IDepositoControladorRemote {

	public void crearArticulo(ArticuloDTO articulo);
	
	public void modificarArticulo(ArticuloDTO articulo);
	
	public ArrayList<ArticuloDTO> listarArticulos();
	
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
	public ArticuloDTO obtenerArticulosPendientes();
	
	/**
	 * Se recibe de forma asincrónica la compra enviada por la Fábrica a partir de las Solicitudes de Compras. 
		Se debe registrar la Recepción de la Compra.
		Se debe actualizar el stock de artículos.
	 * @param compraDTO
	 */
	public void recepcionCompra(RecepcionCompraDTO compraDTO);
	
	/**
	 * Mediante una interfaz Web, el usuario podrá ver las Solicitudes de Artículos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las más viejas primero).
	 * @return
	 */
	public List <SolicitudCompraDTO> solicitudesPendientes();
	
	public void crearSolicitudArticulo(SolicitudArticuloDTO solicitudArticuloDTO);
}
