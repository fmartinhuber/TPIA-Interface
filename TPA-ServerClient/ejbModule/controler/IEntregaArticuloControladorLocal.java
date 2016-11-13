package controler;

import java.util.List;

import javax.ejb.Local;

import dto.ArticuloDTO;
import dto.ItemSolicitudArticuloDTO;
import dto.SolicitudArticuloDTO;

@Local
public interface IEntregaArticuloControladorLocal {

	//Obtengo la lista de Solicitudes de Articulos para mostrar por pantalla
	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();

	//Obtengo la lista de ItemSolicitudes de Articulo de una Solicitud para mostrar por pantalla
	public List<ItemSolicitudArticuloDTO> obtenerItemDeSolicitud(String solicitudABuscar);

	//Actualizo un Articulo de una Solicitud por una cierta Cantidad
	public void actualizarSolicitudArticulo(String solicitudABuscar, String articuloBuscado, Integer nuevaCant);

	//Decremento del Stock todos los ItemArticulo de la Solicitud pasada
	public void decrementarStock(String solicitudABuscar);

	//Actualizo el Estado de una Solicitud de Pendiente a Entregada
	public void actualizarEstadoSolicitud(String solicitudABuscar);

	//Obtengo la Solicitud que sera enviada a Despacho por REST+JSON
	public SolicitudArticuloDTO obtenerSolicitudAEnviarADespacho(String solicitudABuscar);
	
	//SOLICITUD DE COMPRA: Paso un Array con formato "CodigoSolicitud;CodigoArticulo;Cantidad" para que se genere la Solicitud de Compra
	public void generarSolicitudCompra(List<String> elementos);
}
