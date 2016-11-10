package controler;

import java.util.List;

import javax.ejb.Remote;

import dto.SolicitudArticuloDTO;

@Remote
public interface IEntregaArticuloControladorRemote {
	
	/**
	 * Mediante una interfaz Web, el usuario podrá ver las Solicitudes de Artículos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las más viejas primero).
	 * @return
	 */
	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();
}
