package controler;

import java.util.List;

import javax.ejb.Local;

import dto.ArticuloDTO;
import dto.ItemSolicitudArticuloDTO;
import dto.SolicitudArticuloDTO;

@Local
public interface IEntregaArticuloControladorLocal {

	/**
	 * Mediante una interfaz Web, el usuario podr� ver las Solicitudes de Art�culos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las m�s viejas primero).
	 * @return
	 */
	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();

	public List<ItemSolicitudArticuloDTO> obtenerItemDeSolicitud(String solicitudABuscar);
}
