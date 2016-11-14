package controler;

import java.util.*;

import javax.ejb.Remote;

import dto.*;

@Remote
public interface IDepositoControladorRemote {

	public void crearArticulo(ArticuloDTO articuloDTO);
	
	public void modificarArticulo(ArticuloDTO articuloDTO);
	
	public void modificarStockDelArticulo(ArticuloDTO articuloDTO);
	
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
	public List<SolicitudArticuloDTO> listarSolicitudArticuloPendiente();
	
	
	public void crearSolicitudArticulo(String messageText);
	
	
	public void crearRecepcionCompra(SolicitudCompraDTO solicitudCompraDTO);

	
	public ArticuloDTO obtenerArticuloPorCodigo(String codArticulo);
	
	
	//public ArticuloDTO buscarArticuloPorCodigo(Integer codArticulo);
	
	
	//public List<ArticuloDTO> listarArticulos();
	
	
//	/**
//	 * Se recibe de forma asincr�nica la compra enviada por la F�brica a partir de las Solicitudes de Compras. 
//		Se debe registrar la Recepci�n de la Compra.
//		Se debe actualizar el stock de art�culos.
//	 * @param compraDTO
//	 */
//	public void registrarRecepcionCompra(RecepcionCompraDTO compraDTO);
}
