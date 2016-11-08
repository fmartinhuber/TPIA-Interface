package dto;

import java.io.Serializable;
import java.util.Date;

public class ArticuloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idDeposito; 	
	private Integer codArticulo;
	private String nombre;
	private String descripcion;	
	private String marca;
	private Float precio;
	private String foto;
	private String origen;	
	private String tipo;
	private Date fecha;	
	private String edadRecomendada;
	private String fichaTecnica;
	private String color;
	private String talle;
	private String material;
	private Integer cantidadDisponible;

	// Constructor 
	
	public ArticuloDTO() {}
	
	public ArticuloDTO(String idDeposito, Integer codArticulo, String nombre, String descripcion, String marca,
			Float precio, String foto, String origen, String tipo, Date fecha, String edadRecomendada,
			String fichaTecnica, String color, String talle, String material, Integer cantidadDisponible) {
		super();
		this.idDeposito = idDeposito;
		this.codArticulo = codArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.foto = foto;
		this.origen = origen;
		this.tipo = tipo;
		this.fecha = fecha;
		this.edadRecomendada = edadRecomendada;
		this.fichaTecnica = fichaTecnica;
		this.color = color;
		this.talle = talle;
		this.material = material;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(String idDeposito) {
		this.idDeposito = idDeposito;
	}

	public Integer getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(Integer codArticulo) {
		this.codArticulo = codArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	public void setEdadRecomendada(String edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}

	public String getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(Integer cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
