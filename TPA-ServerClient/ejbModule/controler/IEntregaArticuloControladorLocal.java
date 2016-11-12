package controler;

import java.util.List;

import javax.ejb.Local;

import dto.ArticuloDTO;
import dto.ItemSolicitudArticuloDTO;
import dto.SolicitudArticuloDTO;

@Local
public interface IEntregaArticuloControladorLocal {

	public List <SolicitudArticuloDTO> listarSolicitudesPendientes();

	public List<ItemSolicitudArticuloDTO> obtenerItemDeSolicitud(String solicitudABuscar);

	public void actualizarSolicitudArticulo(String solicitudABuscar, String articuloBuscado, Integer nuevaCant);

	public void decrementarStock(String solicitudABuscar);

	public void actualizarEstadoSolicitud(String solicitudABuscar);

	public SolicitudArticuloDTO enviarJSON(String solicitudABuscar);
}
