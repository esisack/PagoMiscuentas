package ar.com.midinamica.pagomiscuentas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LOG_PAGOS")
public class LogPago {

	@Id
	@Column(name = "LOG_PAGO_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int logPagoId;

	@Column(name = "PRESTADORA_ID")
	private Integer prestadoraId;

	@Column(name = "DOCUMENTO")
	private Integer documento;
	
	@Column(name = "OPERACION")
	private String operacion;
	
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "MONTO")
	private BigDecimal monto;

	@Column(name = "MENSAJE")
	private String mensaje;

	public int getLogPagoId() {
		return logPagoId;
	}

	public void setLogPagoId(int logPagoId) {
		this.logPagoId = logPagoId;
	}

	public Integer getPrestadoraId() {
		return prestadoraId;
	}

	public void setPrestadoraId(Integer prestadoraId) {
		this.prestadoraId = prestadoraId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
