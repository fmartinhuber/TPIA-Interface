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
	 *  La cantidad sugerida debe ser el doble de la solicitada (se podr� cambiar por el operador).
	 *   Se podr� seleccionar todos o algunos art�culos para la Solicitud de Compra.
	 * @return
	 */
	public void crearSolicitudCompra(SolicitudCompraDTO compraDTO);
	
	/**
	 * se debe listar las Solicitud de Productos pendientes. Se debe mostrar los detalles de los productos, el stock actual
	 *  y el stock solicitado. Se debe proponer una cantidad sugerida para la Solicitud de Compra. 
	 *  La cantidad sugerida debe ser el doble de la solicitada (se podr� cambiar por el operador).
	 *   Se podr� seleccionar todos o algunos art�culos para la Solicitud de Compra.
	 * @return
	 */
	public ArticuloDTO obtenerArticulosPendientes();
	
	/**
	 * Se recibe de forma asincr�nica la compra enviada por la F�brica a partir de las Solicitudes de Compras. 
		Se debe registrar la Recepci�n de la Compra.
		Se debe actualizar el stock de art�culos.
	 * @param compraDTO
	 */
	public void recepcionCompra(RecepcionCompraDTO compraDTO);
	
	/**
	 * Mediante una interfaz Web, el usuario podr� ver las Solicitudes de Art�culos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las m�s viejas primero).
	 * @return
	 */
	public List <SolicitudCompraDTO> solicitudesPendientes();
	
	public void crearSolicitudArticulo(SolicitudArticuloDTO solicitudArticuloDTO);
}
