package ar.com.midinamica.pagomiscuentas.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENTIDADES")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "entidadId", scope = Integer.class)
public class Entidad {

	@Id
	@Column(name = "ENTIDAD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int entidadId;

	@Column(name = "ENTIDAD_CODIGO")
	private String entidadCodigo;

	@Column
	private long documento;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private BigDecimal billetera;

	@Column(name = "ANTICIPO")
	private BigDecimal pendienteAcreditacion;

	@Column(name = "MARGEN")
	private BigDecimal prestamoDisponible;

	@Column(name = "SALDO")
	private BigDecimal creditoAdeudado;

	@Column
	private long telefono;

	@Column
	private long celular;

	@Column
	private String logo;


	
	public Entidad() {
		super();

	}

	public int getEntidadId() {
		return entidadId;
	}

	public void setEntidadId(int entidadId) {
		this.entidadId = entidadId;
	}

	public String getEntidadCodigo() {
		return entidadCodigo;
	}

	public void setEntidadCodigo(String entidadCodigo) {
		this.entidadCodigo = entidadCodigo;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getBilletera() {
		return billetera;
	}

	public void setBilletera(BigDecimal billetera) {
		this.billetera = billetera;
	}

	public BigDecimal getPendienteAcreditacion() {
		return pendienteAcreditacion;
	}

	public void setPendienteAcreditacion(BigDecimal pendienteAcreditacion) {
		this.pendienteAcreditacion = pendienteAcreditacion;
	}

	public BigDecimal getPrestamoDisponible() {
		return prestamoDisponible;
	}

	public void setPrestamoDisponible(BigDecimal prestamoDisponible) {
		this.prestamoDisponible = prestamoDisponible;
	}

	public BigDecimal getCreditoAdeudado() {
		return creditoAdeudado;
	}

	public void setCreditoAdeudado(BigDecimal creditoAdeudado) {
		this.creditoAdeudado = creditoAdeudado;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
