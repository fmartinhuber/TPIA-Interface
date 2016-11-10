package controler;

import java.util.List;

import javax.ejb.Remote;

import dto.SolicitudArticuloDTO;

@Remote
public interface IEntregaArticuloControladorRemote {
	
	/**
	 * Mediante una interfaz Web, el usuario podr� ver las Solicitudes de Art�culos no cumplidas o pendientes, 
	 * ordenadas por fecha ascendientes (las m�s viejas primero).
	 * @return
	 */
	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();
}
