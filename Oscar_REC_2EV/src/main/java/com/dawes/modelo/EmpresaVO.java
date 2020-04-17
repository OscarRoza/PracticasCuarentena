package com.dawes.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempresa;
	private String denominacion;
	@OneToMany(mappedBy = "denominacion", fetch = FetchType.EAGER, orphanRemoval = true)
	private List<ImpuestosVO> listaimpuestos;

	public EmpresaVO(int idempresa, String denominacion, List<ImpuestosVO> listaimpuestos) {
		super();
		this.idempresa = idempresa;
		this.denominacion = denominacion;
		this.listaimpuestos = new ArrayList();
	}

	public EmpresaVO(String denominacion, List<ImpuestosVO> listaimpuestos) {
		super();
		this.denominacion = denominacion;
		this.listaimpuestos = new ArrayList();
	}

	public EmpresaVO() {
		super();
	}

	public int getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public List<ImpuestosVO> getlistaimpuestos() {
		return listaimpuestos;
	}

	public void setlistaimpuestos(List<ImpuestosVO> listaimpuestos) {
		this.listaimpuestos = listaimpuestos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + idempresa;
		result = prime * result + ((listaimpuestos == null) ? 0 : listaimpuestos.hashCode());
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
		EmpresaVO other = (EmpresaVO) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (idempresa != other.idempresa)
			return false;
		if (listaimpuestos == null) {
			if (other.listaimpuestos != null)
				return false;
		} else if (!listaimpuestos.equals(other.listaimpuestos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmpresaVO [idempresa=" + idempresa + ", denominacion=" + denominacion + ", listaimpuestos="
				+ listaimpuestos + "]";
	}

}
