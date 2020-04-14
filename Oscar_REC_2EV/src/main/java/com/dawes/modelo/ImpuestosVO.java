package com.dawes.modelo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "impuestos")
public class ImpuestosVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idimpuestos;
	private int baseimponible;
	private LocalDate fecha;
	@ManyToOne
	@JoinColumn(name = "idempresa")
	private EmpresaVO denominacion;

	public ImpuestosVO(int idimpuestos, int baseimponible, LocalDate fecha, EmpresaVO denominacion) {
		super();
		this.idimpuestos = idimpuestos;
		this.baseimponible = baseimponible;
		this.fecha = fecha;
		this.denominacion = denominacion;
	}

	public ImpuestosVO(int baseimponible, LocalDate fecha, EmpresaVO denominacion) {
		super();
		this.baseimponible = baseimponible;
		this.fecha = fecha;
		this.denominacion = denominacion;
	}

	public ImpuestosVO() {
		super();
	}

	public int getIdimpuestos() {
		return idimpuestos;
	}

	public void setIdimpuestos(int idimpuestos) {
		this.idimpuestos = idimpuestos;
	}

	public int getBaseimponible() {
		return baseimponible;
	}

	public void setBaseimponible(int baseimponible) {
		this.baseimponible = baseimponible;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public EmpresaVO getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(EmpresaVO denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baseimponible;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idimpuestos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImpuestosVO other = (ImpuestosVO) obj;
		if (baseimponible != other.baseimponible)
			return false;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idimpuestos != other.idimpuestos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ImpuestosVO [idimpuestos=" + idimpuestos + ", baseimponible=" + baseimponible + ", fecha=" + fecha
				+ ", denominacion=" + denominacion + "]";
	}

}
